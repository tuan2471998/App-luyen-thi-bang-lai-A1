package com.example.thientuan.deanmobile.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.thientuan.deanmobile.Model.User_BienBaoCam;
import com.example.thientuan.deanmobile.R;

import java.util.ArrayList;

/**
 * Created by ThienTuan on 31/10/2019.
 */

public class UserAdapter_BienBaoCam extends ArrayAdapter<User_BienBaoCam> {
    public UserAdapter_BienBaoCam(Context context, ArrayList<User_BienBaoCam> user) {
        super(context, 0, user);
    }

    @Override
    public View getView(int position,View convertView,ViewGroup parent) {
        User_BienBaoCam user = getItem(position);

        if(convertView == null)
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_user_bienbaocam,parent, false);

        TextView tv_hinhanh = convertView.findViewById(R.id.tv_hinhanh);
        TextView tv_noidung = convertView.findViewById(R.id.tv_noidung);
        TextView tv_loaibienbao = convertView.findViewById(R.id.tv_loaibienbao);

        tv_hinhanh.setText(user.anh);
        tv_noidung.setText(user.noidung);
        tv_loaibienbao.setText(user.noidung);

        return convertView;
    }
}
