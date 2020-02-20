package com.example.bags;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class signup extends AppCompatActivity {

    ImageView image_signup; EditText name; EditText email; EditText password; Button signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        image_signup=findViewById(R.id.image_signup);
        name=findViewById(R.id.name);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        signUp=findViewById(R.id.signUp);
    }
}
