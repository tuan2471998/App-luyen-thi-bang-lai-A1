package com.example.thientuan.deanmobile.GiaoDien.BienBaoDuongBo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.thientuan.deanmobile.Adapter.BienBaoNguyHiem_Adapter;
import com.example.thientuan.deanmobile.Database.DBHelper_BienBaoNguyHiem;
import com.example.thientuan.deanmobile.Model.BienBaoNguyHiem;
import com.example.thientuan.deanmobile.R;

import java.util.ArrayList;

public class Activity_BienBaoNguyHiem extends AppCompatActivity {

    ArrayList<BienBaoNguyHiem> arrayList;
    ListView listView;
    DBHelper_BienBaoNguyHiem db;
    BienBaoNguyHiem_Adapter bienBaoNguyHiem_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__bien_bao_nguy_hiem);

        db = new DBHelper_BienBaoNguyHiem(Activity_BienBaoNguyHiem.this);

        listView = (ListView) findViewById(R.id.listview_bienbaonguyhiem);

        arrayList = db.getAllBienBaoNguyHiem();

        bienBaoNguyHiem_adapter = new BienBaoNguyHiem_Adapter(Activity_BienBaoNguyHiem.this, R.layout.layout_row_bienbaonguyhiem, arrayList);

        listView.setAdapter(bienBaoNguyHiem_adapter);

        registerForContextMenu(listView);
    }
}
