package com.wang.chart.welcome;

import android.view.View;
import android.widget.Toast;

import com.wang.chart.GlobalApp;

public class ChartWelcomePresenter implements ChartWelcomeMVP.Presenter, View.OnClickListener {
    private ChartWelcomeMVP.IWelcomeView mView;

    public ChartWelcomePresenter(ChartWelcomeMVP.IWelcomeView view) {
        mView = view;
        view.getLoginBtnView().setOnClickListener(this);
        view.getRegisterBtnView().setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == mView.getRegisterBtnView()) {
            Toast.makeText(GlobalApp.getApplication(),"点击注册按钮",Toast.LENGTH_SHORT).show();
        } else if (v == mView.getLoginBtnView()) {
            Toast.makeText(GlobalApp.getApplication(),"点击登录按钮",Toast.LENGTH_SHORT).show();
        }
    }
}
