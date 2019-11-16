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

import com.example.thientuan.deanmobile.Model.SaHinh;
import com.example.thientuan.deanmobile.R;

import java.util.ArrayList;

/**
 * Created by ThienTuan on 15/11/2019.
 */

public class SaHinh_Adapter extends ArrayAdapter<SaHinh> {
    Context context;
    int layout;
    ArrayList<SaHinh> arrayList;
    int[] image = {R.drawable.cauhoi76,
            R.drawable.cauhoi77,
            R.drawable.cauhoi78,
            R.drawable.cauhoi79,
            R.drawable.cauhoi80,
            R.drawable.cauhoi81,
            R.drawable.cauhoi82,
            R.drawable.cauhoi83,
            R.drawable.cauhoi84,
            R.drawable.cauhoi85,
            R.drawable.cauhoi86,
            R.drawable.cauhoi87,
            R.drawable.cauhoi88,
            R.drawable.cauhoi89,
            R.drawable.cauhoi90,
            R.drawable.cauhoi91,
            R.drawable.cauhoi92,
            R.drawable.cauhoi93,
            R.drawable.cauhoi94,
            R.drawable.cauhoi95,
            R.drawable.cauhoi96,
            R.drawable.cauhoi97,
            R.drawable.cauhoi98,
            R.drawable.cauhoi99,
            R.drawable.cauhoi100,
            R.drawable.cauhoi101,
            R.drawable.cauhoi102,
            R.drawable.cauhoi103,
            R.drawable.cauhoi104,
            R.drawable.cauhoi105,
            R.drawable.cauhoi106,
            R.drawable.cauhoi107,
            R.drawable.cauhoi108,
            R.drawable.cauhoi109,
            R.drawable.cauhoi110};

    public SaHinh_Adapter(Context context, int resource, ArrayList<SaHinh> object){
        super(context, resource, object);
        this.context = context;
        this.layout = resource;
        this.arrayList = object;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        SaHinh saHinh = getItem(position);

        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        convertView = layoutInflater.inflate(R.layout.layout_row_sahinh, null);

        ImageView img = convertView.findViewById(R.id.img_sahinh);
        TextView txt_cauhoi = convertView.findViewById(R.id.cauhoi);
        TextView txt_cautraloi = convertView.findViewById(R.id.cautraloi);

        int lenght = arrayList.size();
        for(int i = 1; i <= lenght; i++)
        {
            txt_cauhoi.setText("Câu " + String.valueOf(arrayList.indexOf(arrayList.get(position)) + 1) + ": " + arrayList.get(position).getCauhoi());
            img.setImageResource(image[position]);
            txt_cautraloi.setText(arrayList.get(position).getCautraloi());
        }
        return convertView;
    }
}
