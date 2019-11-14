package com.example.thientuan.deanmobile.Model;

/**
 * Created by J Nguyen on 11/14/2019.
 */

public class KhaiNiemVaQuyTac {
    private String cauhoi;
    private String cautrailoi;

    public KhaiNiemVaQuyTac(String cauhoi, String cautrailoi) {
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
