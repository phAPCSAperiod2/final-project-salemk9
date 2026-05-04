import java.util.ArrayList;

/**
 * This class, EmailOrganizer, which categorize each of the email addresses
 * into their respective categories using ArrayLists and 2D arrays.
 * Author: Salem Kiar
 * Date: 4/14/26
 */
public class EmailOrganizer {

    // declare instance variables
    private Email[][] calendar;

    private ArrayList<Email> education;
    private ArrayList<Email> people;
    private ArrayList<Email> promotion;

    private ArrayList<String> eduKeywords;
    private ArrayList<String> peopleKeywords;
    private ArrayList<String> promoKeywords;

    // create constructor for EmailOrganizer and create empty calendar
    public EmailOrganizer() {

        // initialze 2D array calendar
        calendar = new Email[12][31];

        // initialize ArrayLists
        education = new ArrayList<>();
        people = new ArrayList<>();
        promotion = new ArrayList<>();

        eduKeywords = new ArrayList<>();
        peopleKeywords = new ArrayList<>();
        promoKeywords = new ArrayList<>();

    }

    // methods for adding education keywords
    public void addEducationKeyword(String word)
    {
        eduKeywords.add(word.toLowerCase());
    }

    // methods for adding education keywords
    public void addPeopleKeyword(String word)
    {
        peopleKeywords.add(word.toLowerCase());
    }

    // methods for adding education keywords
    public void addPromoKeyword(String word)
    {
        promoKeywords.add(word.toLowerCase());
    }

    // method that adds emails to appropriate date on calendar
    public void addEmail(Email e) {

        categorizeEmail(e);
        calendar[e.getMonth()][e.getDay()] = e;

    }

    // method that categorizes emails into ArrayList categories
    private void categorizeEmail(Email e) {

        // create variables that contains the email's subject and sender
        String text = (e.getSubject() + " " + e.getSender().toLowerCase());

        // iterate through education keywords and see if sender/subject has it, if so add it to education category
        for (String word : eduKeywords)
        {
            if (text.contains(word))
            {
                e.setCategory("Education");
                education.add(e);
                return;
            }
        }

        // iterate through education keywords and see if sender/subject has it, if so add it to people category
        for (String word : peopleKeywords)
        {
            if (text.contains(word))
            {
                e.setCategory("People");
                people.add(e);
                return;
            }
        }

        // iterate through education keywords and see if sender/subject has it, if so add it to promotion category
        for (String word : promoKeywords)
        {
            if (text.contains(word))
            {
                e.setCategory("Promotion");
                promotion.add(e);
                return;
            }
        }

        // if not found, set category to other
        e.setCategory("Other");

    }

    // method that prints all emails in calendar.
    public void printAllEmails() {
        // loop through months
        for (int month = 0; month < 12; month++) {
            // loop through days
            for (int days = 0; days < 31; days++) {
                // print all emails
                if (calendar[month][days] != null) {
                    System.out.println(calendar[month][days]);
                }
            }
        }
    }

    // method that prints all the Emails on a certain month/day
    public void printEmailsOn(int month, int day) {
        // checks if there is an email on that day and prints it out if so
        if (calendar[month][day] != null) {
            System.out.println(calendar[month][day]);
        }
        // If not, notify user that there is no email on that date
        else {
            System.out.println("No email on this date.");
        }
    }


}
