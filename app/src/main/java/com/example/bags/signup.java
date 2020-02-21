package com.example.bags;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class signup extends AppCompatActivity implements View.OnClickListener {

    ImageView image_signup;
    EditText name;
    EditText email;
    EditText password;
    Button signUp;
    Context context = signup.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        image_signup = findViewById(R.id.image_signup);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        signUp = findViewById(R.id.signUp);

        signUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.signUp:
                intent = new Intent(context, signin.class);
                context.startActivity(intent);
                break;


        }
    }
}
