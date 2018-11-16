package com.developer.cyxtera.testcyxteralibrary.features.login.features.login;

import com.developer.cyxtera.testcyxteralibrary.features.login.features.login.data.entities.User;

import java.util.Date;

public interface LoginContract {

    interface View{

        void onSyncError(String error);

        void onSyncSuccess();



    }

    interface Presenter{


        boolean validateData(User user);



        void saveNewLogInData(String user, Date dateRegister, int codResult);
    }

}
