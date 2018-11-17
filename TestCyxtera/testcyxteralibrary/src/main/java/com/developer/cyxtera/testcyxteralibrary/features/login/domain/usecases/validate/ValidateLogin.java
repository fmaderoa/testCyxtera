package com.developer.cyxtera.testcyxteralibrary.features.login.domain.usecases.validate;


import com.developer.cyxtera.testcyxteralibrary.features.login.data.LoginData;
import com.developer.cyxtera.testcyxteralibrary.features.login.data.entities.User;
import com.developer.cyxtera.testcyxteralibrary.features.login.domain.LoginInteractor;


public class ValidateLogin implements LoginInteractor.Validate, LoginData.LogIn.LogInDataSourceCallback {

    private LoginData.LogIn logInDataSource;
    private LoginData.LogIn.LogInDataSourceCallback callback;


    public ValidateLogin(LoginData.LogIn logInDataSource) {
        this.logInDataSource = logInDataSource;
        logInDataSource.setCallback(this);
    }


    @Override
    public void userInfoSaved() {
        callback.userInfoSaved();
    }

    @Override
    public void onError(String error) {
        callback.onError(error);
    }

    @Override
    public void setCallback(LogInCallback callback) {

    }

    @Override
    public void validateUser(User user) {
        logInDataSource.validateUser(user);
    }
}
