package com.brideglabz.addressbooksystem;
import java.util.*;

public class AddressBookMain {
    static Scanner sc = new Scanner(System.in);
    static List<AddressBook> list = new ArrayList<AddressBook>();
    public static void addContact() {
        System.out.println("Enter your firstName : ");
        String firstName = sc.nextLine();
        // Restricted to duplicate entry
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getFirstName().equalsIgnoreCase(firstName)) {
                System.out.println("This name is already exists try with another name");
                addPerson();
                break;
            }
        }
        System.out.println("Enter your lastName : ");
        String lastName = sc.next();
        System.out.println("Enter your address : ");
        String address = sc.next();
        System.out.println("Enter your city : ");
        String city = sc.next();
        System.out.println("Enter your state : ");
        String state = sc.next();
        System.out.println("Enter your zipCode : ");
        String zip = sc.next();
        System.out.println("Enter your phoneNo : ");
        String phoneNo = sc.next();
        System.out.println("Enter your emailId : ");
        String email = sc.next();
        AddressBook addressBook = new AddressBook();
        addressBook.setFirstName(firstName);
        addressBook.setEmail(email);
        addressBook.setAddress(address);
        addressBook.setCity(city);
        addressBook.setLastName(lastName);
        addressBook.setState(state);
        addressBook.setZip(zip);
        addressBook.setPhoneNo(phoneNo);
        list.add(addressBook);
    }

    public static void addPerson() {
        System.out.println("-----------add multiple person to Address Book-----------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many contact you want to add : ");
        int noOfAddressBook = sc.nextInt();
        int person = 1;
        while (person <= noOfAddressBook) {
            addContact();
            person++;
        }
    }

    public static void main(String[] args) {
        AddressBookMain addressBookMain = new AddressBookMain();
        System.out.println("Welcome to Address Book Program..");
        addPerson();
        System.out.println(list);

    }
}
/*Ability to ensure there is no Duplicate
Entry of the same Person in a particular
Address Book - Duplicate Check is done on Person Name while adding
person to Address Book.
- Use Collection Methods to Search Person by Name for
Duplicate Entry*/