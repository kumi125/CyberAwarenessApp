package com.example.cyberawarenessapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnQuiz, btnTips, btnLearn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Linking buttons with their XML IDs
        btnQuiz = findViewById(R.id.btnQuiz);
        btnTips = findViewById(R.id.btnTips);
        btnLearn = findViewById(R.id.btnLearn);

        // Start Quiz button
        btnQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                startActivity(intent);
            }
        });

        // Tips button
        btnTips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TipsActivity.class);
                startActivity(intent);
            }
        });

        // Learn Threats button
        btnLearn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ThreatsActivity.class);
                startActivity(intent);
            }
        });
    }
}
