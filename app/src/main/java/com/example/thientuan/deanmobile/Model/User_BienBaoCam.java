package com.example.thientuan.deanmobile.Model;

/**
 * Created by ThienTuan on 31/10/2019.
 */

public class User_BienBaoCam {
    public int anh;
    public String noidung;
    public int loaibien;

    public User_BienBaoCam(int anh, String noidung, int loaibien){
        this.anh = anh;
        this.noidung = noidung;
        this.loaibien = loaibien;
    }

    public  int getAnh(){
        return anh;
    }
    public void setAnh(int anh){
        this.anh = anh;
    }

    public String getNoidung(){
        return noidung;
    }
    public void setNoidung(String noidung){
        this.noidung = noidung;
    }

    public int getLoaibien(){
        return loaibien;
    }
    public void setLoaibien(int loaibien){
        this.loaibien = loaibien;
    }
}
