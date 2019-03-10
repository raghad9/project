package com.example.eoccasiontest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login1Activity extends AppCompatActivity implements View.OnClickListener {

    private Button register,login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);

        register    = findViewById(R.id.registerBtn);
        login       = findViewById(R.id.loginBtn);


        login.setOnClickListener(this);
        register.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.loginBtn){
            Intent intent = new Intent(Login1Activity.this,Login2Activity.class);
            startActivity(intent);
        }else if(v.getId()==R.id.registerBtn){
            Intent intent = new Intent(Login1Activity.this,SelectYourModeActivity.class);
            startActivity(intent);
        }
    }
}
