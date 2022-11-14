/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.KhachHang;
import Entity.NhanVien;
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
public class DAOKhachHang {
    public static List<KhachHang> getAllKH() throws SQLException, ClassNotFoundException
    {
        List<KhachHang> lstKetqua = new ArrayList<>();      
        //--- Kết nối CSDL, lấy dữ liệu
        Connection cnn = tienich.TienIch.getConnection();
        //-- Xây dựng câu lệnh truy vấn
        String sql = "select * from KhachHang";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = cnn.prepareStatement(sql);
        ResultSet rs = pStmt.executeQuery();
        while(rs.next())
        {
            KhachHang s = new KhachHang();
            s.setMaKh(rs.getString("makh"));
            s.setTenKh(rs.getString("tenkh"));
            s.setGioitinh(rs.getString("gioitinh"));
            s.setSdt(rs.getInt("sdt"));
            s.setDiachi(rs.getString("diachi"));
            lstKetqua.add(s);
        }
        return lstKetqua;
        
    }
    // get One
    public static List<KhachHang> getOneKH(int _makh) throws SQLException, ClassNotFoundException
    {
        List<KhachHang> lstKetqua = new ArrayList<>();      
        //--- Kết nối CSDL, lấy dữ liệu
        Connection cnn = tienich.TienIch.getConnection();
        //-- Xây dựng câu lệnh truy vấn
        String sql = "select * from KhachHang where makh = '"+_makh+"'";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = cnn.prepareStatement(sql);
        ResultSet rs = pStmt.executeQuery();
        while(rs.next())
        {
            KhachHang s = new KhachHang();
            s.setMaKh(rs.getString("makh"));
            s.setTenKh(rs.getString("tenkh"));
            s.setGioitinh(rs.getString("gioitinh"));
            s.setSdt(rs.getInt("sdt"));
            s.setDiachi(rs.getString("diachi"));
            lstKetqua.add(s);
        }
        return lstKetqua;
        
    }
    // Delete One   
    public static void DeleteKH(String _makh) throws SQLException, ClassNotFoundException
    {
        // Mở kết nối - xác định câu lệnh truy vấn -> thực thi
        Connection conn = tienich.TienIch.getConnection();
        String sql = "delete from KhachHang where makh = '"+_makh+"'";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = conn.prepareStatement(sql);
        pStmt.executeUpdate();
        tienich.TienIch.closePreparedStatement(pStmt);
        tienich.TienIch.closeConnection(conn);
    }
    // Update One
    public static void UpdateKH(KhachHang s) throws SQLException, ClassNotFoundException
    {
        // Mở kết nối - xác định câu lệnh truy vấn -> thực thi
        Connection conn = tienich.TienIch.getConnection();
        String sql = "update KhachHang set tenkh = N'"+s.getTenKh()+"',sdt = '"+s.getSdt()+"',gioitinh = '"+s.getGioitinh()+"',diachi='"+s.getDiachi()+"' where makh = '"+s.getMaKh()+"'";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = conn.prepareStatement(sql);
        pStmt.executeUpdate();
        tienich.TienIch.closePreparedStatement(pStmt);
        tienich.TienIch.closeConnection(conn);
    }
    // Insert One
    public static void InsertKH(KhachHang s) throws SQLException, ClassNotFoundException
    {
        // Mở kết nối - xác định câu lệnh truy vấn -> thực thi
        Connection conn = tienich.TienIch.getConnection();
        //-- Xác định câu lệnh truy vấn
        String sql = "insert into KhachHang(makh,tenkh,gioitinh,sdt,diachi) values ('"+s.getMaKh()+"','"+s.getTenKh()+"','"+s.getGioitinh()+"','"+s.getSdt()+"','"+s.getDiachi()+"')";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = conn.prepareStatement(sql);
        pStmt.executeUpdate();
        // đóng kết nối
        tienich.TienIch.closePreparedStatement(pStmt);
        tienich.TienIch.closeConnection(conn);
    }
    public static List<KhachHang> getAllMTbyName(String _keywords) throws SQLException, ClassNotFoundException
    {
        List<KhachHang> lstKetqua = new ArrayList<>();      
        //--- Kết nối CSDL, lấy dữ liệu
        Connection cnn = tienich.TienIch.getConnection();
        //-- Xây dựng câu lệnh truy vấn
        String sql = "select * from KhachHang where tenkh like '%"+_keywords+"%'";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = cnn.prepareStatement(sql);
        ResultSet rs = pStmt.executeQuery();
        while(rs.next())
        {
            KhachHang s = new KhachHang();
            s.setMaKh(rs.getString("makh"));
            s.setTenKh(rs.getString("tenkh"));
            s.setGioitinh(rs.getString("gioitinh"));
            s.setSdt(rs.getInt("sdt"));
            s.setDiachi(rs.getString("diachi"));
            lstKetqua.add(s);
        }
        return lstKetqua;
        
    }
}
