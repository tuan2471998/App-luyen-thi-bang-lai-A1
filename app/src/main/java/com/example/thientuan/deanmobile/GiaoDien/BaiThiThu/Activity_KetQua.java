package com.example.thientuan.deanmobile.GiaoDien.BaiThiThu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.thientuan.deanmobile.MainActivity;
import com.example.thientuan.deanmobile.R;

import java.util.ArrayList;

public class Activity_KetQua extends AppCompatActivity {

    Button btnLamLai, btnThoat;
    ArrayList<BaiThiThu1> arr_QuesBegin = new ArrayList<>();
    int caudung = 0;
    int causai = 0;
    int cauchuatraloi = 0;
    double tongdiem = 0;
    TextView socaudung, socausai, socauchuatraloi, sodiem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__ket_qua);

        Intent intent = getIntent();
        arr_QuesBegin = (ArrayList<BaiThiThu1>) intent.getExtras().getSerializable("arrayList");
        socaudung = (TextView)findViewById(R.id.socaudung);
        socausai = (TextView)findViewById(R.id.socausai);
        socauchuatraloi = (TextView)findViewById(R.id.socauchuatraloi);
        sodiem = (TextView)findViewById(R.id.sodiem);
        checkResult();
        tongdiem = caudung*0.5;
        socaudung.setText(""+caudung);
        socausai.setText(""+causai);
        socauchuatraloi.setText(""+cauchuatraloi);
        sodiem.setText(""+tongdiem);

        btnLamLai = (Button)findViewById(R.id.btnLamLai);
        btnLamLai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acti_lamlai = new Intent(Activity_KetQua.this, Activity_BaiThiThu1.class);
                startActivity(acti_lamlai);
            }
        });

        btnThoat = (Button)findViewById(R.id.btnThoat);
        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acti_home = new Intent(Activity_KetQua.this, MainActivity.class);
                startActivity(acti_home);
            }
        });
    }

    public void checkResult(){
        for(int i = 0; i < arr_QuesBegin.size(); i++){
            if(arr_QuesBegin.get(i).getTraloi().equals("")==true) {
                cauchuatraloi++;
            }else if(arr_QuesBegin.get(i).getDapandung().equals(arr_QuesBegin.get(i).getTraloi())==true) {
                caudung++;
            }else causai++;
        }
    }
}
