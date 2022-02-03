package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity{
    Button btnPage5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        btnPage5 = findViewById(R.id.btnNextToPage5);
        Intent intent = new Intent(MainActivity4.this, MainActivity5.class);

        btnPage5.setOnClickListener(v -> {
            startActivity(intent);
        });
    }
}