package com.yxy.zlp.scrolldemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class TweenAnimActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween);
        Button mButton = (Button) findViewById(R.id.button_t);
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.translate);
        mButton.startAnimation(anim);
    }

}
