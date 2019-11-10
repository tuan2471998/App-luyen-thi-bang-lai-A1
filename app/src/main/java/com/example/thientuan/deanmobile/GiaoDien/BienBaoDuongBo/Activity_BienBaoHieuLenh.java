package com.example.thientuan.deanmobile.GiaoDien.BienBaoDuongBo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.thientuan.deanmobile.Adapter.BienBaoHieuLenh_Adapter;
import com.example.thientuan.deanmobile.Database.DBHelper_BienBaoHieuLenh;
import com.example.thientuan.deanmobile.Model.BienBaoHieuLenh;
import com.example.thientuan.deanmobile.R;

import java.util.ArrayList;

public class Activity_BienBaoHieuLenh extends AppCompatActivity {

    ArrayList<BienBaoHieuLenh> arrayList;
    ListView listView;
    DBHelper_BienBaoHieuLenh db;
    BienBaoHieuLenh_Adapter bienBaoHieuLenh_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__bien_bao_hieu_lenh);

        db = new DBHelper_BienBaoHieuLenh(Activity_BienBaoHieuLenh.this);

        listView = (ListView) findViewById(R.id.listview_bienbaohieulenh);

        arrayList = db.getAllBienBaoHieuLenh();

        bienBaoHieuLenh_adapter = new BienBaoHieuLenh_Adapter(Activity_BienBaoHieuLenh.this, R.layout.layout_row_bienbaohieulenh, arrayList);

        listView.setAdapter(bienBaoHieuLenh_adapter);

        registerForContextMenu(listView);
    }
}
