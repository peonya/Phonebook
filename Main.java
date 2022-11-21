package Phonebook;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String args[]) {
        ArrayList<Person> arrayOfPerson = new ArrayList<>();

        Person person1 = new Person("Ivanov Ivan Ivanovich");
        Person person2 = new Person("Petrov Petr Petrovich");
        Person person3 = new Person("Sidorov Egor Egorovich");

        arrayOfPerson.add(person1);
        arrayOfPerson.add(person2);
        arrayOfPerson.add(person3);

        ArrayList<Phone> phones = new ArrayList<>();

        Phone phone1 = new Phone("+7(987)123-22-33");
        Phone phone2 = new Phone("+7(984)234-44-66");
        Phone phone3 = new Phone("+7(977)954-00-88");

        phones.add(phone1);
        phones.add(phone2);
        phones.add(phone3);

        ArrayList<Email> emails = new ArrayList<>();

        Email email1 = new Email("ivanov@mail.ru");
        Email email2 = new Email("petrov@mail.ru");
        Email email3 = new Email("sidorov@mail.ru");

        emails.add(email1);
        emails.add(email2);
        emails.add(email3);

        System.out.println(arrayOfPerson);
        System.out.println(phones);

        ArrayList<Record> records = new ArrayList<>();
        Record record1 = new Record(person1, phone1, email1);
        Record record2 = new Record(person2, phone2, email2);
        Record record3 = new Record(person3, phone3, email3);

        records.add(record1);
        records.add(record2);
        records.add(record3);

        System.out.println(records);

        try {
            new Export().save(records);
        } catch (IOException e) {

            e.printStackTrace();
        }

        new Import().read();
    }

}
