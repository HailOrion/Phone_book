package com.example;

import java.util.Scanner;

public class Main extends ContactDetails {
    public static void main(String[] args) {
        ContactDetails person = new ContactDetails();
        String storeName;
        String storeNumber;
        String contactNameOrNumber;
        String input;
        String a = "Store contact information";
        String b = "Retrieve contact information";
        
        //App opens
        //Request user input
        System.out.println("Select an Option");
        System.out.println("a " + a);
        System.out.println("b " + b);
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();

        //Store contact
        int i = 0;
        while(i < 1) {
            if (input.contains("a")) {
                System.out.println("Enter name");
                storeName = scanner.nextLine();
                System.out.println("Enter number");
                storeNumber = scanner.nextLine();
                person.contacts(storeName, storeNumber);
                System.out.println("Your contact has been saved");
            }
            else if (input.contains("b")) {
                System.out.println("Contact not found");
                return;
            }
            else {
                System.out.println("Incorrect input");
                return;
            }
            i++;
        }

        //Retrieve saved contact
        System.out.println("To view saved contact, please type \"b\"");
        input = scanner.nextLine();
        int j = 0;
        while(j < 1) {
            if(input.contains("b")) {
                System.out.println("Enter name or number");
                contactNameOrNumber = scanner.nextLine();
                if (person.contacts.contains(contactNameOrNumber)) {
                    System.out.println(person.contacts);
                } else {
                    System.out.println("Contact not found");
                }
            }
            j++;
        }

    }
}
