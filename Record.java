package Phonebook;

import java.util.ArrayList;

public class Record {

    private Person person;
    private ArrayList<Phone> phones = new ArrayList<>();
    private ArrayList<Email> emails = new ArrayList<>();

    public Record(Person person, ArrayList<Phone> phones, ArrayList<Email> emails) {
        this.person = person;
        this.phones.addAll(phones);
        this.emails.addAll(emails);
    }

    public Record(Person person, Phone phone, Email email) {
        this.person = person;
        this.phones.add(phone);
        this.emails.add(email);
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public ArrayList<Phone> getPhones() {
        return phones;
    }

    public void setPhones(ArrayList<Phone> phones) {
        this.phones = phones;
    }

    public ArrayList<Email> getEmail() {
        return emails;
    }

    public void setEmail(ArrayList<Email> emails) {
        this.emails = emails;
    }

    @Override
    public String toString() {

        return " Person: " + getPerson() + " phone: " + getPhones() + "Email: " + getEmail();
    }
}
