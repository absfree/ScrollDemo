package com.yxy.zlp.scrolldemo;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

/**
 * Created by Administrator on 2016/4/4.
 */
public class PropertyAnimActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property);
        Button mButton = (Button) findViewById(R.id.button_p);
        ObjectAnimator.ofFloat(mButton, "translationX", 0, 100).setDuration(1000).start();
    }
}
