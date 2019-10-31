package com.example.thientuan.deanmobile.GiaoDien.BienBaoDuongBo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.thientuan.deanmobile.Model.User_BienBaoCam;
import com.example.thientuan.deanmobile.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Activity_BienBaoCam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__bien_bao_cam);

    }

    public ArrayList<User_BienBaoCam> getData(){
        ArrayList<User_BienBaoCam> user =new ArrayList<>();



        return user;
    }
}
