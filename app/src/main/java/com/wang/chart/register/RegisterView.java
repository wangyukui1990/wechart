package com.wang.chart.register;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.wang.chart.R;

public class RegisterView implements MVPContact.IRegisterView {
    private Context mContext;
    private RegisterPresenter mPresenter;

    private EditText mRegisterName;
    private EditText mRegisterPhone;
    private EditText mRegisterPassword;

    private View mRegDiverOne;
    private View mRegDiverTwo;
    private View mRegDiverThree;

    private ImageView mFinishView;

    private Button mRegBtn;

    public RegisterView(ChartRegisterActivity context) {
        mContext = context;
        initView(context);
    }

    private void initView(ChartRegisterActivity context) {
        mFinishView = context.findViewById(R.id.reg_finish_iv);

        mRegisterName = context.findViewById(R.id.reg_name);
        mRegDiverOne = context.findViewById(R.id.reg_diver1);

        mRegisterPhone = context.findViewById(R.id.reg_phone);
        mRegDiverTwo = context.findViewById(R.id.reg_diver2);

        mRegisterPassword = context.findViewById(R.id.reg_passwd);
        mRegDiverThree = context.findViewById(R.id.reg_diver3);

        mRegBtn = context.findViewById(R.id.reg_button);

    }

    @Override
    public void getFinishViewPage() {
        if (mContext != null && mContext instanceof Activity) {
            ((Activity) mContext).finish();
            mContext = null;
        }
    }

    @Override
    public ImageView getFinishBackView() {
        return mFinishView;
    }

    @Override
    public Button getRegisterBtn() {
        return mRegBtn;
    }

    @Override
    public EditText getNickEdit() {
        return mRegisterName;
    }

    @Override
    public EditText getPhoneEdit() {
        return mRegisterPhone;
    }

    @Override
    public EditText getPasswordEdit() {
        return mRegisterPassword;
    }

    @Override
    public void changeDiverOne(int color) {
         mRegDiverOne.setBackgroundResource(color);
    }

    @Override
    public void changeDiverTwo(int color) {
         mRegDiverTwo.setBackgroundResource(color);
    }

    @Override
    public void changeDiverThree(int color) {
         mRegDiverThree.setBackgroundResource(color);
    }

    public void setPresenter(RegisterPresenter presenter) {
        this.mPresenter = presenter;
    }
}
