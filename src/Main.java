/**
*
* This class, Main, creates the menu for the user to view and add emails.
* It also includes a while loop that encompasses the logic for the program to run smoothly.
* Author: Salem Kiar
* Date: 4/13/26
*
**/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        // setting up input for user
        Scanner input = new Scanner(System.in);
        EmailOrganizer organizer = new EmailOrganizer();

        // condition for while loop to continue running
        boolean running = true;

        while (running) {
            // Give user options for what they want to do
            System.out.println("\n Email Organizer Menu");
            System.out.println("1. Add keyword");
            System.out.println("2. Add email (Tip: add ALL keywords before you enter an email) ");
            System.out.println("3. View all emails");
            System.out.println("4. View email by date");
            System.out.println("5. Exit");
            System.out.println("Choose an option: ");

            // Look for user input based on the number they chose
            int choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {

                // Ask user for category of keyword and assign it to category
                System.out.println("Enter category (education/people/promotion): ");
                String category = input.nextLine();

                System.out.println("Enter keyword: ");
                String keyword = input.nextLine();

                // Add keyword to correct category based on what the user inputted
                if (category.equalsIgnoreCase("education")) {
                    organizer.addEducationKeyword(keyword);
                }

                if (category.equalsIgnoreCase("people")) {
                    organizer.addPeopleKeyword(keyword);
                }

                else {
                    organizer.addPromoKeyword(keyword);
                }

            }

            else if (choice == 2) {

                // Let the create a new email, and ask them for the sender, subject, content, month, and day
                // Assign the input to the appropriate variables
                System.out.print("Sender: ");
                String sender = input.nextLine();

                System.out.print("Subject: ");
                String subject = input.nextLine();

                System.out.print("Content: ");
                String content = input.nextLine();

                System.out.print("Month (1-12): ");
                int month = input.nextInt() - 1;

                System.out.print("Day (1-31): ");
                int day = input.nextInt() - 1;
                input.nextLine();

                // Create new email object based on the user inputs
                Email email = new Email(sender, subject, content, month, day);
                organizer.addEmail(email);
            }

            else if (choice == 3) {
                // print all emails inputted by the user
                organizer.printAllEmails();
            }

            else if (choice == 4) {
                // determine which month and day the user wants
                System.out.print("Month (1-12): ");
                int month = input.nextInt() - 1;

                System.out.print("Day (1-31): ");
                int day = input.nextInt() - 1;
                input.nextLine();

                // print all the emails of that month and day
                organizer.printEmailsOn(month, day);
            }

            else if (choice == 5) {
                running = false;
            }

        }
        // close input
        input.close();
    }

}
