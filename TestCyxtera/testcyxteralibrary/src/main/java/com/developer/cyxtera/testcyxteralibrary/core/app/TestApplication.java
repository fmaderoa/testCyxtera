package com.developer.cyxtera.testcyxteralibrary.core.app;

import android.app.Application;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.developer.cyxtera.testcyxteralibrary.core.database.greendao.DaoMaster;
import com.developer.cyxtera.testcyxteralibrary.core.database.greendao.DaoSession;





public class TestApplication extends Application {

    public static DaoSession mDaoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        if(mDaoSession == null) {
            mDaoSession = initDB();
        }
    }

    public static DaoSession getDaoSession() {
        return mDaoSession;
    }

    public DaoSession initDB() {
        if (mDaoSession == null) {
            DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(getApplicationContext(), "wmsmp-db", null);
            SQLiteDatabase db = helper.getWritableDatabase();
            DaoMaster daoMaster = new DaoMaster(db);
            daoMaster.newSession();
            mDaoSession = daoMaster.newSession();
        }
        return mDaoSession;
    }


}
