package com.developer.cyxtera.testcyxteralibrary;

import com.developer.cyxtera.testcyxteralibrary.core.database.greendao.DaoSession;
import com.developer.cyxtera.testcyxteralibrary.features.login.data.entities.User;
import com.developer.cyxtera.testcyxteralibrary.features.login.data.loginrepository.LoginRepository;
import com.developer.cyxtera.testcyxteralibrary.features.login.domain.usecases.validate.ValidateLogin;
import com.developer.cyxtera.testcyxteralibrary.features.login.ui.LoginPresenter;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class LoginTest {

    private LoginPresenter loginPresenter;

    @Before
    public void setUp() throws Exception {
        loginPresenter = new LoginPresenter(new ValidateLogin(new LoginRepository()));
    }

    @Test
    public void validateDataWithResultTrue() {
        String usuario = "famara@gmail.com";
        String password = "java1ABC$";
        boolean resultado = loginPresenter.validateData(createUser(usuario,password));
        assertTrue(resultado);
    }

    @Test
    public void validateDataResultFalseForUser() {
        String usuario = "famagmadfdfdfdffdf.com";
        String password = "java1ABC$";
        boolean resultado = loginPresenter.validateData(createUser(usuario,password));
        assertFalse(resultado);
    }

    @Test
    public void validateDataWithResultFalseForPassword() {
        String usuario = "famara@gmail.com";
        String password = "123a.";
        boolean resultado = loginPresenter.validateData(createUser(usuario,password));
        assertFalse(resultado);
    }

    @Test
    public void validateDataWithResultFalseForUserisEmpty() {
        String usuario = "";
        String password = "java1ABC$";
        boolean resultado = loginPresenter.validateData(createUser(usuario,password));
        assertFalse(resultado);
    }

    @Test
    public void validateDataWithResultFalseForPasswordisEmpty() {
        String usuario = "famara@gmail.com";
        String password = "";
        boolean resultado = loginPresenter.validateData(createUser(usuario,password));
        assertFalse(resultado);
    }

    private User createUser(String email, String password){
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        return user;
    }

    @Test
    public void validateLoginUser() {
        String usuario = "famara@gmail.com";
        String password = "java1ABC$";
        loginPresenter.validateData(createUser(usuario,password));
        DaoSession mDaoSession = null;
        loginPresenter.validateUser();
    }

}
