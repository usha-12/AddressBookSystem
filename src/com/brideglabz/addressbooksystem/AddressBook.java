package com.brideglabz.addressbooksystem;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class AddressBook {
    List<Contact> list = new LinkedList<>();
    static Scanner sc = new Scanner(System.in);
    public void addContact() {
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
        Contact contact = new Contact();
        contact.setFirstName(firstName);
        contact.setEmail(email);
        contact.setAddress(address);
        contact.setCity(city);
        contact.setLastName(lastName);
        contact.setState(state);
        contact.setZip(zip);
        contact.setPhoneNo(phoneNo);
        list.add(contact);
    }
    public void printAddressBook(){
        System.out.println(list);
    }
}
