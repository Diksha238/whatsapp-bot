# WhatsApp Chatbot Backend – Internship Project

This is a Java Spring Boot-based backend project that simulates a WhatsApp chatbot. It handles user messages, provides automated replies using predefined logic, and stores all chat messages in Firebase Firestore.

---

## 🚀 Features

- ✅ REST API endpoint to receive messages
- ✅ Chatbot replies based on keyword logic
- ✅ Firebase Firestore integration to store messages
- ✅ Clean, modular code using Spring Boot structure
- ✅ Ready for deployment (Render, Heroku, etc.)

---

## 🛠️ Tech Stack

- **Java 17+**
- **Spring Boot 3.x**
- **Firebase Admin SDK**
- **Maven**
- **Postman (for testing)**

---

## 📦 Project Structure

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
│ └── (firebase-config.json) ❌ not included in GitHub
└── pom.xml


```

---

## 🔐 Firebase Config

To connect to Firebase:

1. Go to Firebase Console > Project Settings > Service Accounts
2. Click **Generate New Private Key**
3. Download the `firebase-config.json`
4. Place it in:
   'src/main/resources/firebase-config.json'
   
5. ⚠️ **Never commit this file to GitHub** — it is ignored via `.gitignore`.

---

## 📫 API Endpoint

| Method | Endpoint                     | Description               |
|--------|-------------------------------|---------------------------|
| POST   | `/whatsapp/webhook`           | Receives a plain message  |

### 🔁 Example Request:

**POST** `http://localhost:8080/whatsapp/webhook`  
**Body (raw/text):**
hi

### ✅ Example Response:
"Hello! 👋 How can I assist you with navigation?"

---

## 🧠 Sample Chatbot Logic

The bot responds to:
- `"hi"` → Hello! 👋
- `"help"` → Shows options
- `"directions"` → Asks for location
- `"about"` → About the bot
- anything else → Default fallback message

---

## ⚙️ How to Run

1. Clone this repo:
   https://github.com/Diksha238/whatsapp-bot
2. Add your `firebase-config.json` to `src/main/resources/`
3. Run the app:
- In IntelliJ: run `WhatsAppBotApplication.java`
- Or via terminal:
  ```
  mvn spring-boot:run
  ```

---

## 🙋‍♀️ Author

**Diksha**  
Java Developer Intern  
🌐 [GitHub Profile](https://github.com/Diksha238)

---

## 📌 Status

✅ Firebase initialized  
✅ Webhook endpoint active  
✅ Chatbot reply logic working  
✅ Messages stored in Firestore  
🔜 (Optional) Deploy to Render

---

## 📃 License

This project is open for educational/internship use only.
