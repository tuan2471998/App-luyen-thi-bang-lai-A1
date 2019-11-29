package com.example.thientuan.deanmobile.GiaoDien.BaiThiThu;

/**
 * Created by J Nguyen on 11/28/2019.
 */

public class BaiThiThu1 {
    private int mach;
    private String noidung;
    private String dapan1;
    private String dapan2;
    private String dapan3;
    private String dapandung;

    public BaiThiThu1(int mach, String noidung, String dapan1, String dapan2, String dapan3, String dapandung) {
        this.mach = mach;
        this.noidung = noidung;
        this.dapan1 = dapan1;
        this.dapan2 = dapan2;
        this.dapan3 = dapan3;
        this.dapandung = dapandung;
    }

    public int getMach() {
        return mach;
    }

    public void setMach(int mach) {
        this.mach = mach;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

    public String getDapan1() {
        return dapan1;
    }

    public void setDapan1(String dapan1) {
        this.dapan1 = dapan1;
    }

    public String getDapan2() {
        return dapan2;
    }

    public void setDapan2(String dapan2) {
        this.dapan2 = dapan2;
    }

    public String getDapan3() {
        return dapan3;
    }

    public void setDapan3(String dapan3) {
        this.dapan3 = dapan3;
    }

    public String getDapandung() {
        return dapandung;
    }

    public void setDapandung(String dapandung) {
        this.dapandung = dapandung;
    }
}
