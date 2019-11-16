package com.example.thientuan.deanmobile.Model;

/**
 * Created by ThienTuan on 15/11/2019.
 */

public class DaoDuc {
    private String cauhoi;
    private String cautrailoi;

    public DaoDuc(String cauhoi, String cautrailoi) {
        this.cauhoi = cauhoi;
        this.cautrailoi = cautrailoi;
    }

    public String getCauhoi() {
        return cauhoi;
    }

    public void setCauhoi(String cauhoi) {
        this.cauhoi = cauhoi;
    }

    public String getCautrailoi() {
        return cautrailoi;
    }

    public void setCautrailoi(String cautrailoi) {
        this.cautrailoi = cautrailoi;
    }
}
