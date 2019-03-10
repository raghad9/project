package com.example.eoccasiontest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.eoccasiontest.Plugins.Validation;

import org.json.JSONException;
import org.json.JSONObject;

public class Login2Activity extends AppCompatActivity {


    private Button login;
    private EditText email , password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        password = findViewById(R.id.passwordET);
        email = findViewById(R.id.emailET);
        login = findViewById(R.id.loginBtn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if( validation() == true){

                   login_with_api();

               }else{


                   //Toast
                   Toast toast = Toast.makeText(Login2Activity.this, "please enter valid email and password ",Toast.LENGTH_LONG);
                   toast.show();
                           //new Toast(Login2Activity.this, "please enter valid email and password ",Toast.LENGTH_LONG);

               }
            }
        });
    }





    private boolean validation(){

        String emailstr = email.getText().toString();
        String passwordstr = password.getText().toString();

        if(emailstr.isEmpty()  || passwordstr.isEmpty()){
            return false;
        }


        if(!Validation.isValidEmail(emailstr) ){

            return false;
        }



        if(!Validation.isValidPassword(passwordstr)){

            return false;
        }






        return true;
    }




    private void login_with_api(){

        // Instantiate the RequestQueue.
        RequestQueue queue = Volley.newRequestQueue(this);
        String url ="http://178.128.149.244/apps/eoapp/users/login";

// Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.POST, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Display the first 500 characters of the response string.


                        try {
                            JSONObject  obj = new JSONObject(response);

                            boolean isLoginSuccess = obj.getBoolean("response");


                            if(isLoginSuccess==true){





                                // redirect home activity

                                Intent intent = new Intent();

                            }else{


                                // login fail
                                // display message


                                Toast.makeText(Login2Activity.this, "login failed,  please enter valid email and password",Toast.LENGTH_LONG).show();
                            }



                        } catch (JSONException e) {
                            e.printStackTrace();
                        }


                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
            }
        });

// Add the request to the RequestQueue.
        queue.add(stringRequest);


    }




}
