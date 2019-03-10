package com.example.eoccasiontest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ProviderInfoActivity extends AppCompatActivity implements View.OnClickListener {

    private Button Create;

    private EditText FirstName,LastName,city,Phone,EmailAddress,Password,confiremYourPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provider_info);
        FirstName = findViewById(R.id.FnameET);
        LastName = findViewById(R.id.LnameET);
        city = findViewById(R.id.CityET);
        Phone = findViewById(R.id.phoneET);
        EmailAddress = findViewById(R.id.emailET);
        Password = findViewById(R.id.passwordET);
        confiremYourPassword = findViewById(R.id.ConPassET);


    }

    @Override
    public void onClick(View v) {

    }
}
