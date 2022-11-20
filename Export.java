package Phonebook;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class Export {

    private Phonebook phonebook;

    public Export(Phonebook phonebook) {
        this.phonebook = phonebook;

    }

    public void save() {
        ArrayList<String> output = new ArrayList<>();

        for (Record record : phonebook.getPhoneBook()) {
            output.addAll(record.recordToFile());

        }

        try {
            Files.write(Paths.get("Phonebook\\export.txt"), output, StandardOpenOption.CREATE);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
