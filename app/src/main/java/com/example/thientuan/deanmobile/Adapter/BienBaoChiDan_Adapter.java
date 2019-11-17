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
import com.example.thientuan.deanmobile.Model.BienBaoChiDan;
import com.example.thientuan.deanmobile.R;

import java.util.ArrayList;

/**
 * Created by J Nguyen on 11/10/2019.
 */

public class BienBaoChiDan_Adapter extends ArrayAdapter<BienBaoChiDan> {
    Context context;
    int layout;
    ArrayList<BienBaoChiDan> arrayList;

    int[] image = {R.drawable.chidan_1,
            R.drawable.chidan_2,
            R.drawable.chidan_3,
            R.drawable.chidan_4,
            R.drawable.chidan_5,
            R.drawable.chidan_6,
            R.drawable.chidan_7,
            R.drawable.chidan_8,
            R.drawable.chidan_9,
            R.drawable.chidan_10,
            R.drawable.chidan_11,
            R.drawable.chidan_12,
            R.drawable.chidan_13,
            R.drawable.chidan_14,
            R.drawable.chidan_15,
            R.drawable.chidan_16,
            R.drawable.chidan_17,
            R.drawable.chidan_18,
            R.drawable.chidan_19,
            R.drawable.chidan_20,
            R.drawable.chidan_21,
            R.drawable.chidan_22,
            R.drawable.chidan_23,
            R.drawable.chidan_24,
            R.drawable.chidan_25,
            R.drawable.chidan_26,
            R.drawable.chidan_27,
            R.drawable.chidan_28,
            R.drawable.chidan_29,
            R.drawable.chidan_30,
            R.drawable.chidan_31,
            R.drawable.chidan_32,
            R.drawable.chidan_33,
            R.drawable.chidan_34,
            R.drawable.chidan_35,
            R.drawable.chidan_36,
            R.drawable.chidan_37,
            R.drawable.chidan_38,
            R.drawable.chidan_39,
            R.drawable.chidan_40,
            R.drawable.chidan_41,
            R.drawable.chidan_42,
            R.drawable.chidan_43,
            R.drawable.chidan_44,
            R.drawable.chidan_45,
            R.drawable.chidan_46,
            R.drawable.chidan_47,
            R.drawable.chidan_48,
            R.drawable.chidan_49,
            R.drawable.chidan_50,
            R.drawable.chidan_51,
            R.drawable.chidan_52,
            R.drawable.chidan_53,
            R.drawable.chidan_54,
            R.drawable.chidan_55,
            R.drawable.chidan_56};

    public BienBaoChiDan_Adapter(Context context, int resource, ArrayList<BienBaoChiDan> object){
        super(context, resource, object);
        this.context = context;
        this.layout = resource;
        this.arrayList = object;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        BienBaoChiDan bienBaoChiDan = getItem(position);

        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        convertView = layoutInflater.inflate(R.layout.layout_row_bienbaochidan, null);

        ImageView img = convertView.findViewById(R.id.img_bienbaochidan);
        TextView txt_ten = convertView.findViewById(R.id.ten_bienbaochidan);
        TextView txt_noidung = convertView.findViewById(R.id.noidung_bienbaochidan);

        img.setImageResource(image[position]);
        txt_ten.setText(arrayList.get(position).getTen());
        txt_noidung.setText(arrayList.get(position).getNoidung());


        return convertView;
    }
}
