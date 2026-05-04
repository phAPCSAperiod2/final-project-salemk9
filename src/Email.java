
/**
*
* This class, EmailAddress, creates a template for the user to input an email address.
* It also includes the getter methods for the different aspects of the emaila addresses.
* Author: Salem Kiar
* Date: 4/13/26
*
**/

public class Email {

    // declare instance variables
    private String sender;
    private String subject;
    private String content;
    private int month;
    private int day;
    private String category;


    // create constructor for EmailAddress and initialize instance variables
    public Email(String theSender, String theSubject, String theContent, int theMonth, int theDay) {
        sender = theSender;
        subject = theSubject;
        content = theContent;
        month = theMonth;
        day = theDay;
        category = "Uncategorized";

    }

    // getter method for sender
    public String getSender() {
        return sender;
    }

    // getter method for subject
    public String getSubject() {
        return subject;
    }

    // getter method for content
    public String getContent() {
        return content;
    }

    // getter method for month
    public int getMonth() {
        return month;
    }

    // getter method for day
    public int getDay() {
        return day;
    }

    // getter method for category
    public String getCategory() {
        return category;
    }

    // setter methods for instance variables
    public void setCategory(String newCategory)
    {
        category = newCategory;
    }

    // method for formatted string
    public String toString() {
        return "Date: " + (month + 1) + "/" + (day + 1) + " | From: " + sender + " | Subject: " + subject + " | Category: " + category;
    }

}
