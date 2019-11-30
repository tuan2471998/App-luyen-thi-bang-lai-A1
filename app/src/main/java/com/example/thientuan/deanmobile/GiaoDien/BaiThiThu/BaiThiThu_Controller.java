package com.example.thientuan.deanmobile.GiaoDien.BaiThiThu;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

/**
 * Created by ThienTuan on 28/11/2019.
 */

public class BaiThiThu_Controller {
    private DBHelper_BaiThiThu1 dbHelper;

    public BaiThiThu_Controller(Context context) {
        dbHelper= new DBHelper_BaiThiThu1(context);
    }

    public ArrayList<BaiThiThu1> getAllBaiThiThu(int loai){
        ArrayList<BaiThiThu1> lsData= new ArrayList<BaiThiThu1>();
        SQLiteDatabase db= dbHelper.getReadableDatabase();
        Cursor cursor= db.rawQuery("Select * from CauHoi where Loai = "+loai,null);
        cursor.moveToFirst();
        do {
            BaiThiThu1 item;
            item= new BaiThiThu1(cursor.getInt(0), cursor.getString(1), cursor.getString(3),
                    cursor.getString(4),cursor.getString(5), cursor.getString(6), "");
            lsData.add(item);
        }while (cursor.moveToNext());
        return lsData;
    }
}
