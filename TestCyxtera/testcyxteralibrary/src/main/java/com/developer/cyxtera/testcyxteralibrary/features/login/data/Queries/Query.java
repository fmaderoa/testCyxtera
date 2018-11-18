package com.developer.cyxtera.testcyxteralibrary.features.login.data.Queries;

import com.developer.cyxtera.testcyxteralibrary.core.app.TestApplication;
import com.developer.cyxtera.testcyxteralibrary.core.database.greendao.DaoSession;
import com.developer.cyxtera.testcyxteralibrary.core.database.greendao.UserDB;
import com.developer.cyxtera.testcyxteralibrary.core.database.greendao.UserDBDao;
import com.developer.cyxtera.testcyxteralibrary.features.login.data.entities.User;

import org.greenrobot.greendao.query.QueryBuilder;

public class Query {

    DaoSession daoSession;

    public Query(DaoSession daoSession) {
        this.daoSession = daoSession;
    }

    public boolean userValid(User user) {
        QueryBuilder<UserDB> qbUser = daoSession.getUserDBDao().queryBuilder();
        return qbUser.where(UserDBDao.Properties.User.eq(user.getEmail()) ,
                UserDBDao.Properties.Password.eq(user.getPassword())).count() > 0 ? true:false;
   }

}
