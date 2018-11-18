package com.developer.cyxtera.testcyxteralibrary.core.database.greendao;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

@Entity(nameInDb = "user")
public class UserDB {


        @Id(autoincrement = true)
        private Long id;

        @Property(nameInDb = "user")
        private String user;

        @Property(nameInDb = "password")
        private String password;

        @Generated(hash = 263520960)
        public UserDB(Long id, String user, String password) {
            this.id = id;
            this.user = user;
            this.password = password;
        }

        @Generated(hash = 1312299826)
        public UserDB() {
        }

        public Long getId() {
            return this.id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getUser() {
            return this.user;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public String getPassword() {
            return this.password;
        }

        public void setPassword(String password) {
            this.password = password;
        }



}
