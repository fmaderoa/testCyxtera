package com.developer.cyxtera.testcyxteralibrary;

import android.database.sqlite.SQLiteDatabase;

import com.developer.cyxtera.testcyxteralibrary.core.database.greendao.DaoMaster;
import com.developer.cyxtera.testcyxteralibrary.core.database.greendao.DaoSession;
import com.developer.cyxtera.testcyxteralibrary.core.database.greendao.UserDBDao;
import com.developer.cyxtera.testcyxteralibrary.features.login.data.entities.User;
import com.developer.cyxtera.testcyxteralibrary.features.login.data.loginrepository.LoginRepository;
import com.developer.cyxtera.testcyxteralibrary.features.login.domain.usecases.validate.ValidateLogin;
import com.developer.cyxtera.testcyxteralibrary.features.login.ui.LoginPresenter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.robolectric.RuntimeEnvironment;

public class TestGreenDao {

    private UserDBDao userDBDao;
    DaoSession daoSession;
    private LoginPresenter loginPresenter;

    @Before
    public void setUp() throws Exception {
        //use roboteletric to create a valid Application Object
        DaoMaster.DevOpenHelper openHelper = new DaoMaster.DevOpenHelper(RuntimeEnvironment.application, "wmsmp-db", null);
        SQLiteDatabase db = openHelper.getWritableDatabase();
        Assert.assertNotNull(db);
        daoSession = new DaoMaster(db).newSession();
        loginPresenter = new LoginPresenter(new ValidateLogin(new LoginRepository()));
    }

    @Test
    public void validateLoginUser() {
        String usuario = "famara@gmail.com";
        String password = "java1ABC$";
        loginPresenter.validateData(createUser(usuario,password));
        loginPresenter.validateUser();
    }

    private User createUser(String email, String password){
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        return user;
    }

}
