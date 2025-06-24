# 💬 WhatsApp Chatbot Backend – Internship Project

This is a **Java Spring Boot-based** backend project that implements a **WhatsApp-style chatbot**. It handles incoming user messages, responds using keyword-based logic, and stores all chat messages securely in **Firebase Firestore**.

---

## 🚀 Features

✅ REST API endpoint to receive user messages  
✅ Auto-replies using keyword logic  
✅ Firebase Firestore integration to store chat history  
✅ Clean, modular Spring Boot code structure  
✅ Ready for deployment (Render, Heroku, etc.)

---

## 🛠️ Tech Stack

- Java 17+
- Spring Boot 3.x
- Firebase Admin SDK
- Maven
- Postman (for testing)

---

## 📁 Project Structure

```bash
whatsapp-bot/
├── src/
│ └── main/
│ ├── java/
│ │ └── com/diksha/whatsappbot/
│ │ ├── WhatsAppBotApplication.java
│ │ ├── controller/
│ │ │ └── WhatsAppController.java
│ │ ├── service/
│ │ │ └── ChatService.java
│ │ └── config/
│ │ └── FirebaseInitializer.java
│ └── resources/
│ ├── application.properties
│ └── firebase-config.json ❌ (not committed)
├── pom.xml


```

---

## 🔐 Firebase Setup

To connect the app with Firebase:

1. Go to [Firebase Console](https://console.firebase.google.com/)
2. Navigate to:  
   **Project Settings** → **Service Accounts** → *Generate New Private Key*
3. Download the `firebase-config.json`
4. Place the file in:
   src/main/resources/firebase-config.json

> ⚠️ **Important:** Never commit this file to GitHub — it is ignored via `.gitignore`.

---

## 📫 API Endpoint

| Method | Endpoint             | Description              |
|--------|----------------------|--------------------------|
| POST   | `/whatsapp/webhook`  | Receives a user message  |

### 🔁 Example Request

**POST** `http://localhost:8080/whatsapp/webhook`  
**Body** (raw / text):
hi

### ✅ Example Response

"Hello! 👋 How can I assist you with navigation?"

---

## 🧠 Chatbot Logic

The bot responds to the following messages:

| Input        | Bot Reply                                 |
|--------------|--------------------------------------------|
| `hi`         | Hello! 👋                                  |
| `help`       | Here’s how I can help you...              |
| `directions` | Sure! Please share your location.         |
| `about`      | I’m a Java-based WhatsApp-style chatbot.  |
| *anything else* | Sorry, I didn’t understand that. 🤖    |

---

## ▶️ How to Run

1. **Clone the repository**
   ```bash
   git clone https://github.com/Diksha238/whatsapp-bot.git
   cd whatsapp-bot
2. **Add Firebase configuration**
```bash
Download your firebase-config.json from Firebase Console
Place it at: src/main/resources/firebase-config.json
```
3. **Build and run the app**
```bash
mvn spring-boot:run
```
4. **Test with Postman**
```bash 
Method: POST
URL: http://localhost:8080/whatsapp/webhook
Body: raw text (e.g., hi)
```
🙋‍♀️ Author

Diksha
Java Developer Intern
🔗 GitHub Profile
📫 [Email optionally here]

🔜 Coming Soon

🌐 Deploy to Render
🌟 Advanced NLP-based replies
🧠 Chat history retrieval feature
📃 License

This project is open for educational and internship use only.
© 2025 Diksha – All Rights Reserved.

