package com.example.a3isp97_izrancev_vetklinika;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.concurrent.TimeUnit;

public class logoactivclass extends AppCompatActivity {

    ImageView imageviev;
    ImageView imageviev2;
    ImageView imageviev3;
    ImageView imageviev4;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logoactiv);
        imageviev  = findViewById(R.id.imageView);
        imageviev2  = findViewById(R.id.imageView2);
        imageviev3  = findViewById(R.id.imageView3);
        imageviev4  = findViewById(R.id.imageView4);
        Animation anim_load = AnimationUtils.loadAnimation(this,R.anim.anim);


        Thread threadLoading = new Thread(){
            public void run(){
                try {
                    imageviev.startAnimation(anim_load);
                    TimeUnit.SECONDS.sleep(1);
                    imageviev2.startAnimation(anim_load);
                    TimeUnit.SECONDS.sleep(1);
                    imageviev3.startAnimation(anim_load);
                    TimeUnit.SECONDS.sleep(1);
                    imageviev4.startAnimation(anim_load);
                    TimeUnit.SECONDS.sleep(1);
                    Intent intentloading = new Intent(logoactivclass.this,MainActivity.class);
                    startActivity(intentloading);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };threadLoading.start();
    }
}
