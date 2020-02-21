package com.example.bags;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class signin extends AppCompatActivity implements View.OnClickListener {
    ImageView image;
    EditText email;
    EditText password;
    Button signIn;
    Button retrieve;
    Context context = signin.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        image = findViewById(R.id.image);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        signIn = findViewById(R.id.signIn);
        retrieve=findViewById(R.id.retrieve);

        signIn.setOnClickListener(this);
        retrieve.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intent;
        switch (v.getId()) {
            case R.id.signIn:
                intent = new Intent(context, product_details.class);
                context.startActivity(intent);
                break;

            case R.id.retrieve:
                sendData();
                intent = new Intent(context, retrieve.class);
                context.startActivity(intent);
                break;



        }
    }

    private void sendData() {
    }
}
