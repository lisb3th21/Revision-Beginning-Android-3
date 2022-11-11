package com.example.revisionbeginningandroid3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class Theme9 extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    CheckBox cb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme9);
        EditText fld=(EditText)findViewById(R.id.editText);
        fld.setText("Licensed under the Apache License, Version 2.0 " +
                "(the \"License\"); you may not use this file " +
                "except in compliance with the License. You may " +
                "obtain a copy of the License at " +
                "http://www.apache.org/licenses/LICENSE-2.0");

        cb=(CheckBox)findViewById(R.id.check);
        cb.setOnCheckedChangeListener(this);
    }

    public void buttonMethod(View view) {
        Toast.makeText(this, "This is the result", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (b) {
            cb.setText("This checkbox is: checked");
        }
        else {
            cb.setText("This checkbox is: unchecked");
        }
    }
}
