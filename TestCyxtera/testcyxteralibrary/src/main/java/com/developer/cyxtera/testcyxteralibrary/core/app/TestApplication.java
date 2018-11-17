package com.developer.cyxtera.testcyxteralibrary.core.app;

import android.app.Application;

import com.developer.cyxtera.testcyxteralibrary.core.database.greendao.DaoMaster;
import com.developer.cyxtera.testcyxteralibrary.core.database.greendao.DaoSession;





public class TestApplication extends Application {

    private DaoSession mDaoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        if(mDaoSession == null) {
            mDaoSession = new DaoMaster(
                    new DaoMaster.DevOpenHelper(this, "greendao_demo.db").getWritableDb()).newSession();
        }
    }

    public DaoSession getDaoSession() {
        return mDaoSession;
    }



}
