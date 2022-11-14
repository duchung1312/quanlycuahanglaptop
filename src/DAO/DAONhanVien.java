/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.NhanVien;
import Entity.ThongTinMay;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Đức Hùng
 */
public class DAONhanVien {
    public static List<NhanVien> getAllNV() throws SQLException, ClassNotFoundException
    {
        List<NhanVien> lstKetqua = new ArrayList<>();      
        //--- Kết nối CSDL, lấy dữ liệu
        Connection cnn = tienich.TienIch.getConnection();
        //-- Xây dựng câu lệnh truy vấn
        String sql = "select * from NhanVien";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = cnn.prepareStatement(sql);
        ResultSet rs = pStmt.executeQuery();
        while(rs.next())
        {
            NhanVien s = new NhanVien();
            s.setManv(rs.getString("manv"));
            s.setTennv(rs.getString("tennv"));
            s.setGioitinh(rs.getString("gioitinh"));
            s.setSdt(rs.getInt("sdt"));
            s.setDiachi(rs.getString("diachi"));
            lstKetqua.add(s);
        }
        return lstKetqua;
        
    }
    // get One
    public static List<NhanVien> getOneNV(int _manv) throws SQLException, ClassNotFoundException
    {
        List<NhanVien> lstKetqua = new ArrayList<>();      
        //--- Kết nối CSDL, lấy dữ liệu
        Connection cnn = tienich.TienIch.getConnection();
        //-- Xây dựng câu lệnh truy vấn
        String sql = "select * from NhanVien where manv = '"+_manv+"'";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = cnn.prepareStatement(sql);
        ResultSet rs = pStmt.executeQuery();
        while(rs.next())
        {
            NhanVien s = new NhanVien();
            s.setManv(rs.getString("manv"));
            s.setTennv(rs.getString("tennv"));
            s.setGioitinh(rs.getString("gioitinh"));
            s.setSdt(rs.getInt("sdt"));
            s.setDiachi(rs.getString("diachi"));
            lstKetqua.add(s);
        }
        return lstKetqua;
        
    }
    // Delete One   
    public static void DeleteNV(String _manv) throws SQLException, ClassNotFoundException
    {
        // Mở kết nối - xác định câu lệnh truy vấn -> thực thi
        Connection conn = tienich.TienIch.getConnection();
        String sql = "delete from NhanVien where manv = '"+_manv+"'";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = conn.prepareStatement(sql);
        pStmt.executeUpdate();
        tienich.TienIch.closePreparedStatement(pStmt);
        tienich.TienIch.closeConnection(conn);
    }
    // Update One
    public static void UpdateNV(NhanVien s) throws SQLException, ClassNotFoundException
    {
        // Mở kết nối - xác định câu lệnh truy vấn -> thực thi
        Connection conn = tienich.TienIch.getConnection();
        String sql = "update NhanVien set tennv = N'"+s.getTennv()+"',sdt = '"+s.getSdt()+"',gioitinh = '"+s.getGioitinh()+"',diachi='"+s.getDiachi()+"' where manv = '"+s.getManv()+"'";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = conn.prepareStatement(sql);
        pStmt.executeUpdate();
        tienich.TienIch.closePreparedStatement(pStmt);
        tienich.TienIch.closeConnection(conn);
    }
    // Insert One
    public static void InsertNV(NhanVien s) throws SQLException, ClassNotFoundException
    {
        // Mở kết nối - xác định câu lệnh truy vấn -> thực thi
        Connection conn = tienich.TienIch.getConnection();
        //-- Xác định câu lệnh truy vấn
        String sql = "insert into NhanVien(manv,tennv,gioitinh,sdt,diachi) values ('"+s.getManv()+"','"+s.getTennv()+"','"+s.getGioitinh()+"','"+s.getSdt()+"','"+s.getDiachi()+"')";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = conn.prepareStatement(sql);
        pStmt.executeUpdate();
        // đóng kết nối
        tienich.TienIch.closePreparedStatement(pStmt);
        tienich.TienIch.closeConnection(conn);
    }
    public static List<NhanVien> getAllMTbyName(String _keywords) throws SQLException, ClassNotFoundException
    {
        List<NhanVien> lstKetqua = new ArrayList<>();      
        //--- Kết nối CSDL, lấy dữ liệu
        Connection cnn = tienich.TienIch.getConnection();
        //-- Xây dựng câu lệnh truy vấn
        String sql = "select * from NhanVien where tennv like '%"+_keywords+"%'";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = cnn.prepareStatement(sql);
        ResultSet rs = pStmt.executeQuery();
        while(rs.next())
        {
            NhanVien s = new NhanVien();
            s.setManv(rs.getString("manv"));
            s.setTennv(rs.getString("tennv"));
            s.setGioitinh(rs.getString("gioitinh"));
            s.setSdt(rs.getInt("sdt"));
            s.setDiachi(rs.getString("diachi"));
            lstKetqua.add(s);
        }
        return lstKetqua;
        
    }
}
