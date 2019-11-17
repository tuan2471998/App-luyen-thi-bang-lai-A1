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
import com.example.thientuan.deanmobile.Model.VachKeDuong;
import com.example.thientuan.deanmobile.R;

import java.util.ArrayList;

/**
 * Created by Admin on 11/11/2019.
 */

public class VachKeDuong_Adapter extends ArrayAdapter<VachKeDuong> {
    Context context;
    int layout;
    ArrayList<VachKeDuong> arrayList;

    int[] image = {R.drawable.vach_1,
            R.drawable.vach_2,
            R.drawable.vach_3,
            R.drawable.vach_4,
            R.drawable.vach_5,
            R.drawable.vach_6,
            R.drawable.vach_7,
            R.drawable.vach_13,
            R.drawable.vach_8,
            R.drawable.vach_9,
            R.drawable.vach_10,
            R.drawable.vach_11,
            R.drawable.vach_12};

    public VachKeDuong_Adapter(Context context, int resource, ArrayList<VachKeDuong> object){
        super(context, resource, object);
        this.context = context;
        this.layout = resource;
        this.arrayList = object;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        VachKeDuong vachKeDuong = getItem(position);

        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        convertView = layoutInflater.inflate(R.layout.layout_row_vachkeduong, null);

        ImageView img = convertView.findViewById(R.id.img_vachkeduong);
        TextView txt_ten = convertView.findViewById(R.id.ten_vachkeduong);
        TextView txt_noidung = convertView.findViewById(R.id.noidung_vachkeduong);

        img.setImageResource(image[position]);
        txt_ten.setText(arrayList.get(position).getTen());
        txt_noidung.setText(arrayList.get(position).getNoidung());

        return convertView;
    }
}
