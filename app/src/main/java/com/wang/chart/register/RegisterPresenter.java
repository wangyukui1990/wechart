package com.wang.chart.register;

import android.view.View;

import com.wang.chart.R;
import com.wang.chart.register.util.WorksSizeCheckUtil;

public class RegisterPresenter implements MVPContact.IRegisterPresenter, View.OnClickListener {
    private MVPContact.IRegisterView mView;

    public RegisterPresenter(MVPContact.IRegisterView view) {
        mView = view;
        initData();
        initClickListener();
        initFocusListener();

        WorksSizeCheckUtil.TextChangeListener textChangeListener = new WorksSizeCheckUtil.TextChangeListener();
        textChangeListener.setButton(mView.getRegisterBtn());
        textChangeListener.addListener(mView.getNickEdit(), mView.getPhoneEdit(), mView.getPasswordEdit());

    }

    private void initData() {


    }

    private void initClickListener() {
        mView.getRegisterBtn().setOnClickListener(this);
    }

    private void initFocusListener() {

        mView.getNickEdit().setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                int color = hasFocus ? R.color.input_diver_focus : R.color.input_diver;
                mView.changeDiverOne(color);
            }
        });

        mView.getPhoneEdit().setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                int color = hasFocus ? R.color.input_diver_focus : R.color.input_diver;
                mView.changeDiverTwo(color);
            }
        });

        mView.getPasswordEdit().setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                int color = hasFocus ? R.color.input_diver_focus : R.color.input_diver;
                mView.changeDiverThree(color);
            }
        });
    }

    @Override
    public void registerBtn() {

    }

    @Override
    public void onClick(View v) {
        if (v == mView.getFinishBackView()) {
            mView.getFinishViewPage();
            return;
        }

        if (v == mView.getRegisterBtn()) {
            registerBtn();
            return;
        }
    }
}
