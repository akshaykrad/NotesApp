package com.example.notesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView engbtn = findViewById(R.id.engbtn);

        engbtn.setOnClickListener(v -> {

            Intent intent=new Intent(MainActivity.this, SelectBranch.class);
            startActivity(intent);
        });
    }
}