
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


    // create constructor for EmailAddress and initialize
    public Email(String theSender, String theSubject, String theContent, int theMonth, int theDay) {
        sender = theSender;
        subject = theSubject;
        content = theContent;
        month = theMonth;
        day = theDay;
        category = "Uncategorized";

    }

    // getter method for instance variables
    public String getSender() {
        return sender;
    }


    public String getSubject() {
        return subject;
    }

    public String getContent() {
        return content;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

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
