package com.developer.cyxtera.testcyxteralibrary.features.login.data.loginrepository;

import android.content.Context;

import com.developer.cyxtera.testcyxteralibrary.Utils.ConstantsLoginResult;
import com.developer.cyxtera.testcyxteralibrary.core.app.TestApplication;
import com.developer.cyxtera.testcyxteralibrary.core.database.greendao.LogIntentsDB;
import com.developer.cyxtera.testcyxteralibrary.features.login.data.LoginData;
import com.developer.cyxtera.testcyxteralibrary.features.login.data.Queries.Query;
import com.developer.cyxtera.testcyxteralibrary.features.login.data.entities.User;

public class LoginRepository implements LoginData.LogIn {

    LogInDataSourceCallback callback;
    //private Context context;



    @Override
    public void setCallback(LogInDataSourceCallback callback) {
        this.callback = callback;
    }

    @Override
    public void saveLogUser(User user) {
        //TODO Consumir servicio de fecha
        LogIntentsDB logIntentsDB = new LogIntentsDB();
        //logIntentsDB.set

    }

    @Override
    public void validateUser(User user) {
        boolean validUser = false;
        Query query = new Query(TestApplication.mDaoSession);
        validUser = query.userValid(user);
        if(validUser) {
            callback.userInfoSaved();
        } else {
            callback.onError(ConstantsLoginResult.ERROR_LOGIN);
        }
    }
}
