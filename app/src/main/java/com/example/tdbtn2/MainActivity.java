package com.example.tdbtn2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnshow;
    private  Button btnhide;
    private TextView txtVv;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnshow = findViewById(R.id.btnshow);
        btnhide = findViewById(R.id.btnhide);
        txtVv = findViewById(R.id.txtVv);

        btnhide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtVv.setText("  ");
            }
        });

        btnshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtVv.setText("Merci d'avoir cliqué");
            }
        });
    }
}