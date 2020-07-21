package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView nameText = findViewById(R.id.nameText);
        final TextView answerText = findViewById(R.id.answerText);
        final Button actionButton = findViewById(R.id.actionButton);

        final String[] names = {
                "RED",
                "ЯED"
        };

        final String[] answers = {
                "definitely",
                "no doubt about it",
                "i don't know",
                "ask later",
                "probably no",
                "absolutely not"
        };

        actionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomNumberGenerator = new Random();

                nameText.setText(names[randomNumberGenerator.nextInt(2)]);
                answerText.setText(answers[randomNumberGenerator.nextInt(6)]);
            }
        });

    }
}
