package models;

import java.util.ArrayList;

public class ContactManager {
    private ArrayList<Contact> contacts;

    public ContactManager() {
        this.contacts = new ArrayList<Contact>();
    }

    public Contact getContact(int index) {
        return new Contact(this.contacts.get(index));
    }

    public void setContact(Contact contact, int index) {
        this.contacts.set(index, new Contact(contact));
    }

    public void addContact(Contact contact) {
        this.contacts.add(new Contact(contact));
    }

    public void removeContact(String contactName) {
        if (this.contacts.isEmpty()) {
            throw new IllegalStateException("The contact field is empty");
        }
        for (int i = 0; i < this.contacts.size(); i++) {
            if (this.contacts.get(i).getName().equals(contactName)) {
                this.contacts.remove(i);
                break;
            }
        }
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.contacts.size(); i++) {
            temp += this.contacts.get(i).toString();
            temp += "\n";
        }
        return temp;
    }
}
