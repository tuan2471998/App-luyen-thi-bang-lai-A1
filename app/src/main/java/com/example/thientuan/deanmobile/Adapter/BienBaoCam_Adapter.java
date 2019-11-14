package com.example.thientuan.deanmobile.Adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.thientuan.deanmobile.Model.BienBaoCam;
import com.example.thientuan.deanmobile.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ThienTuan on 09/11/2019.
 */

public class BienBaoCam_Adapter extends ArrayAdapter<BienBaoCam> {

    Context context;
    int layout;
    ArrayList<BienBaoCam> arrayList;

    int[] image = {R.drawable.bienbaocam_dixedap,
            R.drawable.bienbaocam_xesucvat,
            R.drawable.bienbaocam_hanchetrongluong,
            R.drawable.bienbaocam_hanchechieucao,
            R.drawable.bienbaocam_hanchechieungang,
            R.drawable.bienbaocam_retrai,
            R.drawable.bienbaocam_rephai,
            R.drawable.bienbaocam_duongcam,
            R.drawable.bienbaocam_dinguocchieu,
            R.drawable.bienbaocam_xeoto,
            R.drawable.bienbaocam_otorephai,
            R.drawable.bienbaocam_otoretrai,
            R.drawable.bienbaocam_xemoto,
            R.drawable.bienbaocam_otovamoto,
            R.drawable.bienbaocam_ototai,
            R.drawable.bienbaocam_chohangnguyhiem,
            R.drawable.bienbaocam_otokhachvaototai,
            R.drawable.bienbaocam_maykeoromoc,
            R.drawable.bienbaocam_maykeo,
            R.drawable.bienbaocam_xedaptho,
            R.drawable.bienbaocam_xeganmay,
            R.drawable.bienbaocam_xebabanhcodongco,
            R.drawable.bienbaocam_xebabanh,
            R.drawable.bienbaocam_nguoidibo,
            R.drawable.bienbaocam_xenguoikeo,
            R.drawable.bienbaocam_hanchetrongluong,
            R.drawable.bienbaocam_chieudaioto,
            R.drawable.bienbaocam_chieudairomoc,
            R.drawable.bienbaocam_khoangcachgiuahaixe,
            R.drawable.bienbaocam_quayxe,
            R.drawable.bienbaocam_otoquayxe,
            R.drawable.bienbaocam_camvuot,
            R.drawable.bienbaocam_otovuot,
            R.drawable.bienbaocam_tocdotoida,
            R.drawable.bienbaocam_bamcoi,
            R.drawable.bienbaocam_kiemtra,
            R.drawable.bienbaocam_dungvadoxe,
            R.drawable.bienbaocam_doxe,
            R.drawable.bienbaocam_doxengayle,
            R.drawable.bienbaocam_doxengaychan,
            R.drawable.bienbaocam_nhuongduongxecogioi,
            R.drawable.bienbaocam_dithang,
            R.drawable.bienbaocam_retraiphai,
            R.drawable.bienbaocam_retraidithang,
            R.drawable.bienbaocam_rephaidithang,
            R.drawable.bienbaocam_xecongnong};

    public BienBaoCam_Adapter(Context context, int resource, ArrayList<BienBaoCam> object){
        super(context, resource, object);
        this.context = context;
        this.layout = resource;
        this.arrayList = object;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        BienBaoCam bienBaoCam = getItem(position);

        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        convertView = layoutInflater.inflate(R.layout.layout_row_bienbaocam, null);

        ImageView img = convertView.findViewById(R.id.img_bienbaocam);
        TextView txt_ten = convertView.findViewById(R.id.ten_bienbaocam);
        TextView txt_noidung = convertView.findViewById(R.id.noidung_bienbaocam);

        img.setImageResource(image[position]);
        txt_ten.setText(arrayList.get(position).getTen());
        txt_noidung.setText(arrayList.get(position).getNoidung());

        return convertView;
    }
}
