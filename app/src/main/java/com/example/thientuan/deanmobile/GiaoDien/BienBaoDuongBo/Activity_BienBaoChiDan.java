package com.example.thientuan.deanmobile.GiaoDien.BienBaoDuongBo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.thientuan.deanmobile.Adapter.BienBaoCam_Adapter;
import com.example.thientuan.deanmobile.Adapter.BienBaoChiDan_Adapter;
import com.example.thientuan.deanmobile.Database.DBHelper_BienBaoCam;
import com.example.thientuan.deanmobile.Database.DBHelper_BienBaoChiDan;
import com.example.thientuan.deanmobile.Model.BienBaoChiDan;
import com.example.thientuan.deanmobile.R;

import java.util.ArrayList;

public class Activity_BienBaoChiDan extends AppCompatActivity {

    ArrayList<BienBaoChiDan> arrayList;
    ListView listView;
    DBHelper_BienBaoChiDan db;
    BienBaoChiDan_Adapter bienBaoChiDan_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__bien_bao_chi_dan);

        db = new DBHelper_BienBaoChiDan(Activity_BienBaoChiDan.this);

        listView = (ListView) findViewById(R.id.listview_bienbaochidan);

        arrayList = db.getAllBienBaoChiDan();

        bienBaoChiDan_adapter = new BienBaoChiDan_Adapter(Activity_BienBaoChiDan.this, R.layout.layout_row_bienbaochidan, arrayList);

        listView.setAdapter(bienBaoChiDan_adapter);

        registerForContextMenu(listView);
    }
}
