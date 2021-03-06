package com.wang.chart.welcome;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.wang.chart.ChartBaseActivity;
import com.wang.chart.R;
import com.wang.chart.login.account.AccountChartActivity;
import com.wang.chart.login.phone.PhoneLoginActivity;
import com.wang.chart.register.ChartRegisterActivity;

public class ChartWelcomeActivity extends ChartBaseActivity implements View.OnClickListener {
    private Button mChartRegisterBtn;
    private Button mChartLoginBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        ChartWelcomeView view = new ChartWelcomeView(this);
//        ChartWelcomePresenter presenter = new ChartWelcomePresenter(view);
    }

    @Override
    protected void initView() {
        mChartRegisterBtn = findViewById(R.id.chart_register_btn);
        mChartLoginBtn = findViewById(R.id.chart_login_btn);

        mChartRegisterBtn.setOnClickListener(this);
        mChartLoginBtn.setOnClickListener(this);
    }

    @Override
    protected void initData() {
        int a=0;
        char b='a';
        long c=0;
        int d=0;
        String text="窗含西陵千秋雪，门泊东吴万里船";
        String one="第一次提交";
        String two="第二次提交";
        String three="第三次提交";
        String throu="第四次提交";

    }

    @Override
    protected int getLayout() {
        return R.layout.chart_welcome_activity;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.chart_register_btn) {
            Intent intent=new Intent(this, ChartRegisterActivity.class);
            startActivity(intent);
            Toast.makeText(this, "点击注册按钮", Toast.LENGTH_SHORT).show();
            return;
        }

        if (id == R.id.chart_login_btn) {
            Intent intent=new Intent(this, AccountChartActivity.class);
            startActivity(intent);
            Toast.makeText(this, "点击登录按钮", Toast.LENGTH_SHORT).show();
            return;
        }
    }
}
