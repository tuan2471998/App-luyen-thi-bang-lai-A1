package com.example.thientuan.deanmobile.GiaoDien.BienBaoDuongBo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.thientuan.deanmobile.Adapter.BienBaoCam_Adapter;
import com.example.thientuan.deanmobile.Adapter.BienBaoPhu_Adapter;
import com.example.thientuan.deanmobile.Database.DBHelper_BienBaoCam;
import com.example.thientuan.deanmobile.Database.DBHelper_BienBaoPhu;
import com.example.thientuan.deanmobile.Model.BienBaoPhu;
import com.example.thientuan.deanmobile.R;

import java.util.ArrayList;

public class Activity_BienBaoPhu extends AppCompatActivity {

    ArrayList<BienBaoPhu> arrayList;
    ListView listView;
    DBHelper_BienBaoPhu db;
    BienBaoPhu_Adapter bienBaoPhu_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__bien_bao_phu);

        db = new DBHelper_BienBaoPhu(Activity_BienBaoPhu.this);

        listView = (ListView) findViewById(R.id.listview_bienbaophu);

        arrayList = db.getAllBienBaoPhu();

        bienBaoPhu_adapter = new BienBaoPhu_Adapter(Activity_BienBaoPhu.this, R.layout.layout_row_bienbaophu, arrayList);

        listView.setAdapter(bienBaoPhu_adapter);

        registerForContextMenu(listView);
    }
}
