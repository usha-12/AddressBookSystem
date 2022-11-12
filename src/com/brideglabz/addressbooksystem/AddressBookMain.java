package com.brideglabz.addressbooksystem;

public class AddressBookMain {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        System.out.println("--------------------------------Welcome to the AddressBookSystem program-------------------------------------");
        addressBook.addContact();
        addressBook.printAddressBook();
        addressBook.addNewContact();
    }
}
/*Ability to add a new
        Contact to Address Book
        - Use Console to add person details from
        AddressBookMain class
- Use Object-Oriented Concepts to manage
        relationship between AddressBook and Contact
        Person*/