
/**
 * This class, EmailOrganizer, which categorize each of the email addresses
 * into their respective categories using ArrayLists and 2D arrays.
 * Author: Salem Kiar
 * Date: 4/14/26
 */
public class EmailOrganizer {

    // declare instance variables
    private ArrayList<String> education;
    private ArrayList<String> people;
    private ArrayList<String> promotion;
    private ArrayList<EmailAddress> emails;
    private String[][] dates;

    // constructor
    public EmailOrganizer() {
        this.education = new ArrayList<>();
        this.people = new ArrayList<>();
        this.promotion = new ArrayList<>();
        dates = new String();

    }

    public ArrayList<String> emailOrganizer(ArrayList education) {
        for (int i = 0; i < education.size(); i++) {
            if (emails.get(i).substring(i,i+4).equals(".edu") )
            {
                education.add(emails.get(i));
            }

            if (emails.get(i).substring(i,i+9).equals("classroom"))
            {
                people.add(emails.get(i));
            }
            else
            {
                
            }

        }

    }

    public String organizeDates()
    {

    }



}
