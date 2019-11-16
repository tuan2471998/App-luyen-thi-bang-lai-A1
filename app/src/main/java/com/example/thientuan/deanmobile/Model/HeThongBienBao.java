package com.example.thientuan.deanmobile.Model;

/**
 * Created by ThienTuan on 15/11/2019.
 */

public class HeThongBienBao {
    private String cauhoi;
    private String cautraloi;

    public HeThongBienBao(String cauhoi, String cautraloi) {
        this.cauhoi = cauhoi;
        this.cautraloi = cautraloi;
    }

    public String getCauhoi() {
        return cauhoi;
    }

    public void setCauhoi(String cauhoi) {
        this.cauhoi = cauhoi;
    }

    public String getCautraloi() {
        return cautraloi;
    }

    public void setCautraloi(String cautraloi) {
        this.cautraloi = cautraloi;
    }
}
