package contactBook;

import java.util.ArrayList;
import java.util.Scanner;

public class Contact {

    public static void main(String[] args) {

        ArrayList<String> phoneNumber = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> address = new ArrayList<>();
        ArrayList<String> email = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter total number of contacts");
        int total = scanner.nextInt();
        for (int i = 1; i <= total; i++) {
            System.out.println("Add contact "+ i);
            getContact(phoneNumber, name, address, email);

        }
            printContact(phoneNumber, name, address, email);

        }

    private static void getContact(ArrayList<String> phoneNumber, ArrayList<String> name, ArrayList<String> address, ArrayList<String> email) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name: ");
        String userName = scanner.nextLine();
        name.add(userName);

        System.out.println("PhoneNumber: ");
        String userPhoneNumber = scanner.nextLine();
        phoneNumber.add(userPhoneNumber);

        System.out.println("Email: ");
        String userEmail = scanner.nextLine();
        email.add(userEmail);

        System.out.println("Address: ");
        String userAddress = scanner.nextLine();
        address.add(userAddress);
    }

    private static void printContact(ArrayList<String> phoneNumber, ArrayList<String> name, ArrayList<String> address, ArrayList<String> email) {
        for (int i = 0; i < name.size(); i++) {
            System.out.println("Contact " + i);

            System.out.println("=========================================================================================");
            System.out.printf("%12s%60s%n", "Name:" , name.get(i));
            System.out.printf("%12s%60s%n", "PhoneNumber:" , phoneNumber.get(i));
            System.out.printf("%12s%60s%n", "Address:", address.get(i));
            System.out.printf("%12s%60s%n", "Email:", email.get(i));
            System.out.println("=========================================================================================");
        }
    }
}
