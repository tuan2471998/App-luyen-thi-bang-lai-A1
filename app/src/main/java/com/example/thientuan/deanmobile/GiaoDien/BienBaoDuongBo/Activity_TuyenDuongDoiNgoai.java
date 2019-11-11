package com.example.thientuan.deanmobile.GiaoDien.BienBaoDuongBo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.thientuan.deanmobile.Adapter.BienBaoCam_Adapter;
import com.example.thientuan.deanmobile.Adapter.TuyenDuongDoiNgoai_Adapter;
import com.example.thientuan.deanmobile.Database.DBHelper_BienBaoCam;
import com.example.thientuan.deanmobile.Database.DBHelper_TuyenDuongDoiNgoai;
import com.example.thientuan.deanmobile.Model.BienBaoCam;
import com.example.thientuan.deanmobile.Model.TuyenDuongDoiNgoai;
import com.example.thientuan.deanmobile.R;

import java.util.ArrayList;

public class Activity_TuyenDuongDoiNgoai extends AppCompatActivity {

    ArrayList<TuyenDuongDoiNgoai> arrayList;
    ListView listView;
    DBHelper_TuyenDuongDoiNgoai db;
    TuyenDuongDoiNgoai_Adapter tuyenDuongDoiNgoai_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__tuyen_duong_doi_ngoai);

        db = new DBHelper_TuyenDuongDoiNgoai(Activity_TuyenDuongDoiNgoai.this);

        listView = (ListView) findViewById(R.id.listview_tuyenduong);

        arrayList = db.getAllTuyenDuongDoiNgoai();

        tuyenDuongDoiNgoai_adapter = new TuyenDuongDoiNgoai_Adapter(Activity_TuyenDuongDoiNgoai.this, R.layout.layout_row_tuyenduong, arrayList);

        listView.setAdapter(tuyenDuongDoiNgoai_adapter);

        registerForContextMenu(listView);
    }
}
