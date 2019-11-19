package com.example.thientuan.deanmobile.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.thientuan.deanmobile.Model.LuatXeDap;
import com.example.thientuan.deanmobile.Model.LuatXeMay;
import com.example.thientuan.deanmobile.R;

import java.util.ArrayList;

/**
 * Created by ThienTuan on 19/11/2019.
 */

public class LuatXeMay_Adapter extends ArrayAdapter<LuatXeMay> {
    Context context;
    int layout;
    ArrayList<LuatXeMay> arrayList;

    public LuatXeMay_Adapter(Context context, int resource, ArrayList<LuatXeMay> object){
        super(context, resource, object);
        this.context = context;
        this.layout = resource;
        this.arrayList = object;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LuatXeMay luatXeMay = getItem(position);

        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        convertView = layoutInflater.inflate(R.layout.layout_row_luatxemay, null);

        TextView txt_noidung = convertView.findViewById(R.id.noidungluat_xemay);
        TextView txt_mucphat = convertView.findViewById(R.id.mucphat_xemay);

        txt_noidung.setText(arrayList.get(position).getNoidungluat());
        txt_mucphat.setText(arrayList.get(position).getMucphat());

        return convertView;
    }
}
