import models.ContactManager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

import models.Contact;
public class Main {
    static ContactManager contactManager = new ContactManager();
    public static void main(String[] args) {
       try {
        loadContacts("contacts.txt");
        System.out.println("Contacts loaded...\n\n");
        System.out.println(contactManager);
        manageContacts();
       } catch (FileNotFoundException e) {
        System.out.println(e.getMessage());
       }
    }

    public static void loadContacts(String fileName) throws FileNotFoundException{
        FileInputStream fis = new FileInputStream(fileName);
        Scanner scanFile = new Scanner(fis);
        while (scanFile.hasNextLine()) {
            try {
                Contact contact = new Contact(scanFile.next(), scanFile.next(), scanFile.next());
                contactManager.addContact(contact);
            } catch (ParseException e) {
                System.out.println(e.getMessage());
            }
        }
        scanFile.close();
    }

    public static void manageContacts() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("\nChoose the corresponding option (a, b or c) to achieve the desired objective");
            System.out.println("a). add or b). remove a contact c). exit");
            String option = scan .nextLine();

            switch (option) {
                case "a":
                    System.out.println("Enter the name, phone number and birth date");
                    System.out.print("Name: ");
                    String addName = scan.nextLine();
                    System.out.print("Phone Number: ");
                    String addPhoneNumber = scan.nextLine();
                    System.out.print("Birth Date: ");
                    String addBirthDate = scan.nextLine();
                    try {
                        contactManager.addContact(new Contact(addName, addPhoneNumber, addBirthDate));
                    } catch (ParseException e) {
                        System.out.println(e.getMessage());
                    } finally {
                        System.out.println("\n\n" + contactManager);
                    }
                    
                    break;
                case "b":
                    System.out.println("Who do you intend to remove?");
                    String removeName = scan.nextLine();
                    contactManager.removeContact(removeName);
                    System.out.println("\n\n" + contactManager);
                    break;
                case "c":
                    System.exit(0);
                    break;
                default:
                    scan.close();
                    System.out.println(contactManager);
        

            }
        }
    }

    /**
     * Name: manageContacts
     *
     * Inside the function:
     *   • 1. Starts a new instance of Scanner;
     *   • 2. In an infinite loop, the user can choose to a) add b) remove a contact c) exit.
     *   •        case a: ask for the name, phone number and birthDate.
     *   •        case b: ask who they'd like to remove.
     *   •        case c: break the loop.
     *   • 3. close Scanner.
     */



    /**
     * Name: loadContacts
     * @param fileName (String)
     * @throws FileNotFoundException
     *
     * Inside the function:
     *   • 1. loads contacts from <fileName>;
     *   • 2. From the manager object, it adds all contacts to the contacts list.
     *        Hint: use scan.next to grab the next String separated by white space.
     */

}
