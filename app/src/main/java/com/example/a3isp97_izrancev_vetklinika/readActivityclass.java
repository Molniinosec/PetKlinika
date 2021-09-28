package com.example.a3isp97_izrancev_vetklinika;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class readActivityclass extends AppCompatActivity {
    TextView textView =findViewById(R.id.textView);

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.read_activity);
        Intent intent2 = this.getIntent();
        String name = intent2.getStringExtra("fio");
        String pet = intent2.getStringExtra("pet");
        String date = intent2.getStringExtra("date");

        textView.setText("Name: " +name + "\nPet "+ pet + "\nDate "+ date);
        startActivity(intent2);




    }

    public void btnout(View view) {
        System.exit(0);
    }
}
