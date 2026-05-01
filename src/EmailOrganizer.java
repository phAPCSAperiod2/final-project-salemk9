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
        calendar = new Email[12][31];

        education = new ArrayList<>();
        people = new ArrayList<>();
        promotion = new ArrayList<>();

        eduKeywords = new ArrayList<>();
        peopleKeywords = new ArrayList<>();
        promoKeywords = new ArrayList<>();

    }

    public void addEducationKeyword(String word)
    {
        eduKeywords.add(word.toLowerCase());
    }

    public void addPeopleKeyword(String word)
    {
        peopleKeywords.add(word.toLowerCase());
    }

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

        String text = (e.getSubject() + " " + e.getSender().toLowerCase());

        for (String word : eduKeywords)
        {
            if (text.contains(word))
            {
                e.setCategory("Education");
                education.add(e);
                return;
            }
        }

        for (String word : peopleKeywords)
        {
            if (text.contains(word))
            {
                e.setCategory("People");
                people.add(e);
                return;
            }
        }

        for (String word : promoKeywords)
        {
            if (text.contains(word))
            {
                e.setCategory("Promotion");
                promotion.add(e);
                return;
            }
        }

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

    public void printEmailsOn(int month, int day) {
        if (calendar[month][day] != null) {
            System.out.println(calendar[month][day]);
        }
        else {
            System.out.println("No email on this date.");
        }
    }


}
