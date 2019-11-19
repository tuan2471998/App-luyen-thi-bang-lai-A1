package com.example.thientuan.deanmobile.GiaoDien.Luat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.thientuan.deanmobile.Adapter.LuatXeDap_Adapter;
import com.example.thientuan.deanmobile.Database.DBHelper_LuatXeDap;
import com.example.thientuan.deanmobile.Model.LuatXeDap;
import com.example.thientuan.deanmobile.R;

import java.util.ArrayList;

public class Activity_LuatXeDap extends AppCompatActivity {

    ArrayList<LuatXeDap> arrayList;
    ListView listView;
    DBHelper_LuatXeDap db;
    LuatXeDap_Adapter luatXeDap_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__luat_xe_dap);

        db = new DBHelper_LuatXeDap(Activity_LuatXeDap.this);

        listView = (ListView) findViewById(R.id.listview_luatxedap);

        arrayList = db.getAllLuatXeDap();

        luatXeDap_adapter = new LuatXeDap_Adapter(Activity_LuatXeDap.this, R.layout.layout_row_luatxedap, arrayList);

        listView.setAdapter(luatXeDap_adapter);

        registerForContextMenu(listView);
    }
}
