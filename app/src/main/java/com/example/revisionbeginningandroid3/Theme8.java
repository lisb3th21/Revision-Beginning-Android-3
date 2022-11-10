package com.example.revisionbeginningandroid3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Date;

public class Theme8 extends AppCompatActivity implements View.OnClickListener{
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme8);
        btn= (Button) findViewById(R.id.button_act);
        btn.setOnClickListener(this);
        updateTime();
    }

    @Override
    public void onClick(View view) {
        updateTime();
    }
    private void updateTime() {
        btn.setText(new Date().toString());
    }
}