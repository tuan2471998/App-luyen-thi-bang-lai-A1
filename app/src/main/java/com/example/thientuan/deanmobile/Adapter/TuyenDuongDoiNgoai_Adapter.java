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

import com.example.thientuan.deanmobile.Model.TuyenDuongDoiNgoai;
import com.example.thientuan.deanmobile.R;

import java.util.ArrayList;

/**
 * Created by Admin on 11/11/2019.
 */

public class TuyenDuongDoiNgoai_Adapter extends ArrayAdapter<TuyenDuongDoiNgoai> {
    Context context;
    int layout;
    ArrayList<TuyenDuongDoiNgoai> arrayList;

    int[] image = {R.drawable.doingoai_1,
            R.drawable.doingoai_2,
            R.drawable.doingoai_3,
            R.drawable.doingoai_4,
            R.drawable.doingoai_5,
            R.drawable.doingoai_6,
            R.drawable.doingoai_7,
            R.drawable.doingoai_8};

    public TuyenDuongDoiNgoai_Adapter(Context context, int resource, ArrayList<TuyenDuongDoiNgoai> object){
        super(context, resource, object);
        this.context = context;
        this.layout = resource;
        this.arrayList = object;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        TuyenDuongDoiNgoai tuyenDuongDoiNgoai = getItem(position);

        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        convertView = layoutInflater.inflate(R.layout.layout_row_tuyenduong, null);

        ImageView img = convertView.findViewById(R.id.img_tuyenduong);
        TextView txt_ten = convertView.findViewById(R.id.ten_tuyenduong);
        TextView txt_noidung = convertView.findViewById(R.id.noidung_tuyenduong);

        img.setImageResource(image[position]);
        txt_ten.setText(arrayList.get(position).getTen());
        txt_noidung.setText(arrayList.get(position).getNoidung());

        return convertView;
    }
}
