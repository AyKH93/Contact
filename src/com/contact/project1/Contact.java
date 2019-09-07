package com.contact.project1;

public class Contact {

    String name;
    String surname;
    String number;

    public Contact(String name, String surname, String number) {
        this.name = name;
        this.surname = surname;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
