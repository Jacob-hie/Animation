package com.hie2j.animation;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FrameAnimationActivity extends AppCompatActivity {

    private ImageView iv_wifi;
    private AnimationDrawable animationDrawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_animation);

        setTitle("Frame_anim");
        iv_wifi = findViewById(R.id.iv_wifi);

        animationDrawable = (AnimationDrawable) iv_wifi.getDrawable();

        //代码实现
//        animationDrawable = new AnimationDrawable();
//        for (int i = 1; i < 7; i++){
//            int id = getResources().getIdentifier("wifi"+i,"drawable",getPackageName());
//            Drawable drawable = getResources().getDrawable(id);
//            animationDrawable.addFrame(drawable,300);
//        }

        findViewById(R.id.btn_start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                animationDrawable.setOneShot(true);
//                iv_wifi.setImageDrawable(animationDrawable);
//                animationDrawable.stop();
                animationDrawable.start();
            }
        });

        findViewById(R.id.btn_stop).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                animationDrawable.setOneShot(true);
//                iv_wifi.setImageDrawable(animationDrawable);
                animationDrawable.stop();
            }
        });
    }
}
