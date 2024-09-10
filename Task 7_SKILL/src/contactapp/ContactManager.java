package contactapp;

import java.util.*;

public class ContactManager {
    Set<Contact> contactSet = new HashSet<>();
    Map<String, Contact> contactMap = new HashMap<>();

    public void addContact(Contact contact) {
        if (contactSet.add(contact)) {
            contactMap.put(contact.name, contact);
        }
    }

    public Contact getContactByName(String name) {
        return contactMap.get(name);
    }

    public void displayAllContacts() {
        contactSet.forEach(System.out::println);
    }
}
