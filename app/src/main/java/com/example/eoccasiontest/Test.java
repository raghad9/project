package com.example.eoccasiontest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.json.JSONException;
import org.json.JSONObject;

public class Test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }








    private void handelJson(){


        String strjson = "{'respnse':true,'message':'test'}";


        try {
            JSONObject jsonObject = new JSONObject(strjson);

            jsonObject.getBoolean("response");
        } catch (JSONException e) {
            e.printStackTrace();
        }


    }




}
