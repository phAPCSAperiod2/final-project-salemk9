
/**
*
* This class, EmailAddress, creates a template for the user to input an email address.
* It also includes the getter methods for the different aspects of the emaila addresses.
* Author: Salem Kiar
* Date: 4/13/26
*
**/

public class EmailAddress {

    // declare instance variables name and date
    private String name;
    private String date;

    // create constructor for EmailAddress and initialize name and date
    public EmailAddress(String theName, String theDate) {
        name = theName;
        date = theDate;

    }

    // getter method for name
    public String getName() {
        return name;
    }

    // getter method for date
    public String date() {
        return date;
    }

    // method for formatted string
    public String toString() {
        return "Email name: " + name + " at " + date;
    }

}
