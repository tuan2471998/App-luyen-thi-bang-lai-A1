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

        TextView txt_noidung = convertView.findViewById(R.id.noidung_bienbaochidan);

        txt_noidung.setText(arrayList.get(position).getNoidung());

        return convertView;
    }
}
