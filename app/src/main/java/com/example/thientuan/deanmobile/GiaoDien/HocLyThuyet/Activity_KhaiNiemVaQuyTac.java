package com.example.thientuan.deanmobile.GiaoDien.HocLyThuyet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.thientuan.deanmobile.Adapter.BienBaoCam_Adapter;
import com.example.thientuan.deanmobile.Adapter.KhaiNiemVaQuyTac_Adapter;
import com.example.thientuan.deanmobile.Database.DBHelper_BienBaoCam;
import com.example.thientuan.deanmobile.Database.DBHelper_KhaiNiemVaQuyTac;
import com.example.thientuan.deanmobile.GiaoDien.BienBaoDuongBo.Activity_BienBaoCam;
import com.example.thientuan.deanmobile.Model.BienBaoCam;
import com.example.thientuan.deanmobile.Model.KhaiNiemVaQuyTac;
import com.example.thientuan.deanmobile.R;

import java.util.ArrayList;

public class Activity_KhaiNiemVaQuyTac extends AppCompatActivity {

    ArrayList<KhaiNiemVaQuyTac> arrayList;
    ListView listView;
    DBHelper_KhaiNiemVaQuyTac db;
    KhaiNiemVaQuyTac_Adapter khaiNiemVaQuyTac_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__khai_niem_va_quy_tac);

        db = new DBHelper_KhaiNiemVaQuyTac(Activity_KhaiNiemVaQuyTac.this);

        listView = (ListView) findViewById(R.id.listview_khainiemvaquytac);

        arrayList = db.getAllKhaiNiem();

        khaiNiemVaQuyTac_adapter = new KhaiNiemVaQuyTac_Adapter(Activity_KhaiNiemVaQuyTac.this, R.layout.layout_row_khainiemvaquytac, arrayList);

        listView.setAdapter(khaiNiemVaQuyTac_adapter);

        registerForContextMenu(listView);
    }
}
