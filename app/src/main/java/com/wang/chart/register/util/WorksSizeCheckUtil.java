package com.wang.chart.register.util;

import android.content.res.Resources;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;

import com.wang.chart.R;

public class WorksSizeCheckUtil {
    private static IEditTextChangeListener mEditTextChangeListener;

    public static void setOnEditTextChangeListener(IEditTextChangeListener listener) {
        mEditTextChangeListener = listener;
    }

    public static class TextChangeListener {
        private Button mButton;
        private EditText[] mEditTexts;

        public void setButton(Button button) {
            this.mButton = button;
        }

        public TextChangeListener addListener(EditText... editTexts) {
            this.mEditTexts = editTexts;
            initTextChangeListener();
            return this;
        }

        private void initTextChangeListener() {
            for (EditText editText : mEditTexts) {
                editText.addTextChangedListener(new TextChange());
            }
        }

       private  class TextChange implements TextWatcher {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {


            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Resources resources = mButton.getContext().getResources();
                boolean change = checkAll();
                int drawable = change ? R.drawable.login_button_focus : R.drawable.login_button_shape;
                int color = change ? R.color.loginButtonTextFouse : R.color.loginButtonText;

                mButton.setEnabled(change);
                mButton.setBackgroundResource(drawable);
                mButton.setTextColor(resources.getColor(color));

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        }

        private boolean checkAll() {
            for (EditText editText : mEditTexts) {
                String text = editText.getText().toString().trim();
                if (!TextUtils.isEmpty(text)) {
                    continue;
                }
                return false;
            }

            return true;
        }
    }

    public interface IEditTextChangeListener {
        void textChange(boolean change);
    }
}
