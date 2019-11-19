package com.example.thientuan.deanmobile.GiaoDien.Luat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.thientuan.deanmobile.Adapter.LuatXeMay_Adapter;
import com.example.thientuan.deanmobile.Database.DBHelper_LuatXeMay;
import com.example.thientuan.deanmobile.Model.LuatXeMay;
import com.example.thientuan.deanmobile.R;

import java.util.ArrayList;

public class Activity_LuatXeMay extends AppCompatActivity {

    ArrayList<LuatXeMay> arrayList;
    ListView listView;
    DBHelper_LuatXeMay db;
    LuatXeMay_Adapter luatXeMay_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__luat_xe_may);

        db = new DBHelper_LuatXeMay(Activity_LuatXeMay.this);

        listView = (ListView) findViewById(R.id.listview_luatxemay);

        arrayList = db.getAllLuatXeMay();

        luatXeMay_adapter = new LuatXeMay_Adapter(Activity_LuatXeMay.this, R.layout.layout_row_luatxemay, arrayList);

        listView.setAdapter(luatXeMay_adapter);

        registerForContextMenu(listView);
    }
}
