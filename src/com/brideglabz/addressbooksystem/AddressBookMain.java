package com.brideglabz.addressbooksystem;

public class AddressBookMain {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        System.out.println("--------------------------------Welcome to the AddressBookSystem program-------------------------------------");
        addressBook.addContact();
        addressBook.printAddressBook();
    }
}
/*Ability to create a Contacts in Address
Book with first and last names, address,
city, state, zip, phone number and
email...
- Program is written using IDE like IntelliJ
- Every UC is in a separate Git Branch and then merged with main
- Naming Convention, Indentation, etc Code Hygiene will be checked during
Review
- Git Check In Comments and Version History will be monitored*/