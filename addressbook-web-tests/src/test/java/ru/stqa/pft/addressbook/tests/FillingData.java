package ru.stqa.pft.addressbook.tests;

public class FillingData {
    private final String name;
    private final String lastName;
    private final String mail;

    public FillingData(String name, String lastName, String mail) {
        this.name = name;
        this.lastName = lastName;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMail() {
        return mail;
    }
}
