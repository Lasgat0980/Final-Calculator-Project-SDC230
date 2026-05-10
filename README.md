# Final-Calculator-Project-SDC230
What is this project?
The Dickens Math-Pro is a digital calculator I built for my final project. My goal was to create a tool that isn't just good at math, but is also smart enough to handle mistakes without crashing. It can do basic math, handle long lists of numbers and operations at one time, and remembers your work so you don't have to write it down.

Cool Features I Built:
The Memory Vault: Every time you do a math problem, the app asks if you want to save it. It can hold up to 10 full equations (like 8 + 2 = 10).

Multi-Value Mode: Instead of doing one problem at a time, you can type a whole string of numbers (like 10 20 30 40) and the app will add or multiply them all at once.

Safety Net: I spent a lot of time making sure this app doesn't crash. If you accidentally type a letter instead of a number, or try to divide by zero, the app will just give you a friendly warning and let you try again.

Clean Slate: I added a Clear Memory button so you can wipe the vault and start over whenever you want or you can clear it by restarting the program.

How the Code is Organized (The "Parts"):
I split the program into three files to keep it organized:

App.java: This is the "brain" or the manager. it handles the menus and talks to the user.

Division.java: This is a specialist file that only handles division. I kept it separate to make sure the "divide by zero" safety check was really reliable.

CalculationMemory.java: This is like a digital notebook. It handles saving, showing, and deleting your history.

How to use it:
Open your terminal.

Compile the code (this turns the text into a program):
javac App.java Division.java CalculationMemory.java

Run it:
java App

What I learned:
Building this taught me how to use Try-Catch blocks (to stop crashes) and how to use Lists to store data. It also helped me understand how different files in Java "talk" to each other to make a complete application.
