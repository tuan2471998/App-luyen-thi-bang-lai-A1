package com.example.thientuan.deanmobile.GiaoDien.BaiThiThu;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import com.example.thientuan.deanmobile.Adapter.Bai1_Adapter;
import com.example.thientuan.deanmobile.Database.DBHelper_Bai1;
import com.example.thientuan.deanmobile.Model.Bai1;
import com.example.thientuan.deanmobile.R;

import java.util.ArrayList;

public class Activity_Bai1 extends AppCompatActivity {

    ImageButton backward;
    ImageButton forward;
    ArrayList<Bai1> arrayList;
    ViewPager viewPager;
    DBHelper_Bai1 db;
    Bai1_Adapter bai1_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__bai1);

        db = new DBHelper_Bai1(Activity_Bai1.this);

        viewPager = (ViewPager)findViewById(R.id.viewpage_bai1);

        arrayList = db.getAllBai1();

        bai1_adapter = new Bai1_Adapter();

        viewPager.setAdapter(bai1_adapter);

        registerForContextMenu(viewPager);
    }
}
