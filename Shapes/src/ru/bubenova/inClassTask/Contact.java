package ru.bubenova.inClassTask;

public class Contact {
    private String surname;
    private String name;
    private String phone;

    public Contact(String surname, String name, String phone) {
        this.surname = surname;
        this.name = name;
        this.phone = phone;
    }

    public void print() {
        System.out.printf("%s %s: %s", surname, name, phone);
    }

    public String getSurname() {
        return surname;
    }
    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }

    public void setSurname() {
        this.surname = surname;
    }
    public void setName() {
        this.name = name;
    }
    public void setPhone() {
        this.phone = phone;
    }
}
