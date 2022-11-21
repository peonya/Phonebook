package Phonebook;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Export {

    public void save(ArrayList<Record> records) throws IOException {

        FileWriter csvWriter = new FileWriter("newPhonebook.csv");
        csvWriter.append("Full name");
        csvWriter.append("       | ");
        csvWriter.append("Telefon number");
        csvWriter.append("        | ");
        csvWriter.append("Email address");
        csvWriter.append("        | ");
        csvWriter.append("\n");

        for (Record data : records) {
            csvWriter.append(data.getPerson() + "," + data.getPhones() + "," + data.getEmail() + "\n");

            csvWriter.append("\n");
        }

        csvWriter.close();

    }
}
