package com.example;

import java.util.LinkedList;

class ContactDetails {

    LinkedList<String> contacts = new LinkedList<String>();
    public void contacts(String name, String number) {
        contacts.add(name);
        contacts.add(number);
        this.contacts = contacts;
        }
}