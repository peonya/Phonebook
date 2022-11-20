package Phonebook;

import java.util.ArrayList;

public class Record {

    private Person person;
    private ArrayList<Phone> phones = new ArrayList<>();

    public Record(Person person, ArrayList<Phone> phones) {
        this.person = person;
        this.phones.addAll(phones);
    }

    public Record(Person person, Phone phone) {
        this.person = person;
        this.phones.add(phone);
    }

    public ArrayList<String> recordToFile() {
        ArrayList<String> output = new ArrayList<>();
        output.add(this.person.getFullName());
        for (Phone phone : this.phones) {
            output.add(phone.getPhoneNumber());

        }
        return output;

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
}
