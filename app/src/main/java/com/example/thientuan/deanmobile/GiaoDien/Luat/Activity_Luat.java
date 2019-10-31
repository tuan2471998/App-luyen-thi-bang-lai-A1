package com.example.thientuan.deanmobile.GiaoDien.Luat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.thientuan.deanmobile.R;

public class Activity_Luat extends AppCompatActivity {

    Button button_bottom_sheet_luat;
    android.support.v7.widget.Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__luat);

        button_bottom_sheet_luat = findViewById(R.id.button_bottom_sheet_luat);
        button_bottom_sheet_luat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bottomSheet_Luat bottomSheet = new bottomSheet_Luat();
                bottomSheet.show(getSupportFragmentManager(), "bottomSheet_Luat");
            }
        });

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow);
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
