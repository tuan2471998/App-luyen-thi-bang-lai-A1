package com.example.thientuan.deanmobile.Model;

/**
 * Created by Admin on 11/11/2019.
 */

public class VachKeDuong {
    private String ten;
    private String noidung;

    public VachKeDuong(String ten, String noidung) {
        this.ten = ten;
        this.noidung = noidung;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }
}
