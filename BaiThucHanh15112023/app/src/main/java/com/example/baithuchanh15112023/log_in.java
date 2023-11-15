package com.example.baithuchanh15112023;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class log_in extends AppCompatActivity {
    ImageView image;
    TextView txtSignup;
    TextView txtpass;
    int cout = 0;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        txtSignup= findViewById(R.id.txtsignup);
        image = findViewById(R.id.hide);
        txtpass = findViewById(R.id.txtpass);
        txtSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(log_in.this,SignUp.class));
            }
        });
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cout++;
                if(cout%2!=0)
                {
                    txtpass.setTransformationMethod(null);
                }else {
                    txtpass.setTransformationMethod(new PasswordTransformationMethod());
                }
            }
        });
    }
}