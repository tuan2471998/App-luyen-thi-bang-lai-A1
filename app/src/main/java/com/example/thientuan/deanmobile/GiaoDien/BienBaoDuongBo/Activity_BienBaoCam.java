package com.example.thientuan.deanmobile.GiaoDien.BienBaoDuongBo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.thientuan.deanmobile.Adapter.UserAdapter_BienBaoCam;
import com.example.thientuan.deanmobile.Database.DBHelper_BienBaoCam;
import com.example.thientuan.deanmobile.Model.User_BienBaoCam;
import com.example.thientuan.deanmobile.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Activity_BienBaoCam extends AppCompatActivity {

    ListView listView;
    ArrayList<User_BienBaoCam> arrayList;
    UserAdapter_BienBaoCam bienbaocamAdapter;
    Context context;
    DBHelper_BienBaoCam db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__bien_bao_cam);

<<<<<<< HEAD
    }

    public ArrayList<User_BienBaoCam> getData(){
        ArrayList<User_BienBaoCam> user =new ArrayList<>();
        

        return user;
=======
        db = new DBHelper_BienBaoCam(Activity_BienBaoCam.this);
        arrayList = db.getAllBienBaoCam();
        bienbaocamAdapter = new UserAdapter_BienBaoCam(Activity_BienBaoCam.this, R.layout.layout_row_bienbaocam,arrayList);
        listView.setAdapter(bienbaocamAdapter);
>>>>>>> f11cdca69ad1cf614074de991a2e63937f8919ee
    }
}
