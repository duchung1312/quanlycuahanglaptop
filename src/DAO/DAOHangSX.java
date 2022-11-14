/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.HangSX;
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
public class DAOHangSX {
    public static List<HangSX> getAll() throws SQLException, ClassNotFoundException
    {
        List<HangSX> lstKetqua = new ArrayList<>();      
        //--- Kết nối CSDL, lấy dữ liệu
        Connection cnn = tienich.TienIch.getConnection();
        //-- Xây dựng câu lệnh truy vấn
        String sql = "select * from ThuongHieu";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = cnn.prepareStatement(sql);
        ResultSet rs = pStmt.executeQuery();
        while(rs.next())
        {
            HangSX s = new HangSX();
            s.setMath(rs.getString("math"));
            s.setTenth(rs.getString("tenth"));
            s.setDiachi(rs.getString("diachi"));
            
            lstKetqua.add(s);
        }
        return lstKetqua;
        
    }
    // get One
    public static List<HangSX> getOne(int _math) throws SQLException, ClassNotFoundException
    {
        List<HangSX> lstKetqua = new ArrayList<>();      
        //--- Kết nối CSDL, lấy dữ liệu
        Connection cnn = tienich.TienIch.getConnection();
        //-- Xây dựng câu lệnh truy vấn
        String sql = "select * from ThuongHieu where math = '"+_math+"'";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = cnn.prepareStatement(sql);
        ResultSet rs = pStmt.executeQuery();
        while(rs.next())
        {
            HangSX s = new HangSX();
            s.setMath(rs.getString("math"));
            s.setTenth(rs.getString("tenth"));
            s.setDiachi(rs.getString("diachi"));
            
            lstKetqua.add(s);
        }
        return lstKetqua;
        
    }
    // Delete One   
    public static void Delete(String _math) throws SQLException, ClassNotFoundException
    {
        // Mở kết nối - xác định câu lệnh truy vấn -> thực thi
        Connection conn = tienich.TienIch.getConnection();
        String sql = "delete from ThuongHieu where math = '"+_math+"'";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = conn.prepareStatement(sql);
        pStmt.executeUpdate();
        tienich.TienIch.closePreparedStatement(pStmt);
        tienich.TienIch.closeConnection(conn);
    }
    // Update One
    public static void Update(HangSX s) throws SQLException, ClassNotFoundException
    {
        // Mở kết nối - xác định câu lệnh truy vấn -> thực thi
        Connection conn = tienich.TienIch.getConnection();
        String sql = "update ThuongHieu set tenth = N'"+s.getTenth()+"',diachi='"+s.getDiachi()+"' where math = '"+s.getMath()+"'";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = conn.prepareStatement(sql);
        pStmt.executeUpdate();
        tienich.TienIch.closePreparedStatement(pStmt);
        tienich.TienIch.closeConnection(conn);
    }
    // Insert One
    public static void Insert(HangSX s) throws SQLException, ClassNotFoundException
    {
        // Mở kết nối - xác định câu lệnh truy vấn -> thực thi
        Connection conn = tienich.TienIch.getConnection();
        //-- Xác định câu lệnh truy vấn
        String sql = "insert into ThuongHieu(math,tenth,diachi) values ('"+s.getMath()+"','"+s.getTenth()+"','"+s.getDiachi()+"')";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = conn.prepareStatement(sql);
        pStmt.executeUpdate();
        // đóng kết nối
        tienich.TienIch.closePreparedStatement(pStmt);
        tienich.TienIch.closeConnection(conn);
    }
    public static List<HangSX> getAllMTbyName(String _keywords) throws SQLException, ClassNotFoundException
    {
        List<HangSX> lstKetqua = new ArrayList<>();      
        //--- Kết nối CSDL, lấy dữ liệu
        Connection cnn = tienich.TienIch.getConnection();
        //-- Xây dựng câu lệnh truy vấn
        String sql = "select * from ThuongHieu where tenth like '%"+_keywords+"%'";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = cnn.prepareStatement(sql);
        ResultSet rs = pStmt.executeQuery();
        while(rs.next())
        {
            HangSX s = new HangSX();
            s.setMath(rs.getString("math"));
            s.setTenth(rs.getString("tenth"));
            s.setDiachi(rs.getString("diachi"));
            lstKetqua.add(s);
        }
        return lstKetqua;
        
    }
}
