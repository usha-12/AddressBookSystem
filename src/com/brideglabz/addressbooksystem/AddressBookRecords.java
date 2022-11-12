package com.brideglabz.addressbooksystem;

public class AddressBookRecords {
    private int id;
    private String bookName;

    public AddressBookRecords(int id, String bookName) {
        this.id = id;
        this.bookName = bookName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "AddressBookRecords{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
