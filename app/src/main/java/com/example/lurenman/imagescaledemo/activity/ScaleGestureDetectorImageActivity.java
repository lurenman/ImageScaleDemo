package com.example.lurenman.imagescaledemo.activity;

import android.support.annotation.NonNull;

import com.example.lurenman.imagescaledemo.R;


/**
 * @author: baiyang.
 * Created on 2018/2/2.
 */

public class ScaleGestureDetectorImageActivity extends BaseActivity {

   // private ScaleGestureImageView mScaleGestureImageView;

    @NonNull
    @Override
    protected String getActionBarTitle() {
        return "ScaleGestureDetectorImage";
    }

    @Override
    protected void initViews() {
        setContentView(R.layout.activity_scalegesturedetector_image);
        //mScaleGestureImageView = (ScaleGestureImageView) findViewById(R.id.mScaleGestureImageView);
    }

    @Override
    protected void initVariables() {

    }

    @Override
    protected void loadData() {

    }
}
