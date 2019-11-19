package com.example.thientuan.deanmobile.GiaoDien.Luat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.thientuan.deanmobile.Adapter.SaiPhamKhac_Adapter;
import com.example.thientuan.deanmobile.Database.DBHelper_SaiPhamKhac;
import com.example.thientuan.deanmobile.Model.SaiPhamKhac;
import com.example.thientuan.deanmobile.R;

import java.util.ArrayList;

public class Activity_SaiPhamKhac extends AppCompatActivity {

    ArrayList<SaiPhamKhac> arrayList;
    ListView listView;
    DBHelper_SaiPhamKhac db;
    SaiPhamKhac_Adapter saiPhamKhac_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__sai_pham_khac);

        db = new DBHelper_SaiPhamKhac(Activity_SaiPhamKhac.this);

        listView = (ListView) findViewById(R.id.listview_saiphamkhac);

        arrayList = db.getAllSaiPhamKhac();

        saiPhamKhac_adapter = new SaiPhamKhac_Adapter(Activity_SaiPhamKhac.this, R.layout.layout_row_luatsaiphamkhac, arrayList);

        listView.setAdapter(saiPhamKhac_adapter);

        registerForContextMenu(listView);
    }
}
