package Phonebook;

import java.util.ArrayList;

public class Phonebook {

    private ArrayList<Record> phoneBook = new ArrayList<>();

    // public Phonebook() {

    // }

    public void addToRecord(Record record) {
        phoneBook.add(record);

    }

    public ArrayList<Record> getPhoneBook() {
        return phoneBook;
    }

    public void setPhoneBook(ArrayList<Record> phoneBook) {
        this.phoneBook = phoneBook;
    }

}
