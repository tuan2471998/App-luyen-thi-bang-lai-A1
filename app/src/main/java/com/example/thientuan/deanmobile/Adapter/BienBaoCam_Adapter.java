package com.example.thientuan.deanmobile.Adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.thientuan.deanmobile.Model.BienBaoCam;
import com.example.thientuan.deanmobile.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ThienTuan on 09/11/2019.
 */

public class BienBaoCam_Adapter extends ArrayAdapter<BienBaoCam> {

    Context context;
    int layout;
    ArrayList<BienBaoCam> arrayList;

    public BienBaoCam_Adapter(Context context, int resource, ArrayList<BienBaoCam> object){
        super(context, 0, object);
        this.context = context;
        this.layout = resource;
        this.arrayList = object;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        BienBaoCam bienBaoCam = getItem(position);

        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        convertView = layoutInflater.inflate(R.layout.layout_row_bienbaocam, null);

        ImageView img = convertView.findViewById(R.id.image_bienbaocam);
        TextView txt_noidung = convertView.findViewById(R.id.tv_noidung);
        TextView txt_loaibien = convertView.findViewById(R.id.tv_loaibienbao);
        txt_noidung.setText(arrayList.get(position).getNoidung());
        return convertView;
    }
}
