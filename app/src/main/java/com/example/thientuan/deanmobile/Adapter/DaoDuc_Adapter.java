package com.example.thientuan.deanmobile.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.thientuan.deanmobile.Model.DaoDuc;
import com.example.thientuan.deanmobile.Model.KhaiNiemVaQuyTac;
import com.example.thientuan.deanmobile.R;

import java.util.ArrayList;

/**
 * Created by ThienTuan on 15/11/2019.
 */

public class DaoDuc_Adapter extends ArrayAdapter<DaoDuc> {
    Context context;
    int layout;
    ArrayList<DaoDuc> arrayList;

    public DaoDuc_Adapter(Context context, int resource, ArrayList<DaoDuc> object){
        super(context, resource, object);
        this.context = context;
        this.layout = resource;
        this.arrayList = object;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        DaoDuc daoDuc = getItem(position);

        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        convertView = layoutInflater.inflate(R.layout.layout_row_daoduc, null);

        TextView txt_ten = convertView.findViewById(R.id.cauhoi);
        TextView txt_noidung = convertView.findViewById(R.id.traloi);

        int lenght = arrayList.size();
        for(int i = 1; i <= lenght; i++)
        {
            txt_ten.setText("Câu " + String.valueOf(arrayList.indexOf(arrayList.get(position)) + 1) + ": " + arrayList.get(position).getCauhoi());
            txt_noidung.setText(arrayList.get(position).getCautrailoi());
        }
        return convertView;
    }
}
