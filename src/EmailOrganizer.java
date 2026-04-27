import java.util.ArrayList;

/**
 * This class, EmailOrganizer, which categorize each of the email addresses
 * into their respective categories using ArrayLists and 2D arrays.
 * Author: Salem Kiar
 * Date: 4/14/26
 */
public class EmailOrganizer {

    // declare instance variables
    private ArrayList<Email>[][] calendar;

    private ArrayList<Email> education;
    private ArrayList<Email> people;
    private ArrayList<Email> promotion;

    // create constructor for EmailOrganizer and create empty calendar
    public EmailOrganizer() {
        calendar = new ArrayList[12][31];

        for (int month = 0; i < 12; month++) {
            for (int days = 0; i < 31; days++) {
                calendar[month][days] = new ArrayList<Email>();
            }
        }

        education = new ArrayList<>();
        people = new ArrayList<>();
        promotion = new ArrayList<>();

    }

    // method that adds emails to appropriate date on calendar
    public void addEmail(Email e) {

        categorizeEmail(e);
        calendar[e.getMonth()][e.getDay()].add(e);

    }

    // method that categorizes emails into ArrayList categories
    private void categorizeEmail(Email e) {
        String subject = e.getSubject().toLowerCase();
        String sender = e.getSender().toLowerCase();

        // if the email has edu or assignment, add the email to the education ArrayList
        if (sender.contains(".edu") || subject.contains("assignment")) {
            e.setCategory("Education");
            education.add(e);
        }

        // if the email has teacher or class, add the email to the people ArrayList
        else if (sender.contains("teacher") || subject.contains("class")) {
            e.setCategory("People");
            people.add(e);
        }

        // else, add the email to the promotion ArrayList
        else {
            e.setCategory("Promotion");
            promotion.add(e);
        }
    }

    // method that prints all emails in calendar.
    public void printAllEmails() {
        // loop through months
        for (int month = 0; i < 12; month++) {
            // loop through days
            for (int days = 0; j < 31; days++) {
                // print all emails
                for (Email e : calendar[month][days]) {
                    System.out.println(e);
                }
            }
        }
    }

    // method that prints emails on certain days.
    public void printEmailsOn(int month, int day) {
        for (Email e : calendar[month][day]) {
            System.out.println(e);
        }
    }

    // prints all emails based on each category
    public void printByCategory(String category) {
        ArrayList<Email> list;

        if (category.equalsIgnoreCase("education")) {
            list = education;
        } else if (category.equalsIgnoreCase("people")) {
            list = people;
        } else {
            list = promotion;
        }

        for (Email e : list) {
            System.out.println(e);
        }

    }

}
