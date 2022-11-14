/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.HoaDonBan;
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
public class DAOHoaDonBan {
    public static List<HoaDonBan> getAll() throws SQLException, ClassNotFoundException
    {
        List<HoaDonBan> lstKetqua = new ArrayList<>();      
        //--- Kết nối CSDL, lấy dữ liệu
        Connection cnn = tienich.TienIch.getConnection();
        //-- Xây dựng câu lệnh truy vấn
        String sql = "select * from HoaDonXuat";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = cnn.prepareStatement(sql);
        ResultSet rs = pStmt.executeQuery();
        while(rs.next())
        {
            HoaDonBan s = new HoaDonBan();
            s.setMahdb(rs.getString("mahdb"));
            s.setMakh(rs.getString("makh"));
            s.setManv(rs.getString("manv"));
            s.setMamt(rs.getString("mamt"));
            s.setMath(rs.getString("math"));
            s.setSoluong(rs.getInt("soluong"));
            s.setNgayban(rs.getString("ngayban"));
            s.setDiachi(rs.getString("diachi"));
            s.setSdt(rs.getInt("sdt"));
            s.setDongia(rs.getInt("dongia"));
            s.setTongtien(rs.getInt("tongtien"));
            lstKetqua.add(s);
        }
        return lstKetqua;
        
    }
    // get One
    public static List<HoaDonBan> getOne(int _mahdb) throws SQLException, ClassNotFoundException
    {
        List<HoaDonBan> lstKetqua = new ArrayList<>();      
        //--- Kết nối CSDL, lấy dữ liệu
        Connection cnn = tienich.TienIch.getConnection();
        //-- Xây dựng câu lệnh truy vấn
        String sql = "select * from HoaDonXuat where mahdb = '"+_mahdb+"'";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = cnn.prepareStatement(sql);
        ResultSet rs = pStmt.executeQuery();
        while(rs.next())
        {
            HoaDonBan s = new HoaDonBan();
            s.setMahdb(rs.getString("mahdb"));
            s.setMakh(rs.getString("makh"));
            s.setManv(rs.getString("manv"));
            s.setMamt(rs.getString("mamt"));
            s.setMath(rs.getString("math"));
            s.setSoluong(rs.getInt("soluong"));
            s.setNgayban(rs.getString("ngaynhap"));
            s.setDiachi(rs.getString("diachi"));
            s.setSdt(rs.getInt("sdt"));
            s.setDongia(rs.getInt("dongia"));
            s.setTongtien(rs.getInt("tongtien"));
            lstKetqua.add(s);
        }
        return lstKetqua;
        
    }
    // Delete One   
    public static void Delete(String _mahdb) throws SQLException, ClassNotFoundException
    {
        // Mở kết nối - xác định câu lệnh truy vấn -> thực thi
        Connection conn = tienich.TienIch.getConnection();
        String sql = "delete from HoaDonXuat where mahdb = '"+_mahdb+"'";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = conn.prepareStatement(sql);
        pStmt.executeUpdate();
        tienich.TienIch.closePreparedStatement(pStmt);
        tienich.TienIch.closeConnection(conn);
    }
    // Update One
    public static void Update(HoaDonBan s) throws SQLException, ClassNotFoundException
    {
        // Mở kết nối - xác định câu lệnh truy vấn -> thực thi
        Connection conn = tienich.TienIch.getConnection();
        String sql = "update HoaDonXuat set mahdb = N'"+s.getMahdb()+"',makh= N'"+s.getMakh()+"',mamt='"+s.getMamt()+"',math='"+s.getMath()+"',soluong='"+s.getSoluong()+"',ngayban='"+s.getNgayban()+"',diachi='"+s.getDiachi()+"',sdt='"+s.getSdt()+"',dongia='"+s.getDongia()+"',tongtien='"+s.getTongtien()+"' where mahdb = '"+s.getMahdb()+"'";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = conn.prepareStatement(sql);
        pStmt.executeUpdate();
        tienich.TienIch.closePreparedStatement(pStmt);
        tienich.TienIch.closeConnection(conn);
    }
    // Insert One
    public static void Insert(HoaDonBan s) throws SQLException, ClassNotFoundException
    {
        // Mở kết nối - xác định câu lệnh truy vấn -> thực thi
        Connection conn = tienich.TienIch.getConnection();
        //-- Xác định câu lệnh truy vấn
        String sql = "insert into HoaDonXuat(mahdb,makh,manv,mamt,math,soluong,ngayban,diachi,sdt,dongia,tongtien) values ('"+s.getMahdb()+"','"+s.getMakh()+"','"+s.getManv()+"','"+s.getMamt()+"','"+s.getMath()+"','"+s.getSoluong()+"','"+s.getNgayban()+"','"+s.getDiachi()+"','"+s.getSdt()+"','"+s.getDongia()+"','"+s.getTongtien()+"')";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = conn.prepareStatement(sql);
        pStmt.executeUpdate();
        // đóng kết nối
        tienich.TienIch.closePreparedStatement(pStmt);
        tienich.TienIch.closeConnection(conn);
    }
    public static List<HoaDonBan> getAllMTbyName(String _keywords) throws SQLException, ClassNotFoundException
    {
        List<HoaDonBan> lstKetqua = new ArrayList<>();      
        //--- Kết nối CSDL, lấy dữ liệu
        Connection cnn = tienich.TienIch.getConnection();
        //-- Xây dựng câu lệnh truy vấn
        String sql = "select * from HoaDonXuat where mahdb like '%"+_keywords+"%'";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = cnn.prepareStatement(sql);
        ResultSet rs = pStmt.executeQuery();
        while(rs.next())
        {
            HoaDonBan s = new HoaDonBan();
            s.setMahdb(rs.getString("mahdb"));
            s.setMakh(rs.getString("makh"));
            s.setManv(rs.getString("manv"));
            s.setMamt(rs.getString("mamt"));
            s.setMath(rs.getString("math"));
            s.setSoluong(rs.getInt("soluong"));
            s.setNgayban(rs.getString("ngayban"));
            s.setDiachi(rs.getString("diachi"));
            s.setSdt(rs.getInt("sdt"));
            s.setDongia(rs.getInt("dongia"));
            s.setTongtien(rs.getInt("tongtien"));
            lstKetqua.add(s);
        }
        return lstKetqua;
        
    }
}
