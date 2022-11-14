/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.HoaDonNhap;
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
public class DAOHoaDonNhap {
    public static List<HoaDonNhap> getAll() throws SQLException, ClassNotFoundException
    {
        List<HoaDonNhap> lstKetqua = new ArrayList<>();      
        //--- Kết nối CSDL, lấy dữ liệu
        Connection cnn = tienich.TienIch.getConnection();
        //-- Xây dựng câu lệnh truy vấn
        String sql = "select * from HoaDonNhap";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = cnn.prepareStatement(sql);
        ResultSet rs = pStmt.executeQuery();
        while(rs.next())
        {
            HoaDonNhap s = new HoaDonNhap();
            s.setMahdn(rs.getString("mahdn"));
            s.setManv(rs.getString("manv"));
            s.setMamt(rs.getString("mamt"));
            s.setMath(rs.getString("math"));
            s.setSoluong(rs.getInt("soluong"));
            s.setNgaynhap(rs.getString("ngaynhap"));
            s.setDiachi(rs.getString("diachi"));
            s.setSdt(rs.getInt("sdt"));
            s.setDongia(rs.getInt("dongia"));
            s.setTongtien(rs.getInt("tongtien"));
            lstKetqua.add(s);
        }
        return lstKetqua;
        
    }
    // get One
    public static List<HoaDonNhap> getOne(int _mahdn) throws SQLException, ClassNotFoundException
    {
        List<HoaDonNhap> lstKetqua = new ArrayList<>();      
        //--- Kết nối CSDL, lấy dữ liệu
        Connection cnn = tienich.TienIch.getConnection();
        //-- Xây dựng câu lệnh truy vấn
        String sql = "select * from HoaDonNhap where mahdn = '"+_mahdn+"'";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = cnn.prepareStatement(sql);
        ResultSet rs = pStmt.executeQuery();
        while(rs.next())
        {
            HoaDonNhap s = new HoaDonNhap();
            s.setMahdn(rs.getString("mahdn"));
            s.setManv(rs.getString("manv"));
            s.setMamt(rs.getString("mamt"));
            s.setMath(rs.getString("math"));
            s.setSoluong(rs.getInt("soluong"));
            s.setNgaynhap(rs.getString("ngaynhap"));
            s.setDiachi(rs.getString("diachi"));
            s.setSdt(rs.getInt("sdt"));
            s.setDongia(rs.getInt("dongia"));
            s.setTongtien(rs.getInt("tongtien"));
            lstKetqua.add(s);
        }
        return lstKetqua;
        
    }
    // Delete One   
    public static void Delete(String _mahdn) throws SQLException, ClassNotFoundException
    {
        // Mở kết nối - xác định câu lệnh truy vấn -> thực thi
        Connection conn = tienich.TienIch.getConnection();
        String sql = "delete from HoaDonNhap where mahdn = '"+_mahdn+"'";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = conn.prepareStatement(sql);
        pStmt.executeUpdate();
        tienich.TienIch.closePreparedStatement(pStmt);
        tienich.TienIch.closeConnection(conn);
    }
    // Update One
    public static void Update(HoaDonNhap s) throws SQLException, ClassNotFoundException
    {
        // Mở kết nối - xác định câu lệnh truy vấn -> thực thi
        Connection conn = tienich.TienIch.getConnection();
        String sql = "update HoaDonNhap set mahdn = N'"+s.getMahdn()+"',mamt='"+s.getMamt()+"',math='"+s.getMath()+"',soluong='"+s.getSoluong()+"',ngaynhap='"+s.getNgaynhap()+"',diachi='"+s.getDiachi()+"',sdt='"+s.getSdt()+"',dongia='"+s.getDongia()+"',tongtien='"+s.getTongtien()+"' where mahdn = '"+s.getMahdn()+"'";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = conn.prepareStatement(sql);
        pStmt.executeUpdate();
        tienich.TienIch.closePreparedStatement(pStmt);
        tienich.TienIch.closeConnection(conn);
    }
    // Insert One
    public static void Insert(HoaDonNhap s) throws SQLException, ClassNotFoundException
    {
        // Mở kết nối - xác định câu lệnh truy vấn -> thực thi
        Connection conn = tienich.TienIch.getConnection();
        //-- Xác định câu lệnh truy vấn
        String sql = "insert into HoaDonNhap(mahdn,manv,mamt,math,soluong,ngaynhap,diachi,sdt,dongia,tongtien) values ('"+s.getMahdn()+"','"+s.getManv()+"','"+s.getMamt()+"','"+s.getMath()+"','"+s.getSoluong()+"','"+s.getNgaynhap()+"','"+s.getDiachi()+"','"+s.getSdt()+"','"+s.getDongia()+"','"+s.getTongtien()+"')";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = conn.prepareStatement(sql);
        pStmt.executeUpdate();
        // đóng kết nối
        tienich.TienIch.closePreparedStatement(pStmt);
        tienich.TienIch.closeConnection(conn);
    }
    public static List<HoaDonNhap> getAllMTbyName(String _keywords) throws SQLException, ClassNotFoundException
    {
        List<HoaDonNhap> lstKetqua = new ArrayList<>();      
        //--- Kết nối CSDL, lấy dữ liệu
        Connection cnn = tienich.TienIch.getConnection();
        //-- Xây dựng câu lệnh truy vấn
        String sql = "select * from HoaDonNhap where mahdn like '%"+_keywords+"%'";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = cnn.prepareStatement(sql);
        ResultSet rs = pStmt.executeQuery();
        while(rs.next())
        {
            HoaDonNhap s = new HoaDonNhap();
            s.setMahdn(rs.getString("mahdn"));
            s.setManv(rs.getString("manv"));
            s.setMamt(rs.getString("mamt"));
            s.setMath(rs.getString("math"));
            s.setSoluong(rs.getInt("soluong"));
            s.setNgaynhap(rs.getString("ngaynhap"));
            s.setDiachi(rs.getString("diachi"));
            s.setSdt(rs.getInt("sdt"));
            s.setDongia(rs.getInt("dongia"));
            s.setTongtien(rs.getInt("tongtien"));
            lstKetqua.add(s);
        }
        return lstKetqua;
        
    }
}
