package com.example.revisionbeginningandroid3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Date;

public class Theme7 extends AppCompatActivity implements  View.OnClickListener {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme7);
        btn=new Button(this);
        btn.setOnClickListener(this);
        updateTime();
        setContentView(btn);
    }

    private void updateTime() {
        btn.setText(new Date().toString());
    }

    @Override
    public void onClick(View view) {
        updateTime();
    }
}