package com.wang.chart.login.account;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.wang.chart.ChartBaseActivity;
import com.wang.chart.R;

import java.util.ArrayList;
import java.util.List;

public class AccountChartActivity extends ChartBaseActivity implements View.OnClickListener {
    private RecyclerView mListView;
    private Button mBtn;
    private List<String> mData = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void initView() {
        mBtn = findViewById(R.id.button);
        mListView = findViewById(R.id.list_view);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        mListView.setLayoutManager(layoutManager);

        mBtn.setOnClickListener(this);
    }

    @Override
    protected void initData() {
        for (int i = 0; i < 80; i++) {
            mData.add("第" + i + "条数据");
        }

        MyAdapter adapter = new MyAdapter(mData);
        mListView.setAdapter(adapter);
//        adapter.notifyDataSetChanged();
    }

    @Override
    protected int getLayout() {
        return R.layout.chart_login_activity;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.button) {
            mListView.scrollToPosition(18);
        }
    }
}
