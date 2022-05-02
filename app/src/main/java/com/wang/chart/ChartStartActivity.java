package com.wang.chart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.wang.chart.welcome.ChartWelcomeActivity;

public class ChartStartActivity extends ChartBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initData();
    }

    @Override
    protected void initView() {

    }


    protected void initData() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                gotToWelcome();
            }
        }, 3000);
    }

    @Override
    protected int getLayout() {
        return 0;
    }

    private void gotToWelcome() {
        Intent intent = new Intent(this, ChartWelcomeActivity.class);
        startActivity(intent);
    }
}
