package com.example.thientuan.deanmobile.Model;

/**
 * Created by ThienTuan on 09/11/2019.
 */

public class BienBaoCam {
    private byte[] anh;
    private String noidung;
    private int loaibien;

    public BienBaoCam(byte[] anh, String noidung, int loaibien) {
        this.anh = anh;
        this.noidung = noidung;
        this.loaibien = loaibien;
    }

    public byte[] getAnh() {
        return anh;
    }

    public void setAnh(byte[] anh) {
        this.anh = anh;
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
}