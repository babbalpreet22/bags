package com.example.bags;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class signin extends AppCompatActivity {
    ImageView image; EditText email; EditText password; Button signIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        image=findViewById(R.id.image);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        signIn=findViewById(R.id.signIn);
    }
}
