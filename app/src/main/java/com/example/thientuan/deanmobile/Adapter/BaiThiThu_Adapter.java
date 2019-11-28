package com.example.thientuan.deanmobile.Adapter;

import android.content.Context;
import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.thientuan.deanmobile.Model.BaiThiThu;
import com.example.thientuan.deanmobile.R;

import java.util.ArrayList;

/**
 * Created by ThienTuan on 28/11/2019.
 */

public class BaiThiThu_Adapter extends PagerAdapter {
    private Cursor cursor;
    private LayoutInflater inflater;
    private int resource;

    public BaiThiThu_Adapter(Context context, int resource, Cursor cursor){
        Log.d("MainActivity", "Activity_BaiThiThi1.onCreate()");
        this.cursor = cursor;
        this.inflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        this.resource = resource;
    }
    public void swapCursor(Cursor cursor) {
        Log.d("MainActivity", "swapCursor().");
        this.cursor = cursor;
    }
    @Override
    public int getCount() {
        if(cursor == null) {
            return 0;
        } else {
            return cursor.getCount();
        }
    }
    @Override
    public void destroyItem(ViewGroup view, int position, Object object) {
        cursor.moveToPosition(position);
        (view).removeView((RelativeLayout) object);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return false;
    }

    public Object instantiateItem(ViewGroup view, int position) {
        position = position % cursor.getCount();

        cursor.moveToPosition(position);

        RelativeLayout layout = (RelativeLayout) inflater.inflate(R.layout.layout_row_baithithu, null);

        TextView txt_cauhoi = layout.findViewById(R.id.cauhoi);
        TextView txt_dapan1 = layout.findViewById(R.id.dapan1);
        TextView txt_dapan2 = layout.findViewById(R.id.dapan2);
        TextView txt_dapan3 = layout.findViewById(R.id.dapan3);
        TextView txt_dapan4 = layout.findViewById(R.id.dapan4);
        TextView txt_dapandung = layout.findViewById(R.id.dapandung);

        txt_cauhoi.setText(cursor.getString(cursor.getColumnIndex("TenCH")));
        txt_dapan1.setText(cursor.getString(cursor.getColumnIndex("A")));
        txt_dapan2.setText(cursor.getString(cursor.getColumnIndex("B")));
        txt_dapan3.setText(cursor.getString(cursor.getColumnIndex("C")));
        txt_dapan4.setText(cursor.getString(cursor.getColumnIndex("D")));
        txt_dapandung.setText(cursor.getString(cursor.getColumnIndex("DapAn")));

        (view).addView(layout);
        return layout;
    }
}
