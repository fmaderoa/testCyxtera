package com.developer.cyxtera.testcyxteralibrary.features.login.domain;

import com.developer.cyxtera.testcyxteralibrary.features.login.data.entities.User;

public interface LoginInteractor {

    interface CreateAccount {


        void setCallback(CreateAccountCallback callback);

        void createAccount(User user);


        interface CreateAccountCallback {

            void OnCreateSuccess();

            void OnCreateFail();

        }

    }

    interface Validate {

        void setCallback(LogInCallback callback);

        void validateUser(User user);



        interface LogInCallback {

            void OnSuccess();

            void OnFail();

        }


    }

}
