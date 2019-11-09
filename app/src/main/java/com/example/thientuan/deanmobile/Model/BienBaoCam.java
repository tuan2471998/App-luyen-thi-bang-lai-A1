package com.example.thientuan.deanmobile.Model;

/**
 * Created by ThienTuan on 09/11/2019.
 */

public class BienBaoCam {
    private String noidung;
    private int loaibien;
    private byte[] hinhanh;

    public BienBaoCam(String noidung, int loaibien, byte[] hinhanh) {
        this.noidung = noidung;
        this.loaibien = loaibien;
        this.hinhanh = hinhanh;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

    public int getLoaibien() {
        return loaibien;
    }

    public void setLoaibien(int loaibien) {
        this.loaibien = loaibien;
    }

    public byte[] getHInhanh() {
        return hinhanh;
    }

    public void setAnh(byte[] hinhanh) {
        this.hinhanh = hinhanh;
    }
}