package com.example.zad11;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button blinkButton;
    Button fadeButton;
    Button moveButton;
    Button rotateButton;
    Button slideButton;
    Button zoomButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        blinkButton = findViewById(R.id.blinkButton);
        fadeButton = findViewById(R.id.fadeButton);
        moveButton = findViewById(R.id.moveButton);
        rotateButton = findViewById(R.id.rotateButton);
        slideButton = findViewById(R.id.slideButton);
        zoomButton = findViewById(R.id.zoomButton);

        blinkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Animation animation = new AlphaAnimation(1, 0);
                animation.setDuration(1000);
                animation.setInterpolator(new LinearInterpolator());
                animation.setRepeatCount(Animation.INFINITE);
                animation.setRepeatMode(Animation.REVERSE);
                imageView.startAnimation(animation);
            }
        });

        fadeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Animation animation = new AlphaAnimation(1, 0);
                animation.setDuration(1000);
                animation.setInterpolator(new LinearInterpolator());
                animation.setRepeatCount(1);
                animation.setRepeatMode(Animation.REVERSE);
                imageView.startAnimation(animation);
            }
        });

        moveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final TranslateAnimation animation = new TranslateAnimation(0, 200, 0, 0);
                animation.setDuration(1000);
                animation.setInterpolator(new LinearInterpolator());
                animation.setRepeatCount(1);
                animation.setRepeatMode(Animation.REVERSE);
                imageView.startAnimation(animation);
            }
        });

        rotateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final RotateAnimation rotateAnim = new RotateAnimation(0f, 360f,
                        Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                rotateAnim.setDuration(1000);
                rotateAnim.setInterpolator(new LinearInterpolator());
                rotateAnim.setRepeatCount(1);
                rotateAnim.setRepeatMode(Animation.REVERSE);
                imageView.startAnimation(rotateAnim);
            }
        });
        slideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final TranslateAnimation animation = new TranslateAnimation(0, 0, 0, 200);
                animation.setDuration(1000);
                animation.setInterpolator(new LinearInterpolator());
                animation.setRepeatCount(1);
                animation.setRepeatMode(Animation.REVERSE);
                imageView.startAnimation(animation);
            }
        });

        zoomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Animation animation = new ScaleAnimation(1f, 2f, 1f, 2f,
                        Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                animation.setDuration(1000);
                animation.setInterpolator(new LinearInterpolator());
                animation.setRepeatCount(1);
                animation.setRepeatMode(Animation.REVERSE);
                imageView.startAnimation(animation);
            }
        });
    }
}