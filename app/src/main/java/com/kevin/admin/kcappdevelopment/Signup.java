package com.kevin.admin.kcappdevelopment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        EditText signupName=(EditText)findViewById(R.id.signupName);
        EditText signupPassword=(EditText)findViewById(R.id.signupPassword);
        EditText signupemail=(EditText)findViewById(R.id.signupemail);
        final TextView signupregistered=(TextView) findViewById(R.id.signupregistered);
        signupregistered.setOnClickListener(
                new  View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        signupregistered.setText("successfully registered");
                    }
                }
        );
    }
}
