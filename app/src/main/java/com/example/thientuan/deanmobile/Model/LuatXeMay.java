package com.example.thientuan.deanmobile.Model;

/**
 * Created by ThienTuan on 19/11/2019.
 */

public class LuatXeMay {
    private String noidungluat;
    private String mucphat;

    public LuatXeMay(String noidungluat, String mucphat) {
        this.noidungluat = noidungluat;
        this.mucphat = mucphat;
    }

    public String getNoidungluat() {
        return noidungluat;
    }

    public void setNoidungluat(String noidungluat) {
        this.noidungluat = noidungluat;
    }

    public String getMucphat() {
        return mucphat;
    }

    public void setMucphat(String mucphat) {
        this.mucphat = mucphat;
    }
}
