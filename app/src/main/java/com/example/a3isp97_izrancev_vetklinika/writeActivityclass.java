package com.example.a3isp97_izrancev_vetklinika;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class writeActivityclass extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.write_activity);
    }

    public void btnclose(View view) {
        System.exit(0);

    }

    public void btngoone(View view) {
        Intent i = new Intent(writeActivityclass.this,readActivityclass.class);

        String str =findViewById(R.id.editTextTextPersonName).toString();
        String strg = findViewById(R.id.editTextTextPersonName2).toString();
        String date = findViewById(R.id.editTextDate).toString();
        i.putExtra("fio", str);
        i.putExtra("pet", strg);
        i.putExtra("date", date);

        startActivity(i);
    }
}
