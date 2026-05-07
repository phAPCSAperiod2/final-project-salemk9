[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=23509035)
# AP Computer Science A – Final Project

## 🔹 Project Title
Email Organizer Program

## 🔹 What This Software Does
This project categroizes the emails inputted by the user into three categories, including education, people, and promotion. The program categorizes these emails
based on keywords found (which can also be found), the sender or subject of the email, and the date the email was sent.

## 🔹 Who It’s For
The program is mainly geared towards high school or college students who have trouble organizing their email and do not have the time to decide which ones are important or not. This is important and matters because the user can miss out on emails that have important information in them, making the user miss out on opportunities that they would have otherwise taken if they were told.

## 🔹 How to Run the Program
In order to run my program, the user has to choose one of the options that are provided from the menu and write the corresponding number. Then, based on what they choose, they can input certain emails and keywords based on what the user wants. After inputting all the keywords and emails that they wanted to, the user can view all the emails by date and see the categories that they correspond to.

## 🔹 Technical Overview
Brief description of:
- Main classes
- Key data structures
- Program logic

The first class that I made was my Email class, which provides the template for the user to create an Email object including the sender, subject, date it was sent, and content. It also includes getter and setter methods so that the program can access different aspects of the email. My next class is my EmailOrganizer class, which includes the ArrayLists for categories and keywords and methods that will organize the Email objects into these ArrayLists. Lastly, I have my Main class, which creates a menu for which the user can enter what they want to do with the program, including adding keywords, adding emails, and viewing the emails in chronological order. 

## 🔹 Class Diagram
(https://drive.google.com/file/d/1wh2fID8p1zTPeZJJPSucZO0WaQYBr2cs/view?usp=sharing)

## 🔹 Known Limitations / Future Improvements
One of the known limitations of my program is that the user must input all keywords that they plan to use before entering any emails. This is because the for loop traverses
through the array of keywords, and if the keywords aren't present, the email is categorized as "other" even though it should not be.
---
