package contactapp;

public class ContactApp {
    public static void main(String[] args) {
        ContactManager manager = new ContactManager();

        Contact c1 = new Contact("Alice", "1234567890", "alice@example.com");
        Contact c2 = new Contact("Bob", "9876543210", "bob@example.com");
        Contact c3 = new Contact("Alice", "1234567890", "alice_new@example.com");

        manager.addContact(c1);
        manager.addContact(c2);
        manager.addContact(c3);

        manager.displayAllContacts();
        System.out.println(manager.getContactByName("Bob"));
    }
}
