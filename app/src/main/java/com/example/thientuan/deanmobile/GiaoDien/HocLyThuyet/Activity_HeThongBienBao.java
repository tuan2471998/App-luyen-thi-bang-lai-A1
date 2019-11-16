package com.example.thientuan.deanmobile.GiaoDien.HocLyThuyet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.thientuan.deanmobile.Adapter.HeThongBienBao_Adapter;
import com.example.thientuan.deanmobile.Database.DBHelper_HeThongBienBao;
import com.example.thientuan.deanmobile.Model.HeThongBienBao;
import com.example.thientuan.deanmobile.R;

import java.util.ArrayList;

public class Activity_HeThongBienBao extends AppCompatActivity {

    ArrayList<HeThongBienBao> arrayList;
    ListView listView;
    DBHelper_HeThongBienBao db;
    HeThongBienBao_Adapter heThongBienBao_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__he_thong_bien_bao);

        db = new DBHelper_HeThongBienBao(Activity_HeThongBienBao.this);

        listView = (ListView) findViewById(R.id.listview_hethongbienbao);

        arrayList = db.getAllHeThongBienBao();

        heThongBienBao_adapter = new HeThongBienBao_Adapter(Activity_HeThongBienBao.this, R.layout.layout_row_hethongbienbao, arrayList);

        listView.setAdapter(heThongBienBao_adapter);

        registerForContextMenu(listView);
    }
}
