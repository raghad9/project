package com.example.eoccasiontest.Plugins;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    public static boolean isValidEmail(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }



    public  static boolean isValidPassword(String password){
        if(password.length()<=5){
            return false;
        }


        return true;
    }



    public boolean isMobileNumberValid(String phoneNumber)
    {
        String phoneRegex = "^[+][0-9]{10,13}$";

        Pattern pat = Pattern.compile(phoneRegex);
        if (phoneNumber == null)
            return false;
        return pat.matcher(phoneNumber).matches();
    }
}
