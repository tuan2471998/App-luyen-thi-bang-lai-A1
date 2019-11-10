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

        TextView txt_noidung = convertView.findViewById(R.id.noidung_bienbaonguyhiem);

        txt_noidung.setText(arrayList.get(position).getNoidung());

        return convertView;
    }
}
