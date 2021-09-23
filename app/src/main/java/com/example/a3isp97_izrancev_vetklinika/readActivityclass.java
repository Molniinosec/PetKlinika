package com.example.a3isp97_izrancev_vetklinika;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class readActivityclass extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.read_activity);
        Bundle extras = getIntent().getExtras();
        String name = extras.getString("ФИО");
        String pet = extras.getString("PET");
        String date = extras.getString("DATE");
        TextView textView = new TextView(this);

        textView.setText("Name: " +name + "\nPet "+ pet + "\nDate "+ date);


    }

    public void btnout(View view) {
        System.exit(0);
    }
}
