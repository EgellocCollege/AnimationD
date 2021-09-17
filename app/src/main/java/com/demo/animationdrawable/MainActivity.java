package com.demo.animationdrawable;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {
    Button btn;
    ConstraintLayout constraintLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn =  findViewById(R.id.btn);
        constraintLayout = findViewById(R.id.layout);
        constraintLayout.post(new Runnable() {
            @Override
            public void run() {
                AnimationDrawable animationDrawable = (AnimationDrawable) getDrawable(R.drawable.gradient_list);
                // AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
                constraintLayout.setBackground(animationDrawable);
                animationDrawable.setEnterFadeDuration(2000);
                animationDrawable.setExitFadeDuration(4000);
                animationDrawable.setOneShot(true);
                animationDrawable.start();
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AnimationDrawable animationDrawable = (AnimationDrawable) getDrawable(R.drawable.gradient_list);
                // AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
                constraintLayout.setBackground(animationDrawable);
                animationDrawable.setEnterFadeDuration(2000);
                animationDrawable.setExitFadeDuration(4000);
                animationDrawable.setOneShot(true);
                animationDrawable.start();

            }
        });
    }


}