package com.example.thientuan.deanmobile.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.thientuan.deanmobile.Model.User_BienBaoCam;
import com.example.thientuan.deanmobile.R;

import java.util.ArrayList;

/**
 * Created by J Nguyen on 11/8/2019.
 */

public class UserAdapter_BienBaoCam extends ArrayList<User_BienBaoCam> {
    Context context;
    int layout;
    ArrayList<User_BienBaoCam> arrayList;
    public  UserAdapter_BienBaoCam(Context context, int resource, ArrayList<User_BienBaoCam> object){
        super(context, resource, object);
        this.context = context;
        this.layout = resource;
        this.arrayList = object;
    }
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(layout, null);
        ImageView img = convertView.findViewById(R.id.image_bienbaocam);
        TextView txt = convertView.findViewById(R.id.noidung_bienbaocam);
        if(arrayList.get(position).getLoaibien() == 1){
            txt.setText(arrayList.get(position).getNoidung());
        }
        return convertView;
    }

}
