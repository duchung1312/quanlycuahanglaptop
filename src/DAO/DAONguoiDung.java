/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.NguoiDung;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Đức Hùng
 */
public class DAONguoiDung {
    public static List<NguoiDung> GetAllND() throws SQLException, ClassNotFoundException
    {
        List<NguoiDung> lstNguoiDung = new ArrayList<>();
        //--- Kết nối CSDL, lấy dữ liệu
        Connection cnn = tienich.TienIch.getConnection();
        //-- Xây dựng câu lệnh truy vấn
        String sql = "select * from NguoiDung";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = cnn.prepareStatement(sql);
        ResultSet rs = pStmt.executeQuery();
        while(rs.next())
        {
            NguoiDung ndx = new NguoiDung();
            ndx.setId(rs.getInt("id"));
            ndx.setTaiKhoan(rs.getString("taikhoan"));
            ndx.setMatKhau(rs.getString("matkhau"));
            lstNguoiDung.add(ndx);
        }
        return lstNguoiDung;
    }
    public static List<NguoiDung> getOneND(String _taikhoan, String _pass) throws SQLException, ClassNotFoundException
    {
        List<NguoiDung> lstNguoiDung = new ArrayList<>();
        //--- Kết nối CSDL, lấy dữ liệu
        Connection cnn = tienich.TienIch.getConnection();
        //-- Xây dựng câu lệnh truy vấn
        String sql = "select * from NguoiDung where TaiKhoan = '"+_taikhoan+"' and MatKhau = '"+_pass+"'";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = cnn.prepareStatement(sql);
        ResultSet rs = pStmt.executeQuery();
        //-- Xử lý kết quả trả về
        while(rs.next())
        {
            NguoiDung ndx = new NguoiDung();
            ndx.setId(rs.getInt("id"));
            ndx.setTaiKhoan(rs.getString("taikhoan"));
            ndx.setMatKhau(rs.getString("matkhau"));
            lstNguoiDung.add(ndx);
        }
        return lstNguoiDung;
    }
}
