package com.example.quiz_gory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        Intent intent = getIntent();

        String tekst = intent.getStringExtra("wiadomosc");

        TextView textView =  findViewById(R.id.pytanie_txt);
        textView.setText(tekst);

    }
}