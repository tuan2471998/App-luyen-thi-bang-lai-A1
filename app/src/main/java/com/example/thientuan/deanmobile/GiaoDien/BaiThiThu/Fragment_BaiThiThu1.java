package com.example.thientuan.deanmobile.GiaoDien.BaiThiThu;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.thientuan.deanmobile.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_BaiThiThu1 extends Fragment {

    ArrayList<BaiThiThu1> arrayList;
    public static final String ARG_PAGE = "page";
    private int Pagenumber;

    TextView stt, cauhoi;
    RadioGroup radioGroup;
    RadioButton dapan1, dapan2, dapan3, dapan4;

    public Fragment_BaiThiThu1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_fragment__bai_thi_thu1, container, false);

        stt = (TextView)rootView.findViewById(R.id.stt);
        cauhoi = (TextView)rootView.findViewById(R.id.cauhoi);
        dapan1 = (RadioButton)rootView.findViewById(R.id.dapan1);
        dapan2 = (RadioButton)rootView.findViewById(R.id.dapan2);
        dapan3 = (RadioButton)rootView.findViewById(R.id.dapan3);
        dapan4 = (RadioButton)rootView.findViewById(R.id.dapan4);
        radioGroup = (RadioGroup)rootView.findViewById(R.id.radioGroup);

        return rootView;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        arrayList = new ArrayList<BaiThiThu1>();
        Activity_BaiThiThu1 activity_baiThiThu1 = (Activity_BaiThiThu1) getActivity();
        arrayList = activity_baiThiThu1.getData();
        Pagenumber = getArguments().getInt(ARG_PAGE);
    }

    public  static Fragment_BaiThiThu1 create(int pageNumber){
        Fragment_BaiThiThu1 fragment_baiThiThu1 = new Fragment_BaiThiThu1();
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, pageNumber);
        fragment_baiThiThu1.setArguments(args);
        return fragment_baiThiThu1;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        stt.setText("Câu " + (Pagenumber+1));
        cauhoi.setText(arrayList.get(Pagenumber).getNoidung());
        dapan1.setText(arrayList.get(Pagenumber).getDapan1());
        dapan2.setText(arrayList.get(Pagenumber).getDapan2());
        dapan3.setText(arrayList.get(Pagenumber).getDapan3());
        dapan4.setText(arrayList.get(Pagenumber).getDapan4());
    }
}
