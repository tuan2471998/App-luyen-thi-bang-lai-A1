package com.example.thientuan.deanmobile.Model;

/**
 * Created by J Nguyen on 11/10/2019.
 */

public class BienBaoNguyHiem {
    String noidung;
    int loaibien;

    public BienBaoNguyHiem(String noidung, int loaibien) {
        this.noidung = noidung;
        this.loaibien = loaibien;
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
