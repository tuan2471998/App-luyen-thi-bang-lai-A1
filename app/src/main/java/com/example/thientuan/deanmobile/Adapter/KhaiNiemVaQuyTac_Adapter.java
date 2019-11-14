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
import com.example.thientuan.deanmobile.Model.KhaiNiemVaQuyTac;
import com.example.thientuan.deanmobile.R;

import java.util.ArrayList;

/**
 * Created by J Nguyen on 11/14/2019.
 */

public class KhaiNiemVaQuyTac_Adapter extends ArrayAdapter<KhaiNiemVaQuyTac> {
    Context context;
    int layout;
    ArrayList<KhaiNiemVaQuyTac> arrayList;

    public KhaiNiemVaQuyTac_Adapter(Context context, int resource, ArrayList<KhaiNiemVaQuyTac> object){
        super(context, resource, object);
        this.context = context;
        this.layout = resource;
        this.arrayList = object;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        KhaiNiemVaQuyTac khaiNiemVaQuyTac = getItem(position);

        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        convertView = layoutInflater.inflate(R.layout.layout_row_khainiemvaquytac, null);

        TextView txt_ten = convertView.findViewById(R.id.cauhoi);
        TextView txt_noidung = convertView.findViewById(R.id.traloi);

        txt_ten.setText(arrayList.get(position).getCauhoi());
        txt_noidung.setText(arrayList.get(position).getCautrailoi());

        return convertView;
    }
}
