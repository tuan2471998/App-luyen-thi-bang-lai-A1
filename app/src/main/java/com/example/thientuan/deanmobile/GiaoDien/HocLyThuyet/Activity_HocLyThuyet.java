package com.example.thientuan.deanmobile.GiaoDien.HocLyThuyet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

import com.example.thientuan.deanmobile.R;

public class Activity_HocLyThuyet extends AppCompatActivity {

    android.support.v7.widget.Toolbar toolbar;
    Button button_KhaiNiemVaQuyTac;
    Button button_HeThongBienBaoDuongBo;
    Button button_SaHinh;
    Button button_DaoDuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__hoc_ly_thuyet);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow);

        button_KhaiNiemVaQuyTac = (Button)findViewById(R.id.button_KhaiNiemVaQuyTac);
        button_KhaiNiemVaQuyTac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent acti_KhaiNiemVaQuyTac = new Intent(Activity_HocLyThuyet.this, Activity_KhaiNiemVaQuyTac.class);
                startActivity(acti_KhaiNiemVaQuyTac);
            }
        });

        button_HeThongBienBaoDuongBo = (Button)findViewById(R.id.button_HeThongBienBaoDuongBo);
        button_HeThongBienBaoDuongBo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acti_HeThongBienBao = new Intent(Activity_HocLyThuyet.this, Activity_HeThongBienBao.class);
                startActivity(acti_HeThongBienBao);
            }
        });

        button_SaHinh = (Button)findViewById(R.id.button_SaHinh);
        button_SaHinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acti_SaHinh = new Intent(Activity_HocLyThuyet.this, Activity_SaHinh.class);
                startActivity(acti_SaHinh);
            }
        });

        button_DaoDuc = (Button)findViewById(R.id.button_DaoDuc);
        button_DaoDuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acti_DaoDuc = new Intent(Activity_HocLyThuyet.this, Activity_DaoDuc.class);
                startActivity(acti_DaoDuc);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == android.R.id.home)
        {
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
