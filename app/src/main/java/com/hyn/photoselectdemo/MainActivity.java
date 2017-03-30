package com.hyn.photoselectdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.hyn.photoselectlibrary.photo.PhotoGetHelper;
import com.hyn.photoselectlibrary.photo.ResultInfo;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    private ImageView iv_img;
    private PhotoGetHelper helper;
    private ResultInfo resultInfo;
    private File file;//图片

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helper = new PhotoGetHelper(this);
        iv_img = (ImageView) findViewById(R.id.iv_img);
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.showDialog();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        resultInfo = helper.operationResult(requestCode, resultCode, data, iv_img);
        if (resultInfo != null && resultInfo.isDealFainished()) {
            iv_img.setVisibility(View.VISIBLE);
            file = new File(resultInfo.getFilePath());
        }
    }
}
