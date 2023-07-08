package com.example.finalprojecthotelsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Choose_activity extends AppCompatActivity {


    private EditText editcity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);

        editcity=findViewById(R.id.editCity);
    }

    public void ptnSearch(View view) {
    }
}