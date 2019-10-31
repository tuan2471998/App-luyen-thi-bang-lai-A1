package com.example.thientuan.deanmobile.GiaoDien.BienBaoDuongBo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import com.example.thientuan.deanmobile.R;

public class Activity_BienBaoDuongBo extends AppCompatActivity {

    Toolbar toolbar;
    private Button button_BienBaoCam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__bien_bao_duong_bo);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow);

        button_BienBaoCam = (Button) findViewById(R.id.button_BienBaoCam);
        button_BienBaoCam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acti_bienbaocam = new Intent(Activity_BienBaoDuongBo.this, Activity_BienBaoCam.class);
                startActivity(acti_bienbaocam);
            }
        });

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == android.R.id.home)
        {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
