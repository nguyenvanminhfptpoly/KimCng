package com.nhom3.kimcng.presenter.signup;

import com.nhom3.kimcng.view.signup.SignUpView;

public class SignUpPresenter implements SignUpPresenterInterface {
    SignUpView signUpView;
    public SignUpPresenter(SignUpView signUpView){
        this.signUpView = signUpView;
    }
    @Override
    public void SignUp(String email, String pass) {
        if(email.equals("") && pass.equals("")){
            signUpView.onFailed();
        }else {
            signUpView.onSuccess();
        }
    }
}
