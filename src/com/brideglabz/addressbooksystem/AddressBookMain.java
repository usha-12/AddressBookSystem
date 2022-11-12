package com.brideglabz.addressbooksystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {
   static Scanner sc = new Scanner(System.in);
    static List<AddressBook> list = new ArrayList<AddressBook>();
    public static void addContact() {
        System.out.println("Enter your firstName : ");
        String firstName = sc.next();
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
    public static void editContact() {
        System.out.println("------------edit existing contact person using their name--------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name : ");
        String firstName = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getFirstName().equalsIgnoreCase(firstName)) {
                list.remove(i);
                addContact();
            } else {
                System.out.println("No data found");
            }
        }
        sc.close();
    }
    public static void deleteContact() {
        System.out.println("------------------------Delete a person using person's name------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name : ");
        String firstName = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getFirstName().equalsIgnoreCase(firstName)) {
                list.remove(i);
            } else {
                System.out.println("No data found");
            }
        }
        sc.close();
    }
    public static void addMultiplePerson() {
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
        addContact();
        addMultiplePerson();
        System.out.println(list);
    }
}
/*Ability to add multiple
person to Address Book
- Use Console to add person details one at a time
- Use Collection Class to maintain multiple
contact persons in Address Book*/