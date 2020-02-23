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

public class login extends AppCompatActivity implements View.OnClickListener {

    ImageView image;
    EditText username;
    EditText password;
    Button log_in;
    Context login =login.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        image = findViewById(R.id.image);
        password = findViewById(R.id.password);
        username = findViewById(R.id.username);
        log_in = findViewById(R.id.log_in);

        log_in.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent;

        switch (v.getId()) {
            case R.id.log_in:
                intent = new Intent(login, product_details.class);
                login.startActivity(intent);

                break;


        }
    }
}

