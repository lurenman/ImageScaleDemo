package com.example.lurenman.imagescaledemo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lurenman.imagescaledemo.activity.PinchImageViewActivity;
import com.example.lurenman.imagescaledemo.activity.ScaleGestureDetectorImageActivity;


/**
 * matrix 用矩阵来绘制(从左上角起始的矩阵区域)
 * <p>
 * fitXY  把图片不按比例扩大/缩小到View的大小显示（确保图片会完整显示，并充满View）
 * <p>
 * fitStart  把图片按比例扩大/缩小到View的宽度，显示在View的上部分位置（图片会完整显示）
 * <p>
 * fitCenter  把图片按比例扩大/缩小到View的宽度，居中显示（图片会完整显示）
 * <p>
 * fitEnd   把图片按比例扩大/缩小到View的宽度，显示在View的下部分位置（图片会完整显示）
 * <p>
 * center  按图片的原来size居中显示，当图片宽超过View的宽，则截取图片的居中部分显示，当图片宽小于View的宽，则图片居中显示
 * <p>
 * centerCrop  按比例扩大/缩小图片的size居中显示，使得图片的高等于View的高，使得图片宽等于或大于View的宽
 * <p>
 * centerInside  将图片的内容完整居中显示，使得图片按比例缩小或原来的大小（图片比View小时）使得图片宽等于或小于View的宽 （图片会完整显示）
 */

public class MainActivity extends AppCompatActivity {
    private Context mContext;
    private Button bt_ScaleGestureDetector;
    private Button bt_PinchImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
        initViews();
        initEvents();
    }

    private void initViews() {
        bt_ScaleGestureDetector = (Button) findViewById(R.id.bt_ScaleGestureDetector);
        bt_PinchImageView = (Button) findViewById(R.id.bt_PinchImageView);
    }

    private void initEvents() {
        bt_ScaleGestureDetector.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, ScaleGestureDetectorImageActivity.class);
                startActivity(intent);
            }
        });
        bt_PinchImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, PinchImageViewActivity.class);
                startActivity(intent);
            }
        });
    }
}
