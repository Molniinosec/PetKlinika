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

    public void btngo(View view) {
        Intent i = new Intent(writeActivityclass.this,readActivityclass.class);

        TextView tv1 = findViewById(R.id.editTextTextPersonName);
        String str = tv1.toString();
        String strpet = findViewById(R.id.editTextTextPersonName2).toString();
        String date = findViewById(R.id.editTextDate).toString();
        i.putExtra("FIO", str);
        i.putExtra("Pet", strpet);
        i.putExtra("DATE", date);
        startActivity(i);
    }

    public void btnclose(View view) {
        System.exit(0);

    }
}
