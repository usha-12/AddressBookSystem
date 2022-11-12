package com.brideglabz.addressbooksystem;
import java.util.*;

public class AddressBookMain {
    static Scanner sc = new Scanner(System.in);
    static List<AddressBook> list = new ArrayList<AddressBook>();
    public static void addContact() {
        System.out.println("Enter your firstName : ");
        String firstName = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getFirstName().equalsIgnoreCase(firstName)) {
                System.out.println("This name is already exists try with another name");
                addPerson();
                break;
            }
        }
        System.out.println("Enter your lastName : ");
        String lastName = sc.nextLine();
        System.out.println("Enter your address : ");
        String address = sc.nextLine();
        System.out.println("Enter your city : ");
        String city = sc.nextLine();
        System.out.println("Enter your state : ");
        String state = sc.nextLine();
        System.out.println("Enter your zipCode : ");
        String zip = sc.nextLine();
        System.out.println("Enter your phoneNo : ");
        String phoneNo = sc.nextLine();
        System.out.println("Enter your emailId : ");
        String email = sc.nextLine();
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
    public void searchByCity() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter city name");
        String city = sc.nextLine();
        sc.close();
        for (AddressBook list : list) {
            if (list.getCity().equals(city))
                System.out.println(list);
        }
    }
    public static void main(String[] args) {
        AddressBookMain addressBookMain = new AddressBookMain();
        System.out.println("Welcome to Address Book Program..");
        addPerson();
       addressBookMain.searchByCity();
        System.out.println(list);

    }
}
/*Ability to search Person
in a City or State across
the multiple
AddressBook - Search Result can show multiple person in
the city or state

UC 8

- Use Java Streams*/