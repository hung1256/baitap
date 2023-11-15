package com.example.baithuchanh15112023;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupMenu;

public class MainActivity extends AppCompatActivity {
    ImageView imagezone;
    EditText txtzone;
    EditText txtarea;
    ImageView imagearea;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagezone = findViewById(R.id.imagedown1);
        imagearea = findViewById(R.id.imagedown2);
        txtzone = findViewById(R.id.txtyourzone);
        txtarea = findViewById(R.id.txtyourarea);
        btn = findViewById(R.id.btnsubmit);
        imagezone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowMenu1();
            }
        });
        imagearea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowMenu2();
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, log_in.class));
            }
        });
    }
    private void ShowMenu1(){
        PopupMenu popupMenu = new PopupMenu(this,imagezone);
        popupMenu.getMenuInflater().inflate(R.menu.menuzone,popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                if(menuItem.getItemId() == R.id.menu1)
                {
                    txtzone.setText("Banasree");
                }
                if(menuItem.getItemId() == R.id.menu2)
                {
                    txtzone.setText("OPTION2");
                }
                if(menuItem.getItemId() == R.id.menu3)
                {
                    txtzone.setText("OPTION3");
                }
                if(menuItem.getItemId() == R.id.menu4)
                {
                    txtzone.setText("OPTION4");
                }
                return false;
            }
        });
        popupMenu.show();
    }
    private void ShowMenu2(){
        PopupMenu popupMenu = new PopupMenu(this,imagearea);
        popupMenu.getMenuInflater().inflate(R.menu.menuarea,popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                if(menuItem.getItemId() == R.id.vietnam)
                {
                    txtarea.setText("Viet Nam");
                }
                if(menuItem.getItemId() == R.id.trungquoc)
                {
                    txtarea.setText("Trung Quoc");
                }
                if(menuItem.getItemId() == R.id.hanquoc)
                {
                    txtarea.setText("Han Quoc");
                }
                if(menuItem.getItemId() == R.id.nhatban)
                {
                    txtarea.setText("Nhat Ban");
                }
                return false;
            }
        });
        popupMenu.show();
    }
}