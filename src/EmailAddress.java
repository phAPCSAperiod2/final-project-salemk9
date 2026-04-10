public class EmailAddress {

    private String name;
    private String date;

    public EmailAddress(String theName, String theDate) {
        name = theName;
        date = theDate;

    }

    public String getName() {
        return name;
    }

    public String date() {
        return date;
    }

    public String toString() {
        return "Email name: " + name + " at " + date;
    }

}
