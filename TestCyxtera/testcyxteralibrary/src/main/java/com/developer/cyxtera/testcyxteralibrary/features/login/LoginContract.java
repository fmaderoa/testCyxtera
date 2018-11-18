package com.developer.cyxtera.testcyxteralibrary.features.login;

import com.developer.cyxtera.testcyxteralibrary.features.login.data.entities.User;

import java.util.Date;

public interface LoginContract {

    interface View{



        void onSyncError(String error);

        void onSuccess();




    }

    interface Presenter{


        boolean validateData(User user);

        void validateUser();

        void saveNewLogInData(String user, Date dateRegister, int codResult);
    }

}
