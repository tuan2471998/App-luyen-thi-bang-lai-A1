package com.example.thientuan.deanmobile.GiaoDien.BienBaoDuongBo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.thientuan.deanmobile.Adapter.BienBaoCam_Adapter;
import com.example.thientuan.deanmobile.Database.DBHelper_BienBaoCam;
import com.example.thientuan.deanmobile.Model.BienBaoCam;
import com.example.thientuan.deanmobile.R;

import java.util.ArrayList;

public class Activity_BienBaoCam extends AppCompatActivity {


    ArrayList<BienBaoCam> arrayList;
    ListView listView;
    DBHelper_BienBaoCam db;
    BienBaoCam_Adapter bienBaoCam_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__bien_bao_cam);

        db = new DBHelper_BienBaoCam(Activity_BienBaoCam.this);

        listView = (ListView) findViewById(R.id.listview_bienbaocam);

        arrayList = db.getAllBienBaoCam();

        bienBaoCam_adapter = new BienBaoCam_Adapter(Activity_BienBaoCam.this, R.layout.layout_row_bienbaocam, arrayList);

        listView.setAdapter(bienBaoCam_adapter);

        registerForContextMenu(listView);
    }

}
