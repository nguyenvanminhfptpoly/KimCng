package com.nhom3.kimcng.presenter.signin;

import com.nhom3.kimcng.view.signin.SignInView;

public class SignInPresenter implements SignInPresenterInterface {
    SignInView signInView;

    public SignInPresenter(SignInView signInView){
        this.signInView = signInView;
    }
    @Override
    public void SignIn(String email, String password) {
        if(email.equals("") && password.equals("")){
            signInView.OnFailed();
        }else {
            signInView.OnSucess();
        }
    }
}
