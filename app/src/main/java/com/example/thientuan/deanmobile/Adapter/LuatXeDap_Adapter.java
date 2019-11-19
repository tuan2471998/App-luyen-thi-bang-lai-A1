package com.example.thientuan.deanmobile.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.thientuan.deanmobile.Model.BienBaoCam;
import com.example.thientuan.deanmobile.Model.LuatXeDap;
import com.example.thientuan.deanmobile.R;

import java.util.ArrayList;

/**
 * Created by J Nguyen on 11/14/2019.
 */

public class LuatXeDap_Adapter extends ArrayAdapter<LuatXeDap> {
    Context context;
    int layout;
    ArrayList<LuatXeDap> arrayList;

    public LuatXeDap_Adapter(Context context, int resource, ArrayList<LuatXeDap> object){
        super(context, resource, object);
        this.context = context;
        this.layout = resource;
        this.arrayList = object;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LuatXeDap luatXeDap = getItem(position);

        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        convertView = layoutInflater.inflate(R.layout.layout_row_luatxedap, null);

        TextView txt_noidung = convertView.findViewById(R.id.noidungluat_xedap);
        TextView txt_mucphat = convertView.findViewById(R.id.mucphat_xedap);

        txt_noidung.setText(arrayList.get(position).getNoidungluat());
        txt_mucphat.setText(arrayList.get(position).getMucphat());

        return convertView;
    }
}
