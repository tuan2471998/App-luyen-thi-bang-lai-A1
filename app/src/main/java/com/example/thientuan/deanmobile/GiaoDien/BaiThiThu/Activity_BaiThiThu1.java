package com.example.thientuan.deanmobile.GiaoDien.BaiThiThu;

import android.database.Cursor;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.thientuan.deanmobile.Adapter.BaiThiThu_Adapter;
import com.example.thientuan.deanmobile.Database.DBHelper_BaiThiThu;
import com.example.thientuan.deanmobile.Model.BaiThiThu;
import com.example.thientuan.deanmobile.R;

import java.util.ArrayList;

public class Activity_BaiThiThu1 extends AppCompatActivity {

    DBHelper_BaiThiThu db;
    Cursor cursor;
    BaiThiThu_Adapter baiThiThu_adapter;
    ViewPager viewPager;
    ArrayList<BaiThiThu> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__bai_thi_thu1);

        Bundle extras = getIntent().getExtras();

        db = new DBHelper_BaiThiThu(Activity_BaiThiThu1.this);

        viewPager = (ViewPager)findViewById(R.id.viewpager_baithithu1);

        arrayList = db.getAllBaiThiThu();

        baiThiThu_adapter = new BaiThiThu_Adapter(Activity_BaiThiThu1.this,R.layout.layout_row_baithithu, cursor);

        viewPager.setAdapter(baiThiThu_adapter);

        registerForContextMenu(viewPager);

    }
}
