package com.bawei.monilianxi.utils;

import android.app.Application;

import com.bawei.monilianxi.gen.DaoMaster;
import com.bawei.monilianxi.gen.DaoSession;
import com.bawei.monilianxi.gen.UserDao;


/**
 * date：2017/11/22
 * 用途：
 */
public class App extends Application {
    public static UserDao userDao;

    @Override
    public void onCreate() {
        super.onCreate();
        DaoMaster.DevOpenHelper devOpenHelper = new DaoMaster.DevOpenHelper(this, "lenvess.db", null);
        DaoMaster daoMaster = new DaoMaster(devOpenHelper.getWritableDb());
        DaoSession daoSession = daoMaster.newSession();
        userDao = daoSession.getUserDao();
    }
}
