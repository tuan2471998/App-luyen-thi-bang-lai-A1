package com.example.thientuan.deanmobile.Model;

/**
 * Created by J Nguyen on 11/14/2019.
 */

public class LuatXeDap {
    private String noidungluat;
    private String mucphat;

    public LuatXeDap(String noidungluat, String mucphat) {
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
