/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Entity.ThongTinMay;

/**
 *
 * @author Đức Hùng
 */
public class DAOThongTinMay {
    public static List<ThongTinMay> getAllMT() throws SQLException, ClassNotFoundException
    {
        List<ThongTinMay> lstKetqua = new ArrayList<>();      
        //--- Kết nối CSDL, lấy dữ liệu
        Connection cnn = tienich.TienIch.getConnection();
        //-- Xây dựng câu lệnh truy vấn
        String sql = "select * from ThongTinMay";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = cnn.prepareStatement(sql);
        ResultSet rs = pStmt.executeQuery();
        while(rs.next())
        {
            ThongTinMay s = new ThongTinMay();
            s.setMaMT(rs.getString("mamt"));
            s.setTenMT(rs.getString("tenmt"));
            s.setSoluong(rs.getInt("soluong"));
            s.setGia(rs.getInt("giaban"));
            lstKetqua.add(s);
        }
        return lstKetqua;
        
    }
     public static List<ThongTinMay> getAllMTbyName(String _keywords) throws SQLException, ClassNotFoundException
    {
        List<ThongTinMay> lstKetqua = new ArrayList<>();      
        //--- Kết nối CSDL, lấy dữ liệu
        Connection cnn = tienich.TienIch.getConnection();
        //-- Xây dựng câu lệnh truy vấn
        String sql = "select * from ThongTinMay where tenmt like '%"+_keywords+"%'";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = cnn.prepareStatement(sql);
        ResultSet rs = pStmt.executeQuery();
        while(rs.next())
        {
            ThongTinMay s = new ThongTinMay();
            s.setMaMT(rs.getString("mamt"));
            s.setTenMT(rs.getString("tenmt"));
            s.setSoluong(rs.getInt("soluong"));
            s.setGia(rs.getInt("giaban"));
            lstKetqua.add(s);
        }
        return lstKetqua;
        
    }
    // get May Tinh by Name
    public static List<ThongTinMay> getOneMT(String _mamt) throws SQLException, ClassNotFoundException
    {
        List<ThongTinMay> lstKetqua = new ArrayList<>();      
        //--- Kết nối CSDL, lấy dữ liệu
        Connection cnn = tienich.TienIch.getConnection();
        //-- Xây dựng câu lệnh truy vấn
        String sql = "select * from ThongTinMay where mamt = '"+_mamt+"'";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = cnn.prepareStatement(sql);
        ResultSet rs = pStmt.executeQuery();
        while(rs.next())
        {
            ThongTinMay s = new ThongTinMay();
            s.setMaMT(rs.getString("mamt"));
            s.setTenMT(rs.getString("tenmt"));
            s.setSoluong(rs.getInt("soluong"));
            s.setGia(rs.getInt("gia"));
            lstKetqua.add(s);
        }
        return lstKetqua;
        
    }
    // Delete One   
    public static void DeleteMT(String _mamt) throws SQLException, ClassNotFoundException
    {
        // Mở kết nối - xác định câu lệnh truy vấn -> thực thi
        Connection conn = tienich.TienIch.getConnection();
        String sql = "delete from ThongTinMay where mamt = '"+_mamt+"'";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = conn.prepareStatement(sql);
        pStmt.executeUpdate();
        tienich.TienIch.closePreparedStatement(pStmt);
        tienich.TienIch.closeConnection(conn);
    }
    // Update One
    public static void UpdateMT(ThongTinMay s) throws SQLException, ClassNotFoundException
    {
        // Mở kết nối - xác định câu lệnh truy vấn -> thực thi
        Connection conn = tienich.TienIch.getConnection();
        String sql = "update ThongTinMay set tenmt = N'"+s.getTenMT()+"',soluong = '"+s.getSoluong()+"',giaban='"+s.getGia()+"' where mamt = '"+s.getMaMT()+"'";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = conn.prepareStatement(sql);
        pStmt.executeUpdate();
        tienich.TienIch.closePreparedStatement(pStmt);
        tienich.TienIch.closeConnection(conn);
    }
    // Insert One
    public static void InsertMT(ThongTinMay s) throws SQLException, ClassNotFoundException
    {
        // Mở kết nối - xác định câu lệnh truy vấn -> thực thi
        Connection conn = tienich.TienIch.getConnection();
        //-- Xác định câu lệnh truy vấn
        String sql = "insert into ThongTinMay(mamt,tenmt,soluong,giaban) values ('"+s.getMaMT()+"','"+s.getTenMT()+"','"+s.getSoluong()+"','"+s.getGia()+"')";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = conn.prepareStatement(sql);
        pStmt.executeUpdate();
        // đóng kết nối
        tienich.TienIch.closePreparedStatement(pStmt);
        tienich.TienIch.closeConnection(conn);
    }
}
