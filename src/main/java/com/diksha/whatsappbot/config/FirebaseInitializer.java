package com.diksha.whatsappbot.config;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;

@Component
public class FirebaseInitializer implements CommandLineRunner {

    @Override
    public void run(String... args) {
        System.out.println("🔥 Firebase init method started...");
        try {
            FileInputStream serviceAccount =
                    new FileInputStream("src/main/resources/firebase-config.json");

            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .setDatabaseUrl("https://your-project-id.firebaseio.com") // replace this
                    .build();

            FirebaseApp.initializeApp(options);
            System.out.println("✅ Firebase initialized!");
        } catch (Exception e) {
            System.out.println("❌ Firebase init error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

