package com.example.a3isp97_izrancev_vetklinika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btngo(View view) {
        Intent i = new Intent(MainActivity.this,writeActivityclass.class);
        startActivity(i);
    }
}