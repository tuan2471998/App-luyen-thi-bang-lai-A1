package com.example.thientuan.deanmobile.GiaoDien.BienBaoDuongBo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import com.example.thientuan.deanmobile.R;

public class Activity_BienBaoDuongBo extends AppCompatActivity {

    Toolbar toolbar;
    private Button button_BienBaoCam;
    private Button button_BienBaoNguyHiem;
    private Button button_BienBaoHieuLenh;
    private Button button_BienBaoChiDan;
    private Button button_BienBaoPhu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__bien_bao_duong_bo);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow);

        button_BienBaoCam = (Button) findViewById(R.id.button_BienBaoCam);
        button_BienBaoCam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acti_bienbaocam = new Intent(Activity_BienBaoDuongBo.this, Activity_BienBaoCam.class);
                startActivity(acti_bienbaocam);
            }
        });

        button_BienBaoNguyHiem=(Button) findViewById(R.id.button_BienBaoNguyHiem);
        button_BienBaoNguyHiem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent acti_bienbaonguyhiem = new Intent(Activity_BienBaoDuongBo.this, Activity_BienBaoNguyHiem.class);
                startActivity(acti_bienbaonguyhiem);
            }
        });

        button_BienBaoHieuLenh = (Button) findViewById(R.id.button_BienBaoHieuLenh);
        button_BienBaoHieuLenh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent acti_bienbaohieulenh = new Intent(Activity_BienBaoDuongBo.this, Activity_BienBaoHieuLenh.class);
                startActivity(acti_bienbaohieulenh);
            }
        });

        button_BienBaoChiDan = (Button) findViewById(R.id.button_BienBaoChiDan);
        button_BienBaoChiDan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent acti_bienbaochidan = new Intent(Activity_BienBaoDuongBo.this, Activity_BienBaoChiDan.class);
                startActivity(acti_bienbaochidan);
            }
        });

        button_BienBaoPhu = (Button) findViewById(R.id.button_BienBaoPhu);
        button_BienBaoPhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent acti_bienbaophu = new Intent(Activity_BienBaoDuongBo.this, Activity_BienBaoPhu.class);
                startActivity(acti_bienbaophu);
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
