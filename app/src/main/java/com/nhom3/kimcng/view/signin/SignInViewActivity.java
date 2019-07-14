package com.nhom3.kimcng.view.signin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.nhom3.kimcng.R;
import com.nhom3.kimcng.view.signup.SignUpViewActivity;

public class SignInViewActivity extends AppCompatActivity implements SignInView {
    private ImageView imgSignIn;
    private EditText edEmail;
    private EditText edPass;
    private TextView tvSignUp;
    private Button btnSignIn;
    private Button btnSignInFB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Khaibao();
    }
    public void Khaibao(){
        imgSignIn = (ImageView) findViewById(R.id.imgSignIn);
        edEmail = (EditText) findViewById(R.id.edEmail);
        edPass = (EditText) findViewById(R.id.edPass);
        tvSignUp = (TextView) findViewById(R.id.tvSignUp);
        btnSignIn = (Button) findViewById(R.id.btnSignIn);
        btnSignInFB = (Button) findViewById(R.id.btnSignInFB);

        tvSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SignUpViewActivity.class));
            }
        });
    }
    @Override
    public void OnSucess() {

    }

    @Override
    public void OnFailed() {

    }
}
