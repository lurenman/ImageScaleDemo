package com.example.lurenman.imagescaledemo.activity;

import android.support.annotation.NonNull;

import com.bumptech.glide.Glide;
import com.example.lurenman.imagescaledemo.R;
import com.example.lurenman.imagescaledemo.views.PinchImageView;

/**
 * @author: baiyang.
 * Created on 2018/2/5.
 */

public class PinchImageViewActivity extends BaseActivity {

    private PinchImageView pi_img;

    @NonNull
    @Override
    protected String getActionBarTitle() {
        return "PinchImageView";
    }

    @Override
    protected void initViews() {
       setContentView(R.layout.activity_pinchimage_view);
        pi_img = (PinchImageView) findViewById(R.id.pi_img);
    }

    @Override
    protected void initVariables() {

    }

    @Override
    protected void loadData() {
        Glide.with(this).load("http://file.ataw.cn/HospPerformance/Model/Image/2017/06/20/File/20170620173507137A9A7CC4BD991149058A765A34095728CF.jpg?ut=20170620173516").into(pi_img);
    }
}
