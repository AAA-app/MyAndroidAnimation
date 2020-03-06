package com.aaa.myandroidanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean isAndroidVisible = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void animation(View view) {
        ImageView robotImageView = findViewById(R.id.robot_imageView);
        ImageView androidImageView = findViewById(R.id.android_imageView);

        if (isAndroidVisible) {
            robotImageView.animate().alpha(0).rotation(3600).setDuration(3000).scaleX(0).scaleY(0).setDuration(3000);
            androidImageView.animate().alpha(1).rotation(3600).setDuration(3000).scaleX(1f).scaleY(1f).setDuration(3000);
            isAndroidVisible = false;
        } else {
            androidImageView.animate().alpha(0).rotation(-3600).setDuration(3000).scaleX(0).scaleY(0).setDuration(3000);
            robotImageView.animate().alpha(1).rotation(-3600).setDuration(3000).scaleX(1f).scaleY(1f).setDuration(3000);
            isAndroidVisible = true;
        }
    }
}
