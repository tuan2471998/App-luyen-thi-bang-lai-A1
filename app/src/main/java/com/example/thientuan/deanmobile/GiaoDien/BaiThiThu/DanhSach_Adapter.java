package com.example.thientuan.deanmobile.GiaoDien.BaiThiThu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.thientuan.deanmobile.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by ThienTuan on 30/11/2019.
 */

public class DanhSach_Adapter extends BaseAdapter {

    ArrayList lsData;
    LayoutInflater inflater;

    public DanhSach_Adapter(ArrayList lsData, Context context) {
        this.lsData = lsData;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return lsData.size();
    }

    @Override
    public Object getItem(int position) {
        return lsData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        BaiThiThu1 data = (BaiThiThu1) getItem(position);
        ViewHolder holder;
        if(convertView == null){
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.item_danhsach, null);
            holder.item_cauhoi = (TextView)convertView.findViewById(R.id.item_cauhoi);
            holder.item_cautraloi = (TextView)convertView.findViewById(R.id.item_cautraloi);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder)convertView.getTag();
        }

        int i = position + 1;
        holder.item_cauhoi.setText("Câu " + i + ": ");
        holder.item_cautraloi.setText(data.getTraloi());

        return convertView;
    }

    private static class ViewHolder{
        TextView item_cauhoi, item_cautraloi;
    }
}
