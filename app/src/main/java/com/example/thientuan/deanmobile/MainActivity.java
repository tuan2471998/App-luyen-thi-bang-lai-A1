package com.example.thientuan.deanmobile;

import android.app.Dialog;
import android.content.Intent;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.thientuan.deanmobile.GiaoDien.BienBaoDuongBo.Activity_BienBaoDuongBo;
import com.example.thientuan.deanmobile.GiaoDien.HocLyThuyet.Activity_HocLyThuyet;
import com.example.thientuan.deanmobile.GiaoDien.Luat.Activity_Luat;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    ImageButton imageButton_hocbaimoi;
    ImageButton imageButton_bienbao;
    ImageButton imageButton_luat;
    Toolbar toolbar;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Navigation Menu
        drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                item.setChecked(true);
                drawerLayout.closeDrawers();
                return true;
            }
        });

        //tạo Navigation Button
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu);

        //ImageButton_HocBai
        imageButton_hocbaimoi = (ImageButton) findViewById(R.id.imageButton_hocbaimoi);
        imageButton_hocbaimoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent acti_hoclythuyet = new Intent(MainActivity.this, Activity_HocLyThuyet.class);
                startActivity(acti_hoclythuyet);
            }
        });

        //ImageButton_BienBao
        imageButton_bienbao = (ImageButton) findViewById(R.id.imageButton_bienbao);
        imageButton_bienbao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent acti_bienbao = new Intent(MainActivity.this, Activity_BienBaoDuongBo.class);
                startActivity(acti_bienbao);
            }
        });

        //ImageButton_Luat
        imageButton_luat = (ImageButton) findViewById(R.id.imageButton_luat);
        imageButton_luat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent acti_luat = new Intent(MainActivity.this, Activity_Luat.class);
                startActivity(acti_luat);
            }
        });
    }

    //Mở menu khi chạm vào button
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    boolean doubleBackToExit = false;

    public void onBackPressed(){

        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else {
            if (doubleBackToExit) {
                super.onBackPressed();
                return;
            }
            this.doubleBackToExit = true;
            Toast.makeText(this, "Bấm lần nữa để thoát", Toast.LENGTH_SHORT).show();

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    doubleBackToExit = false;
                }
            }, 2000);
        }
    }

}
