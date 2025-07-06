package com.example.cyberawarenessapp;   // ← keep or adjust

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ThreatsActivity extends AppCompatActivity {

    private static final String THREATS_TEXT =
            "🔴 1. Phishing Attacks\n" +
                    "Phishing tricks users into revealing personal data via fake emails, SMS, or websites.\n" +
                    "• Example: A spoofed bank email asking for your login.\n" +
                    "• Protection: Don’t click unknown links, verify URLs carefully.\n\n" +

                    "🟠 2. Malware\n" +
                    "Malware is malicious software that can damage, steal, or control data.\n" +
                    "• Virus – attaches to files and spreads.\n" +
                    "• Worm – spreads automatically over networks.\n" +
                    "• Trojan – disguised as legitimate software.\n" +
                    "• Spyware – silently steals data.\n" +
                    "• Ransomware – locks files and demands payment.\n" +
                    "• Protection: Use antivirus, keep software updated, avoid pirated apps.\n\n" +

                    "🔵 3. Social Engineering\n" +
                    "Manipulating people instead of systems to gain access.\n" +
                    "• Example: Impersonating IT support to get passwords.\n" +
                    "• Protection: Verify identities, never share OTPs or passwords.\n\n" +

                    "🟣 4. Man‑in‑the‑Middle (MITM) Attacks\n" +
                    "Attackers secretly intercept communication between two parties.\n" +
                    "• Example: Sniffing traffic on open Wi‑Fi and stealing logins.\n" +
                    "• Protection: Use HTTPS, VPNs, and avoid open Wi‑Fi for sensitive work.\n\n" +

                    "🟤 5. Denial‑of‑Service (DoS) Attacks\n" +
                    "Flooding a server with traffic to make it unavailable.\n" +
                    "• Target: Websites, game servers, online services.\n" +
                    "• Protection: Firewalls and traffic‑filtering tools.\n\n" +

                    "🟢 6. Password Attacks\n" +
                    "Brute‑force or dictionary attacks to guess passwords.\n" +
                    "• Protection: Unique, complex passwords and 2‑factor authentication.\n\n" +

                    "⚫ 7. Zero‑Day Exploits\n" +
                    "Attacks on vulnerabilities before developers patch them.\n" +
                    "• Protection: Keep software updated and monitor security advisories.\n\n" +

                    "⚪ 8. Insider Threats\n" +
                    "Employees or contractors abusing their access.\n" +
                    "• Protection: Principle of least privilege, monitoring, and clear policies.\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_threats);

        TextView txtThreats = findViewById(R.id.txtThreats);
        txtThreats.setText(THREATS_TEXT);
    }
}
