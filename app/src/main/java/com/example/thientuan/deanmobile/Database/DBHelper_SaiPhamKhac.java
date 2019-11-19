package com.example.thientuan.deanmobile.Database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;

import com.example.thientuan.deanmobile.Model.SaiPhamKhac;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

/**
 * Created by ThienTuan on 19/11/2019.
 */

public class DBHelper_SaiPhamKhac {
    String DATABASE_NAME = "TN_A1.db";
    private static final String DB_PATH_SUFFIX = "/databases/";
    SQLiteDatabase db = null;

    Context context;

    public DBHelper_SaiPhamKhac(Context context) {
        this.context = context;
        processSQLite();
    }

    private void processSQLite() {
        File dbFile = context.getDatabasePath(DATABASE_NAME);
        if(!dbFile.exists()){
            try{
                CopyDatabaseFromAsset();
                Toast.makeText(context, "Copy successful !!!", Toast.LENGTH_SHORT).show();

            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }
    private void CopyDatabaseFromAsset() {
        try{
            InputStream databaseInputStream = context.getAssets().open(DATABASE_NAME);

            String outputStream = getPathDatabaseSystem();

            File file = new File(context.getApplicationInfo().dataDir + DB_PATH_SUFFIX);
            if(!file.exists()){
                file.mkdir();
            }

            OutputStream databaseOutputStream = new FileOutputStream(outputStream);

            byte[] buffer = new byte[1024];
            int length;
            while ((length = databaseInputStream.read(buffer)) > 0){
                databaseOutputStream.write(buffer,0,length);
            }


            databaseOutputStream.flush();
            databaseOutputStream.close();
            databaseInputStream.close();

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    private String getPathDatabaseSystem() {
        return context.getApplicationInfo().dataDir + DB_PATH_SUFFIX + DATABASE_NAME;
    }
    public ArrayList<SaiPhamKhac> getAllSaiPhamKhac(){
        ArrayList<SaiPhamKhac> arrayList = new ArrayList<>();

        db = context.openOrCreateDatabase(DATABASE_NAME,context.MODE_PRIVATE,null);

        String sql = "select * from Luat where LoaiLuat = 3";

        Cursor cursor  = db.rawQuery(sql ,null);
        while (cursor.moveToNext()){
            String noidung = cursor.getString(2);
            String mucphat = cursor.getString(3);

            arrayList.add(new SaiPhamKhac(noidung,mucphat ));
        }
        return arrayList;
    }
}
