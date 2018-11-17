package com.developer.cyxtera.testcyxteralibrary.features.login.data.loginrepository;

import com.developer.cyxtera.testcyxteralibrary.core.database.greendao.LogIntentsDB;
import com.developer.cyxtera.testcyxteralibrary.features.login.data.LoginData;
import com.developer.cyxtera.testcyxteralibrary.features.login.data.entities.User;

public class LoginRepository implements LoginData.LogIn {

    LogInDataSourceCallback callback;

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

    }
}
