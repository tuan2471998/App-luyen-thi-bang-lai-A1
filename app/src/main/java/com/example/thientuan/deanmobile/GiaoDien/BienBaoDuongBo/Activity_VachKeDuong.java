package com.example.thientuan.deanmobile.GiaoDien.BienBaoDuongBo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.thientuan.deanmobile.Adapter.BienBaoCam_Adapter;
import com.example.thientuan.deanmobile.Adapter.VachKeDuong_Adapter;
import com.example.thientuan.deanmobile.Database.DBHelper_BienBaoCam;
import com.example.thientuan.deanmobile.Database.DBHelper_VachKeDuong;
import com.example.thientuan.deanmobile.Model.BienBaoCam;
import com.example.thientuan.deanmobile.Model.VachKeDuong;
import com.example.thientuan.deanmobile.R;

import java.util.ArrayList;

public class Activity_VachKeDuong extends AppCompatActivity {

    ArrayList<VachKeDuong> arrayList;
    ListView listView;
    DBHelper_VachKeDuong db;
    VachKeDuong_Adapter vachKeDuong_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__vach_ke_duong);

        db = new DBHelper_VachKeDuong(Activity_VachKeDuong.this);

        listView = (ListView) findViewById(R.id.listview_vachkeduong);

        arrayList = db.getAllVachKeDuong();

        vachKeDuong_adapter = new VachKeDuong_Adapter(Activity_VachKeDuong.this, R.layout.layout_row_vachkeduong, arrayList);

        listView.setAdapter(vachKeDuong_adapter);

        registerForContextMenu(listView);
    }
}
