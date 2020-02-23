package com.example.bags;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView shop;
    EditText email;
    EditText username;
    EditText password;
    Button register_now;
    Button sign_in;
    Context context = MainActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        shop = findViewById(R.id.shop);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        email = findViewById(R.id.email);
        sign_in = findViewById(R.id.sign_in);
        register_now = findViewById(R.id.register_now);

        sign_in.setOnClickListener(this);
        register_now.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;

        switch (v.getId()) {
            case R.id.sign_in:

            case R.id.register_now:
                intent = new Intent(context, login.class);
                context.startActivity(intent);

                break;


        }
    }
}


