package com.developer.cyxtera.testcyxteralibrary.core.database.greendao;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

public class UserDB {

    @Entity(nameInDb = "user")
    public class User {
        @Id(autoincrement = true)
        private Long id;

        @Property(nameInDb = "user")
        private String user;

        @Property(nameInDb = "password")
        private String password;

    }

}
