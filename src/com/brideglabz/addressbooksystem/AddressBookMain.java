package com.brideglabz.addressbooksystem;
import java.util.*;

public class AddressBookMain {
    static Scanner sc = new Scanner(System.in);
    static List<AddressBook> list = new ArrayList<AddressBook>();
    static List<AddressBookRecords> bookNameLst = new ArrayList<>();
    static Map<Integer, String> booksLst = new HashMap<>();
    boolean result;

    public static void addContact() {
        System.out.println("Enter your firstName : ");
        String firstName1 = sc.nextLine();
        // Restricted to duplicate entry
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getFirstName().equalsIgnoreCase(firstName1)) {
                System.out.println("This name is already exists try with another name");
                addMultiplePerson();
                break;
            }
        }
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

    public void addAddressBook() {
        System.out.println("Enter id : ");
        int id = sc.nextInt();
        System.out.println("Enter name : ");
        String bookName = sc.next();
        AddressBookRecords book = new AddressBookRecords(id, bookName);

        if (bookNameLst.isEmpty()) {
            bookNameLst.add(book);
            booksLst.put(id, bookName);
            System.out.println("New record added  : ");
        } else {
            for (int i = 0; i < bookNameLst.size(); i++) {
                if (bookNameLst.get(i).getBookName().equals(bookName)) {
                    result = bookNameLst.get(i).getBookName().equals(bookName);
                    System.out.println("Record is already exists : ");
                    break;
                }
            }
            if (!result) {
                bookNameLst.add(book);
                booksLst.put(id, bookName);
                System.out.println("Record added successfully : ");
            }
        }
    }

    public static void main(String[] args) {
        AddressBookMain addressBookMain = new AddressBookMain();
        System.out.println("Welcome to Address Book Program..");
        addressBookMain.addAddressBook();
        addContact();
        System.out.println(bookNameLst);
        System.out.println(list);
    }
}
/*Refactor to add multiple
Address Book to the
System. Each Address Book
has a unique Name - Use Console to add new Address Book - Maintain Dictionary of Address Book Name to

Address*/