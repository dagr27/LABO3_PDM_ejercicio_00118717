package com.example.labo_homework_00118717;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class newActivity extends AppCompatActivity {
    private EditText user, pass, email, gender;
    private Button btn;
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

        btn = findViewById(R.id.btn3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mmIntent = new Intent();
                mmIntent.setAction(Intent.ACTION_SEND);
                mmIntent.setType("text/plain");
                mmIntent.putExtra("k1", user.getText().toString());
                mmIntent.putExtra("k2", pass.getText().toString());
                mmIntent.putExtra("k3", email.getText().toString());
                mmIntent.putExtra("k4", gender.getText().toString());
                startActivity(mmIntent);

            }
        });


    }
}
