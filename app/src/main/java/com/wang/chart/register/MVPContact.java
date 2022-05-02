package com.wang.chart.register;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MVPContact {
    interface IRegisterView {
        void getFinishViewPage();

        ImageView getFinishBackView();

        Button getRegisterBtn();

        EditText getNickEdit();

        EditText getPhoneEdit();

        EditText getPasswordEdit();

        void changeDiverOne(int color);

        void changeDiverTwo(int color);

        void changeDiverThree(int color);

    }

    interface IRegisterPresenter {
        void registerBtn();
    }
}
