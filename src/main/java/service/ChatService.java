package com.diksha.whatsappbot.service;

import com.google.cloud.firestore.Firestore;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ChatService {

    public String generateReply(String message) {
        // Store message in Firestore
        saveMessageToFirestore("user1", message);  // Use user ID if you have one

        // Simple reply logic
        message = message.trim().toLowerCase();

        return switch (message) {
            case "hi" -> "Hello! 👋 How can I assist you with navigation?";
            case "help" -> "Type 'directions' for route help or 'about' to know more.";
            case "directions" -> "Please send your current location and destination.";
            case "about" -> "This is Diksha’s WhatsApp Navigation Bot 🚗";
            default -> "Sorry, I didn't understand that. Type 'help' for options.";
        };
    }

    private void saveMessageToFirestore(String userId, String message) {
        try {
            Firestore db = FirestoreClient.getFirestore();

            Map<String, Object> chat = new HashMap<>();
            chat.put("userId", userId);
            chat.put("message", message);
            chat.put("timestamp", System.currentTimeMillis());

            db.collection("messages").add(chat);
            System.out.println("💾 Message saved to Firestore");
        } catch (Exception e) {
            System.out.println("❌ Failed to save message: " + e.getMessage());
        }
    }
}

