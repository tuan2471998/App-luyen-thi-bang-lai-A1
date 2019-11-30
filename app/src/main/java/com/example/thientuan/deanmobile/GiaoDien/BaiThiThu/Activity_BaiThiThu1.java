package com.example.thientuan.deanmobile.GiaoDien.BaiThiThu;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.thientuan.deanmobile.R;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Activity_BaiThiThu1 extends FragmentActivity {

    private static final int NUM_PAGES = 20;

    private ViewPager mPager;

    private PagerAdapter pagerAdapter;

    private TextView tvTimer;

    private Button btnNopBai, btnXemDiem;

    public int checkAns = 0;

    BaiThiThu_Controller baiThiThu_controller;
    ArrayList<BaiThiThu1> arrayList;
    CounterClass timer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__bai_thi_thu1);

        // Instantiate a ViewPager and a PagerAdapter.
        mPager = (ViewPager) findViewById(R.id.pager);
        pagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        mPager.setAdapter(pagerAdapter);
        mPager.setPageTransformer(true, new DepthPageTransformer());

        baiThiThu_controller = new BaiThiThu_Controller(this);
        arrayList = new ArrayList<BaiThiThu1>();
        Random rd = new Random();
        arrayList = baiThiThu_controller.getAllBaiThiThu(rd.nextInt(6) + 1);

        DBHelper_BaiThiThu1 db = new DBHelper_BaiThiThu1(this);
        try {
            db.createDataBase();
        } catch (IOException e) {
            e.printStackTrace();
        }

        timer = new CounterClass(420*1000, 1000);
        tvTimer = (TextView)findViewById(R.id.tvTimer);
        timer.start();

        btnNopBai = (Button)findViewById(R.id.btnNopBai);;
        btnNopBai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timer.cancel();
                result();
            }
        });

        btnXemDiem = (Button)findViewById(R.id.btnXemDiem);
        btnXemDiem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acti_xemdiem = new Intent(Activity_BaiThiThu1.this, Activity_KetQua.class);
                acti_xemdiem.putExtra("arrayList", arrayList);
                startActivity(acti_xemdiem);
            }
        });
    }

    public ArrayList<BaiThiThu1> getData(){
        return arrayList;
    }

    @Override
    public void onBackPressed() {
        if (mPager.getCurrentItem() == 0) {
            // If the user is currently looking at the first step, allow the system to handle the
            // Back button. This calls finish() on this activity and pops the back stack.
            super.onBackPressed();
        } else {
            // Otherwise, select the previous step.
            mPager.setCurrentItem(mPager.getCurrentItem() - 1);
        }
    }

    /**
     * A simple pager adapter that represents 5 ScreenSlidePageFragment objects, in
     * sequence.
     */
    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            return Fragment_BaiThiThu1.create(position, checkAns);
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }

    public class DepthPageTransformer implements ViewPager.PageTransformer {
        private static final float MIN_SCALE = 0.75f;

        public void transformPage(View view, float position) {
            int pageWidth = view.getWidth();

            if (position < -1) { // [-Infinity,-1)
                // This page is way off-screen to the left.
                view.setAlpha(0f);

            } else if (position <= 0) { // [-1,0]
                // Use the default slide transition when moving to the left page
                view.setAlpha(1f);
                view.setTranslationX(0f);
                view.setScaleX(1f);
                view.setScaleY(1f);

            } else if (position <= 1) { // (0,1]
                // Fade the page out.
                view.setAlpha(1 - position);

                // Counteract the default slide transition
                view.setTranslationX(pageWidth * -position);

                // Scale the page down (between MIN_SCALE and 1)
                float scaleFactor = MIN_SCALE
                        + (1 - MIN_SCALE) * (1 - Math.abs(position));
                view.setScaleX(scaleFactor);
                view.setScaleY(scaleFactor);

            } else { // (1,+Infinity]
                // This page is way off-screen to the right.
                view.setAlpha(0f);
            }
        }
    }

    public class CounterClass extends CountDownTimer {
        /**
         * @param millisInFuture    The number of millis in the future from the call
         *                          to {@link #start()} until the countdown is done and {@link #onFinish()}
         *                          is called.
         * @param countDownInterval The interval along the way to receive
         *                          {@link #onTick(long)} callbacks.
         */


        //millisInFuture: 60*1000
        //countDownInterval:  1000
        public CounterClass(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long millisUntilFinished) {
            String countTime = String.format("%02d:%02d", TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished), TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) - TimeUnit.MINUTES.toSeconds(
                    TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished)));
            tvTimer.setText(countTime); //SetText cho textview hiện thị thời gian.
        }

        @Override
        public void onFinish() {
            tvTimer.setText("00:00");  //SetText cho textview hiện thị thời gian.
//            result();
        }
    }

    public void result(){
        checkAns = 1;

        if(mPager.getCurrentItem() >= 4){
            mPager.setCurrentItem(mPager.getCurrentItem() - 4);
        }
        else if(mPager.getCurrentItem() < 4){
            mPager.setCurrentItem(mPager.getCurrentItem() + 4);
        }

        btnXemDiem.setVisibility(View.VISIBLE);
        btnNopBai.setVisibility(View.GONE);
    }
}