package contactapp;

import java.util.Objects;

public class Contact {
    String name;
    String phoneNumber;
    String email;

    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name) && Objects.equals(phoneNumber, contact.phoneNumber);
    }

    public int hashCode() {
        return Objects.hash(name, phoneNumber);
    }

    public String toString() {
        return name + " " + phoneNumber + " " + email;
    }
}
