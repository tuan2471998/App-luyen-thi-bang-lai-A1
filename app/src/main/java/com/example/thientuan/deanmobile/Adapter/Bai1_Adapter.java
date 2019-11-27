package com.example.thientuan.deanmobile.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.thientuan.deanmobile.Model.Bai1;
import com.example.thientuan.deanmobile.Model.BienBaoCam;
import com.example.thientuan.deanmobile.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by J Nguyen on 11/27/2019.
 */

public class Bai1_Adapter extends PagerAdapter {

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return false;
    }
}
