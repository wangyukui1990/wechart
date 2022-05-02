package com.wang.chart.register;

        import android.os.Bundle;

        import androidx.annotation.Nullable;

        import com.wang.chart.ChartBaseActivity;
        import com.wang.chart.R;

public class ChartRegisterActivity extends ChartBaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void initView() {
        RegisterView view=new RegisterView(this);
        RegisterPresenter presenter=new RegisterPresenter(view);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected int  getLayout(){
        return R.layout.chart_register_activity;
    }
}
