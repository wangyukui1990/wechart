package com.wang.chart.welcome;

import android.view.View;
import android.widget.Button;

import com.wang.chart.R;

public class ChartWelcomeView implements ChartWelcomeMVP.IWelcomeView {
    private Button mChartRegisterBtn;
    private Button mChartLoginBtn;

    public ChartWelcomeView(ChartWelcomeActivity context) {
        mChartRegisterBtn = context.findViewById(R.id.chart_register_btn);
        mChartLoginBtn = context.findViewById(R.id.chart_login_btn);
    }

    @Override
    public View getRegisterBtnView() {
        return mChartRegisterBtn;
    }

    @Override
    public View getLoginBtnView() {
        return mChartLoginBtn;
    }
}
