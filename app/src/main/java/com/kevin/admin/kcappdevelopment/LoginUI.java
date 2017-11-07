package com.kevin.admin.kcappdevelopment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginUI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_ui);
        EditText loginame=(EditText)findViewById(R.id.loginame);
        EditText loginPass=(EditText)findViewById(R.id.loginPass);
    }
    public  void onclick (View view) {
        Intent i = new Intent(this, Signup .class);
        final TextView logreg = (TextView) findViewById(R.id.logreg);
        startActivity(i);
    }
}
