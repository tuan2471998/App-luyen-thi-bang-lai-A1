package com.example.thientuan.deanmobile.GiaoDien.HocLyThuyet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.thientuan.deanmobile.Database.DBHelper_SaHinh;
import com.example.thientuan.deanmobile.Model.SaHinh;
import com.example.thientuan.deanmobile.Adapter.SaHinh_Adapter;
import com.example.thientuan.deanmobile.R;

import java.util.ArrayList;

public class Activity_SaHinh extends AppCompatActivity {

    ArrayList<SaHinh> arrayList;
    ListView listView;
    DBHelper_SaHinh db;
    SaHinh_Adapter saHinh_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__sa_hinh);

        db = new DBHelper_SaHinh(Activity_SaHinh.this);

        listView = (ListView) findViewById(R.id.listview_sahinh);

        arrayList = db.getAllSaHinh();

        saHinh_adapter = new SaHinh_Adapter(Activity_SaHinh.this, R.layout.layout_row_sahinh, arrayList);

        listView.setAdapter(saHinh_adapter);

        registerForContextMenu(listView);
    }
}
