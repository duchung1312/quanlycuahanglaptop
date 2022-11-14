/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Đức Hùng
 */
public class ThongTinMay {
    String MaMT;
    String TenMT;
    int Soluong;

    public String getMaMT() {
        return MaMT;
    }

    public void setMaMT(String MaMT) {
        this.MaMT = MaMT;
    }

    public String getTenMT() {
        return TenMT;
    }

    public void setTenMT(String TenMT) {
        this.TenMT = TenMT;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }

    public int getGia() {
        return Gia;
    }

    public void setGia(int Gia) {
        this.Gia = Gia;
    }
    int Gia;
}
