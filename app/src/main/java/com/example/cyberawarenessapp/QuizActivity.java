package com.example.cyberawarenessapp;      // ← keep or adjust to your package name

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class QuizActivity extends AppCompatActivity {

    // UI widgets
    private TextView txtQuestion;
    private RadioGroup optionsGroup;
    private RadioButton option1, option2, option3, option4;
    private Button btnSubmit;

    // Data
    private final String[] questions = {
            "What does \"phishing\" mean in cybersecurity?",
            "Which is a strong password?",
            "What should you avoid clicking in emails?",
            "Which one is a type of malware?",
            "What does a firewall do?",
            "Which device can transfer malicious code most easily?",
            "Safest way to connect on public Wi‑Fi?",
            "What is ransomware?",
            "Which of these is an example of 2‑factor authentication (2FA)?",
            "What is social engineering?"
    };

    private final String[][] options = {
            {"Fishing websites", "Email scams", "Hacking passwords", "Firewall errors"},
            {"123456", "password", "MyName123", "P@ssw0rd!#2024"},
            {"Images", "Documents", "Links from unknown senders", "Contacts"},
            {"Bluetooth", "Worm", "Wi‑Fi", "SSD"},
            {"Protects against viruses", "Blocks unwanted network traffic", "Stores passwords", "Optimises battery"},
            {"Monitor", "CPU", "Hard Disk", "USB drive"},
            {"Using mobile data", "Clicking ads", "VPN", "Airplane mode"},
            {"Encrypts files and demands money", "Cleans junk files", "Speeds up Wi‑Fi", "Backs up data"},
            {"Password only", "Email OTP", "Fingerprint scan", "Both 2 and 3"},
            {"Manipulating people to give info", "Coding viruses", "Breaking firewalls", "Using antivirus"}
    };

    private final String[] correctAnswers = {
            "Email scams",
            "P@ssw0rd!#2024",
            "Links from unknown senders",
            "Worm",
            "Blocks unwanted network traffic",
            "USB drive",
            "VPN",
            "Encrypts files and demands money",
            "Both 2 and 3",
            "Manipulating people to give info"
    };

    private int currentQuestion = 0;
    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        // Link views
        txtQuestion  = findViewById(R.id.txtQuestion);
        optionsGroup = findViewById(R.id.optionsGroup);
        option1      = findViewById(R.id.option1);
        option2      = findViewById(R.id.option2);
        option3      = findViewById(R.id.option3);
        option4      = findViewById(R.id.option4);
        btnSubmit    = findViewById(R.id.btnSubmit);

        loadQuestion();                     // show first question

        btnSubmit.setOnClickListener(v -> {
            int checkedId = optionsGroup.getCheckedRadioButtonId();
            if (checkedId == -1) {
                Toast.makeText(this, "Please select an answer", Toast.LENGTH_SHORT).show();
                return;
            }

            RadioButton selected = findViewById(checkedId);
            String answer        = selected.getText().toString();

            if (answer.equals(correctAnswers[currentQuestion])) {
                score++;
            }

            currentQuestion++;

            if (currentQuestion < questions.length) {
                loadQuestion();
            } else {
                // Quiz finished
                txtQuestion.setText("Quiz completed!\nYour score: " +
                        score + " / " + questions.length);
                optionsGroup.setVisibility(View.GONE);
                btnSubmit.setEnabled(false);
            }
        });
    }

    /** Loads the current question & options into the UI */
    private void loadQuestion() {
        txtQuestion.setText(questions[currentQuestion]);

        option1.setText(options[currentQuestion][0]);
        option2.setText(options[currentQuestion][1]);
        option3.setText(options[currentQuestion][2]);
        option4.setText(options[currentQuestion][3]);

        // Clear previous selection
        optionsGroup.clearCheck();
    }
}
