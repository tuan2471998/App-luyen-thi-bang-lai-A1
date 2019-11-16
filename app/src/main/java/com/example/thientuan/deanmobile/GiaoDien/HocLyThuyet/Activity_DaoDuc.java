package com.example.thientuan.deanmobile.GiaoDien.HocLyThuyet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.thientuan.deanmobile.Adapter.DaoDuc_Adapter;
import com.example.thientuan.deanmobile.Database.DBHelper_DaoDuc;
import com.example.thientuan.deanmobile.Model.DaoDuc;
import com.example.thientuan.deanmobile.R;

import java.util.ArrayList;

public class Activity_DaoDuc extends AppCompatActivity {

    ArrayList<DaoDuc> arrayList;
    ListView listView;
    DBHelper_DaoDuc db;
    DaoDuc_Adapter daoDuc_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__khai_niem_va_quy_tac);

        db = new DBHelper_DaoDuc(Activity_DaoDuc.this);

        listView = (ListView) findViewById(R.id.listview_khainiemvaquytac);

        arrayList = db.getAllDaoDuc();

        daoDuc_adapter = new DaoDuc_Adapter(Activity_DaoDuc.this, R.layout.layout_row_daoduc, arrayList);

        listView.setAdapter(daoDuc_adapter);

        registerForContextMenu(listView);
    }
}
