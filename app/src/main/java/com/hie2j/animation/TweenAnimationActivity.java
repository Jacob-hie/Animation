package com.hie2j.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

public class TweenAnimationActivity extends AppCompatActivity {

    private ImageView iv_dog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween_animation);

        iv_dog = findViewById(R.id.iv_dog);

        findViewById(R.id.btn_alpha).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAlphaAnim();
            }
        });

        findViewById(R.id.btn_scale).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startScaleAnim();
            }
        });

        findViewById(R.id.btn_translate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTranslateAnim();
            }
        });

        findViewById(R.id.btn_rotate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startRotateAnim();
            }
        });

        findViewById(R.id.btn_animSet).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAnimationSet();
            }
        });

    }

    private void startAnimationSet() {
        AnimationSet animationSet = (AnimationSet) AnimationUtils.loadAnimation(
                this,R.anim.tween_anim);
        //通过代码来实现
//        RotateAnimation rotateAnimation = new RotateAnimation(
//                0,360,180,180);
//        TranslateAnimation translateAnimation = new TranslateAnimation(
//                0,400,0,600);
//        ScaleAnimation scaleAnimation = new ScaleAnimation(
//                1,4,1,4,180,180);
//        AnimationSet animationSet = new AnimationSet(true);
//        animationSet.addAnimation(rotateAnimation);
//        animationSet.addAnimation(translateAnimation);
//        animationSet.addAnimation(scaleAnimation);
//
//        animationSet.setDuration(3000);
//        animationSet.setFillAfter(true);
//        animationSet.setRepeatCount(5);
//        animationSet.setRepeatMode(Animation.REVERSE);

        iv_dog.startAnimation(animationSet);
    }

    private void startRotateAnim() {
//        RotateAnimation rotateAnimation = (RotateAnimation) AnimationUtils.loadAnimation(
//                this,R.anim.rotate_main);
        //通过代码来实现
        RotateAnimation rotateAnimation = new RotateAnimation(
                0,360,180,180);
        rotateAnimation.setDuration(3000);
        rotateAnimation.setFillAfter(true);
        rotateAnimation.setRepeatCount(5);
        rotateAnimation.setRepeatMode(Animation.REVERSE);

        iv_dog.startAnimation(rotateAnimation);
    }

    private void startTranslateAnim() {
//        TranslateAnimation translateAnimation = (TranslateAnimation) AnimationUtils.loadAnimation(
//                this,R.anim.translate_anim);
        //通过代码来实现
        TranslateAnimation translateAnimation = new TranslateAnimation(
                0,300,0,300);
        translateAnimation.setDuration(3000);
        translateAnimation.setFillAfter(true);
        translateAnimation.setRepeatCount(-1);
        translateAnimation.setRepeatMode(Animation.REVERSE);
        iv_dog.startAnimation(translateAnimation);
    }

    private void startScaleAnim() {
        ScaleAnimation scaleAnimation = (ScaleAnimation) AnimationUtils.loadAnimation(
                this,R.anim.scale_anim);
        //通过代码来实现
//        ScaleAnimation scaleAnimation = new ScaleAnimation(
//                1,4,1,4,50,50);
//        scaleAnimation.setDuration(3000);
//        scaleAnimation.setFillAfter(true);
//        scaleAnimation.setRepeatCount(3);
//        scaleAnimation.setRepeatMode(Animation.REVERSE);
        iv_dog.startAnimation(scaleAnimation);
    }

    private void startAlphaAnim() {

        AlphaAnimation alphaAnimation = (AlphaAnimation) AnimationUtils.loadAnimation(
                this,R.anim.alpha_anim);
        //通过代码来实现
//        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f,1.0f);
//        alphaAnimation.setDuration(3000);
//        alphaAnimation.setFillAfter(true);
//        alphaAnimation.setRepeatCount(3);
//        alphaAnimation.setRepeatMode(Animation.REVERSE);

        iv_dog.startAnimation(alphaAnimation);
    }
}
