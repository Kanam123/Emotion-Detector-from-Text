Emotion Detector from Text
A simple Java console program that detects emotions from your input text based on predefined keywords and responds with a matching emoji.

✨ Features
Detects happy, sad, angry, tired, and excited emotions.
Uses keyword matching to identify emotions from sentences.
Returns both the detected emotion and an appropriate emoji.
Keeps running until you type exit.

Usage
Compile the program
javac EmotionDetectorFromText.java

Run the program
java EmotionDetectorFromText

Type your sentence and see the detected emotion. Example:
I am feeling very glad today
happy 😄
Type exit to quit the program.

Example Output
I am feeling very glad today
happy 😄

I am so sleepy and exhausted
tired 😴

This is amazing, I’m thrilled!
excited 🎉

exit

How It Works
Predefined keyword lists for each emotion.
User input is cleaned and split into words.
The program counts keyword matches for each emotion.
The emotion with the highest match count is displayed with an emoji.

📜 License
This project is open-source and available for educational use.
