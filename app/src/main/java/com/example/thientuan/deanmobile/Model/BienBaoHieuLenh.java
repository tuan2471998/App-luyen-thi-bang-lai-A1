package com.example.thientuan.deanmobile.Model;

/**
 * Created by J Nguyen on 11/10/2019.
 */

public class BienBaoHieuLenh {

    private String ten;
    private String noidung;

    public BienBaoHieuLenh(String ten, String noidung) {
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
