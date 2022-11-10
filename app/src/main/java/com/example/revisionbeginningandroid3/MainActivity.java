package com.example.revisionbeginningandroid3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void theme7(View view) {
        Intent intent = new Intent(MainActivity.this, Theme7.class);
        startActivity(intent);
    }

    public void theme8(View view) {
        Intent intent = new Intent(MainActivity.this, Theme8.class);
        startActivity(intent);
    }

    public void theme9(View view) {
        Intent intent = new Intent(MainActivity.this, Theme9.class);
        startActivity(intent);
    }

    public void theme10(View view) {
        Intent intent = new Intent(MainActivity.this, Theme10.class);
        startActivity(intent);
    }
}