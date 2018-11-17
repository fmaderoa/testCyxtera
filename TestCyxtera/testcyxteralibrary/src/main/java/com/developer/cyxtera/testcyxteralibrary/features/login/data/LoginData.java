package com.developer.cyxtera.testcyxteralibrary.features.login.data;

import com.developer.cyxtera.testcyxteralibrary.features.login.data.entities.User;

public interface LoginData {

    interface LogIn {

        void setCallback(LogInDataSourceCallback callback);

        void saveLogUser(User user);

        void validateUser(User user);

        interface LogInDataSourceCallback {

            void userInfoSaved();

            void onError(String error);

        }

    }
}
