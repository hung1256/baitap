package com.example.baithuchanh15112023;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SignUp extends AppCompatActivity {
    ImageView imagehide;
    TextView txtpass;
    int cout =1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        imagehide = findViewById(R.id.hide1);
        txtpass= findViewById(R.id.txtpassword);
        imagehide.setOnClickListener(new View.OnClickListener() {
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