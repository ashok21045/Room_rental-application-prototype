package com.example.roomrental;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class register2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);

        Spinner splocation = findViewById(R.id.splocation);

        String[] location = {
                "Select location",
                "Chitwan",
                "Biratnagar",
                "Kathmandu"
        };

        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(
                        this,
                        android.R.layout.simple_spinner_dropdown_item,
                        location
                );

        splocation.setAdapter(adapter);
    }
}