package com.diksha.whatsappbot.controller;

import com.diksha.whatsappbot.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/whatsapp")
public class WhatsAppController {

    @Autowired
    private ChatService chatService;

    @PostMapping("/webhook")
    public ResponseEntity<String> receiveMessage(@RequestBody String message) {
        System.out.println("📩 Endpoint Hit!");
        System.out.println("📩 Received message: " + message);
        String reply = chatService.generateReply(message);
        return ResponseEntity.ok(reply);
    }
}

