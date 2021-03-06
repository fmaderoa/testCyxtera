package com.developer.cyxtera.testcyxteralibrary.features.login.ui;

import android.content.Context;

import com.developer.cyxtera.testcyxteralibrary.features.login.LoginContract;
import com.developer.cyxtera.testcyxteralibrary.features.login.data.entities.User;
import com.developer.cyxtera.testcyxteralibrary.features.login.domain.LoginInteractor;

import java.util.Date;
import java.util.regex.Pattern;

public class LoginPresenter implements LoginContract.Presenter, LoginInteractor.Validate.LogInCallback {

    private User userLog;
    private LoginInteractor.Validate validate;


    public LoginPresenter(LoginInteractor.Validate validate) {
        this.validate = validate;
        this.validate.setCallback(this);
    }

    @Override
    public boolean validateData(User user){
        Pattern patternPassword = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,15})");
        Pattern patternEmail = Pattern.compile("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                "\\@" +
                "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                "(" +
                "\\." +
                "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                ")+");
        String email = user.getEmail();
        String password =  user.getPassword();
        if (email != null && !email.isEmpty() && patternEmail.matcher(email).matches())
            if (password != null && !password.isEmpty() && patternPassword.matcher(password).matches()) {
                userLog = new User();
                userLog.setEmail(email);
                userLog.setPassword(password);
                return true;
            }

        return false;
    }

    @Override
    public void validateUser() {
        validate.validateUser(userLog);
    }


    @Override
    public void saveNewLogInData(String user, Date dateRegister, int codResult) {

    }

    @Override
    public void OnSuccess() {

    }

    @Override
    public void OnFail() {

    }
}
