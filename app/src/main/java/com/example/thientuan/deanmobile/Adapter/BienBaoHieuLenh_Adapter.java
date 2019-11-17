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
import com.example.thientuan.deanmobile.Model.BienBaoHieuLenh;
import com.example.thientuan.deanmobile.R;

import java.util.ArrayList;

/**
 * Created by J Nguyen on 11/10/2019.
 */

public class BienBaoHieuLenh_Adapter extends ArrayAdapter<BienBaoHieuLenh> {

    Context context;
    int layout;
    ArrayList<BienBaoHieuLenh> arrayList;

    int[] image = {R.drawable.hieulenh_huongdithangphaitheo,
                    R.drawable.hieulenh_huongdiphaiphaitheo,
                    R.drawable.hieulenh_huongditraiphaitheo,
                    R.drawable.hieulenh_chiduocrephai,
                    R.drawable.hieulenh_chiduocretrai,
                    R.drawable.hieulenh_rephaidithang,
                    R.drawable.hieulenh_retraidithang,
                    R.drawable.hieulenh_retrairephai,
                    R.drawable.hieulenh_divongsangphai,
                    R.drawable.hieulenh_divongsangtrai,
                    R.drawable.hieulenh_vongxuyen,
                    R.drawable.hieulenh_xethoso,
                    R.drawable.hieulenh_dibo,
                    R.drawable.hieulenh_tocdotoithieu,
                    R.drawable.hieulenh_hethanchetocdo,
                    R.drawable.hieulenh_cauvuotphai,
                    R.drawable.hieulenh_cauvuottrai,
                    R.drawable.hieulenh_ancoi};

    public BienBaoHieuLenh_Adapter(Context context, int resource, ArrayList<BienBaoHieuLenh> object){
        super(context, resource, object);
        this.context = context;
        this.layout = resource;
        this.arrayList = object;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        BienBaoHieuLenh bienBaoHieuLenh = getItem(position);

        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        convertView = layoutInflater.inflate(R.layout.layout_row_bienbaohieulenh, null);

        ImageView img = convertView.findViewById(R.id.img_bienbaohieulenh);
        TextView txt_ten = convertView.findViewById(R.id.ten_bienbaohieulenh);
        TextView txt_noidung = convertView.findViewById(R.id.noidung_bienbaohieulenh);

        img.setImageResource(image[position]);
        txt_ten.setText(arrayList.get(position).getTen());
        txt_noidung.setText(arrayList.get(position).getNoidung());


        return convertView;
    }
}
