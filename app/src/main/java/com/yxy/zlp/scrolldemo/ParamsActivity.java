package com.yxy.zlp.scrolldemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Administrator on 2016/4/4.
 */
public class ParamsActivity extends Activity {
    private  Button mButton;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_params);
        mButton = (Button) findViewById(R.id.button_params);
        Button moveButton = (Button) findViewById(R.id.move);
        moveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewGroup.MarginLayoutParams params = (ViewGroup.MarginLayoutParams) mButton.getLayoutParams();
                params.leftMargin += 100;
                mButton.requestLayout();
            }
        });

    }
}
