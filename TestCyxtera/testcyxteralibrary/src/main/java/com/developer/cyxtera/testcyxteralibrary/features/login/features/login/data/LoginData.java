package com.developer.cyxtera.testcyxteralibrary.features.login.features.login.data;

import com.developer.cyxtera.testcyxteralibrary.features.login.features.login.data.entities.User;

public interface LoginData {

    interface LogIn {

        void setCallback(LogInDataSourceCallback callback);

        void saveLogUser(User user);


        interface LogInDataSourceCallback {

            void userInfoSaved();

            void onError(String error);

        }

    }
}
