package com.example.labo_homework_00118717;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    EditText user, pass, email, gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);

        user = findViewById(R.id.user);
        pass = findViewById(R.id.pass);
        email = findViewById(R.id.email);
        gender = findViewById(R.id.gender);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(MainActivity.this, newActivity.class);
                mIntent.putExtra("key1",user.getText());
                mIntent.putExtra("key2",pass.getText());
                mIntent.putExtra("key3",email.getText());
                mIntent.putExtra("key4",gender.getText());
                startActivity(mIntent);
            }
        });
    }
}
