package com.example.thientuan.deanmobile.Model;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by ThienTuan on 09/11/2019.
 */

public class BienBaoCam {
    private String noidung;
    private int loaibien;

    public BienBaoCam(String noidung, int loaibien) {
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