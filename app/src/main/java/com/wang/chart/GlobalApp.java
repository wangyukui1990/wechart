package com.wang.chart;

import android.app.Application;

public class GlobalApp extends Application {
    private static Application app ;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
    }

    public static Application getApplication() {
        return app;
    }
}
