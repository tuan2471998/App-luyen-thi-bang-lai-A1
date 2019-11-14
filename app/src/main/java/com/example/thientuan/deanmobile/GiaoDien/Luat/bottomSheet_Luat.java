package com.example.thientuan.deanmobile.GiaoDien.Luat;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.thientuan.deanmobile.R;

/**
 * Created by ThienTuan on 24/10/2019.
 */

public class bottomSheet_Luat extends BottomSheetDialogFragment {
    Button button_XeDap;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.bottom_sheet_luat, container, false);

        return  v;

//        button_XeDap = (Button) v.findViewById(R.id.button_XeDap);
//        button_XeDap.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent acti_LuatXeDap = new Intent(, Activity_LuatXeDap.class);
//                startActivity(acti_LuatXeDap);
//            }
//        });
    }
}
