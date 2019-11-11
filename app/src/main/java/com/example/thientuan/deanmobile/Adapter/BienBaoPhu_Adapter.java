package com.example.thientuan.deanmobile.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.thientuan.deanmobile.Model.BienBaoCam;
import com.example.thientuan.deanmobile.Model.BienBaoPhu;
import com.example.thientuan.deanmobile.R;

import java.util.ArrayList;

/**
 * Created by J Nguyen on 11/11/2019.
 */

public class BienBaoPhu_Adapter extends ArrayAdapter<BienBaoPhu> {
    Context context;
    int layout;
    ArrayList<BienBaoPhu> arrayList;

    public BienBaoPhu_Adapter(Context context, int resource, ArrayList<BienBaoPhu> object){
        super(context, resource, object);
        this.context = context;
        this.layout = resource;
        this.arrayList = object;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        BienBaoPhu bienBaoPhu = getItem(position);

        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        convertView = layoutInflater.inflate(R.layout.layout_row_bienbaophu, null);

        TextView txt_ten = convertView.findViewById(R.id.ten_bienbaophu);
        TextView txt_noidung = convertView.findViewById(R.id.noidung_bienbaophu);

        txt_ten.setText(arrayList.get(position).getTen());
        txt_noidung.setText(arrayList.get(position).getNoidung());

        return convertView;
    }
}
