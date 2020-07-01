package ru.bubenova.inClassTask;

public class ContactMain {
    public static void main(String[] args) {
        Contact contact = new Contact("Ivanov", "Ivan", "89513761696");
        //contact.print();

        System.out.println(contact.getSurname());
    }
}
