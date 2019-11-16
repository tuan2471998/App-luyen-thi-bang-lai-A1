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

import com.example.thientuan.deanmobile.Model.HeThongBienBao;
import com.example.thientuan.deanmobile.R;

import java.util.ArrayList;

/**
 * Created by ThienTuan on 15/11/2019.
 */

public class HeThongBienBao_Adapter extends ArrayAdapter<HeThongBienBao> {
    Context context;
    int layout;
    ArrayList<HeThongBienBao> arrayList;
    int[] image = {R.drawable.cauhoi111,
            R.drawable.cauhoi112,
            R.drawable.cauhoi113,
            R.drawable.cauhoi114,
            R.drawable.cauhoi115,
            R.drawable.cauhoi116,
            R.drawable.cauhoi117,
            R.drawable.cauhoi118,
            R.drawable.cauhoi119,
            R.drawable.cauhoi120_121_122,
            R.drawable.cauhoi120_121_122,
            R.drawable.cauhoi120_121_122,
            R.drawable.cauhoi123_124_125,
            R.drawable.cauhoi123_124_125,
            R.drawable.cauhoi123_124_125,
            R.drawable.cauhoi126_127_128,
            R.drawable.cauhoi126_127_128,
            R.drawable.cauhoi126_127_128,
            R.drawable.cauhoi129,
            R.drawable.cauhoi130,
            R.drawable.cauhoi131,
            R.drawable.cauhoi132_133,
            R.drawable.cauhoi132_133,
            R.drawable.cauhoi134,
            R.drawable.cauhoi135_136_137,
            R.drawable.cauhoi135_136_137,
            R.drawable.cauhoi135_136_137,
            R.drawable.cauhoi138,
            R.drawable.cauhoi139,
            R.drawable.cauhoi140_141,
            R.drawable.cauhoi140_141,
            R.drawable.cauhoi142,
            R.drawable.cauhoi143,
            R.drawable.cauhoi144,
            R.drawable.cauhoi145};

    public HeThongBienBao_Adapter(Context context, int resource, ArrayList<HeThongBienBao> object){
        super(context, resource, object);
        this.context = context;
        this.layout = resource;
        this.arrayList = object;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        HeThongBienBao heThongBienBao = getItem(position);

        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        convertView = layoutInflater.inflate(R.layout.layout_row_hethongbienbao, null);

        ImageView img = convertView.findViewById(R.id.img_hethongbienbao);
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
