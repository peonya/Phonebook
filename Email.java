package Phonebook;

public class Email {

    private String emailAddress;

    public Email(String emailAddress) {

        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {

        return getEmailAddress();
    }

}
