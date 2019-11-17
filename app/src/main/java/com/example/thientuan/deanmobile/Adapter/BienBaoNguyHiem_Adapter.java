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
import com.example.thientuan.deanmobile.Model.BienBaoNguyHiem;
import com.example.thientuan.deanmobile.R;

import java.util.ArrayList;

/**
 * Created by J Nguyen on 11/10/2019.
 */

public class BienBaoNguyHiem_Adapter extends ArrayAdapter<BienBaoNguyHiem> {

    Context context;
    int layout;
    ArrayList<BienBaoNguyHiem> arrayList;

    int[] image = {R.drawable.bienbaonguyhiem_1,
            R.drawable.bienbaonguyhiem_2,
            R.drawable.bienbaonguyhiem_3,
            R.drawable.bienbaonguyhiem_4,
            R.drawable.bienbaonguyhiem_5,
            R.drawable.bienbaonguyhiem_6,
            R.drawable.bienbaonguyhiem_7,
            R.drawable.bienbaonguyhiem_8,
            R.drawable.bienbaonguyhiem_9,
            R.drawable.bienbaonguyhiem_10,
            R.drawable.bienbaonguyhiem_11,
            R.drawable.bienbaonguyhiem_12,
            R.drawable.bienbaonguyhiem_13,
            R.drawable.bienbaonguyhiem_14,
            R.drawable.bienbaonguyhiem_15,
            R.drawable.bienbaonguyhiem_16,
            R.drawable.bienbaonguyhiem_17,
            R.drawable.bienbaonguyhiem_18,
            R.drawable.bienbaonguyhiem_19,
            R.drawable.bienbaonguyhiem_20,
            R.drawable.bienbaonguyhiem_21,
            R.drawable.bienbaonguyhiem_22,
            R.drawable.bienbaonguyhiem_23,
            R.drawable.bienbaonguyhiem_24,
            R.drawable.bienbaonguyhiem_25,
            R.drawable.bienbaonguyhiem_26,
            R.drawable.bienbaonguyhiem_27,
            R.drawable.bienbaonguyhiem_28,
            R.drawable.bienbaonguyhiem_29,
            R.drawable.bienbaonguyhiem_30,
            R.drawable.bienbaonguyhiem_31,
            R.drawable.bienbaonguyhiem_32,
            R.drawable.bienbaonguyhiem_33,
            R.drawable.bienbaonguyhiem_34,
            R.drawable.bienbaonguyhiem_35,
            R.drawable.bienbaonguyhiem_36,
            R.drawable.bienbaonguyhiem_37,
            R.drawable.bienbaonguyhiem_38,
            R.drawable.bienbaonguyhiem_39,
            R.drawable.bienbaonguyhiem_40,
            R.drawable.bienbaonguyhiem_41,
            R.drawable.bienbaonguyhiem_42,
            R.drawable.bienbaonguyhiem_43,
            R.drawable.bienbaonguyhiem_44,
            R.drawable.bienbaonguyhiem_45,
            R.drawable.bienbaonguyhiem_46,
            R.drawable.bienbaonguyhiem_47,
            R.drawable.bienbaonguyhiem_48,
            R.drawable.bienbaonguyhiem_49,
            R.drawable.bienbaonguyhiem_50,
            R.drawable.bienbaonguyhiem_51,
            R.drawable.bienbaonguyhiem_52,
            R.drawable.bienbaonguyhiem_53,
            R.drawable.bienbaonguyhiem_54,
            R.drawable.bienbaonguyhiem_55,
            R.drawable.bienbaonguyhiem_56,
            R.drawable.bienbaonguyhiem_57,
            R.drawable.bienbaonguyhiem_58,
            R.drawable.bienbaonguyhiem_59,
            R.drawable.bienbaonguyhiem_60,
            R.drawable.bienbaonguyhiem_61,
            R.drawable.bienbaonguyhiem_62,
            R.drawable.bienbaonguyhiem_63,
            R.drawable.bienbaonguyhiem_64,
            R.drawable.bienbaonguyhiem_65};

    public BienBaoNguyHiem_Adapter(Context context, int resource, ArrayList<BienBaoNguyHiem> object){
        super(context, resource, object);
        this.context = context;
        this.layout = resource;
        this.arrayList = object;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        BienBaoNguyHiem bienBaoNguyHiem = getItem(position);

        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        convertView = layoutInflater.inflate(R.layout.layout_row_bienbaonguyhiem, null);

        ImageView img = convertView.findViewById(R.id.img_bienbaonguyhiem);
        TextView txt_ten = convertView.findViewById(R.id.ten_bienbaonguyhiem);
        TextView txt_noidung = convertView.findViewById(R.id.noidung_bienbaonguyhiem);

        img.setImageResource(image[position]);
        txt_ten.setText(arrayList.get(position).getTen());
        txt_noidung.setText(arrayList.get(position).getNoidung());

        return convertView;
    }
}
