package com.example.thientuan.deanmobile.GiaoDien.BaiThiThu;


import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.thientuan.deanmobile.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_BaiThiThu1 extends Fragment {

    ArrayList<BaiThiThu1> arrayList_quest;
    public static final String ARG_PAGE = "page";
    public static final String ARG_CHECKANSWER = "checkAnswer";
    private int Pagenumber;
    private int checkAns;

    TextView stt, cauhoi;
    RadioGroup radioGroup;
    RadioButton dapan1, dapan2, dapan3;
    ImageView img_cauhoi;

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
        img_cauhoi = (ImageView)rootView.findViewById(R.id.hinhanh_cauhoi);
        radioGroup = (RadioGroup)rootView.findViewById(R.id.radioGroup);

        return rootView;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        arrayList_quest = new ArrayList<BaiThiThu1>();
        Activity_BaiThiThu1 activity_baiThiThu1 = (Activity_BaiThiThu1) getActivity();
        arrayList_quest = activity_baiThiThu1.getData();
        Pagenumber = getArguments().getInt(ARG_PAGE);
        checkAns = getArguments().getInt(ARG_CHECKANSWER);
    }

    public  static Fragment_BaiThiThu1 create(int pageNumber, int checkAnswer ){
        Fragment_BaiThiThu1 fragment_baiThiThu1 = new Fragment_BaiThiThu1();
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, pageNumber);
        args.putInt(ARG_CHECKANSWER, checkAnswer);
        fragment_baiThiThu1.setArguments(args);
        return fragment_baiThiThu1;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        stt.setText("Câu " + (Pagenumber+1));
        cauhoi.setText(arrayList_quest.get(Pagenumber).getNoidung());
        dapan1.setText(getItem(Pagenumber).getDapan1());
        dapan2.setText(getItem(Pagenumber).getDapan2());
        dapan3.setText(getItem(Pagenumber).getDapan3());

        int id = getResources().getIdentifier(getItem(Pagenumber).getImage()+"","drawable", "com.example.thientuan.deanmobile");
        if(id == 0)
        {
            img_cauhoi.setVisibility(View.GONE);
        } else {
            img_cauhoi.setImageResource(id);
        }

        if(checkAns != 0){
            dapan1.setClickable(false);
            dapan2.setClickable(false);
            dapan3.setClickable(false);
            getCheckAns(getItem(Pagenumber).getDapandung().toString());
        }

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                getItem(Pagenumber).choiceID = checkedId;
                getItem(Pagenumber).setTraloi(getChoiceFromID(checkedId));
            }
        });
    }

    public BaiThiThu1 getItem(int position){
        return arrayList_quest.get(position);
    }

    private String getChoiceFromID(int ID) {
        if (ID == R.id.dapan1) {
            return "A";
        } else if (ID == R.id.dapan2) {
            return "B";
        } else if (ID == R.id.dapan3) {
            return "C";
        } else return "";
    }

    private void getCheckAns(String ans){
        if(ans.equals("A")==true){
            dapan1.setBackgroundColor(Color.CYAN);
        }else if(ans.equals("B")==true){
            dapan2.setBackgroundColor(Color.CYAN);
        }else if(ans.equals("C")==true){
            dapan3.setBackgroundColor(Color.CYAN);
        }else ;
    }
}
