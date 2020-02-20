package com.example.bags;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ImageView shop; Button signin; Button signup;
    Context context=MainActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        shop=findViewById(R.id.shop);
        signin=findViewById(R.id.signin);
        signup=findViewById(R.id.signup);

        signin.setOnClickListener(this);
        signup.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
         switch (v.getId()){
             case R.id.signin:
                 intent=new Intent(context,signin.class);
                 context.startActivity(intent);
                 break;

             case R.id.signup:
                 intent =new Intent(context,signup.class);
                 context.startActivity(intent);
                 break;
         }


    }
}
