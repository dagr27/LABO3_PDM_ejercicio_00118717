package com.example.labo_homework_00118717;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class newActivity extends AppCompatActivity {
    private EditText user, pass, email, gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        user = findViewById(R.id.user);
        pass = findViewById(R.id.pass);
        email = findViewById(R.id.email);
        gender = findViewById(R.id.gender);
        Intent mIntent = getIntent();
        if (mIntent != null) {
            user.setText(mIntent.getStringExtra("key1"));
            pass.setText(mIntent.getStringExtra("key2"));
            email.setText(mIntent.getStringExtra("key3"));
            gender.setText(mIntent.getStringExtra("key4"));

        }


    }
}
