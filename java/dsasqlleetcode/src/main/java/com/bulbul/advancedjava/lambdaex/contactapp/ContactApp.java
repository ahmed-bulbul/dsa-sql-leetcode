package com.bulbul.advancedjava.lambdaex.contactapp;

import java.util.List;

public class ContactApp {

    public static void main(String[] args) {

        List<Contact> contactList =
            List.of(
                    new Contact("Bulbul Ahmed","bulbulamed.gmail.com",50, Contact.Gender.MALE),
                    new Contact("Siam Ahmed","siam.gmail.com",60, Contact.Gender.MALE),
                    new Contact("Safiq Ahmed","shafiq.gmail.com",19, Contact.Gender.MALE),
                    new Contact("Sadia Ahmed","sadia.gmail.com",23, Contact.Gender.FEMALE)
                    );

        ContactService contactService = new ContactService();

        List<Contact> contactAged18To25 =
                contactService.findContacts(contactList, new FilterCriteria() {
                    @Override
                    public boolean match(Contact contact) {
                        return 18 <= contact.getAge() &&  contact.getAge() <= 25;
                    }
                });

        contactAged18To25.forEach(System.out::println);


        List<Contact> contactAged18To25Female
                = contactService.findContacts(contactList, new FilterCriteria() {
            @Override
            public boolean match(Contact contact) {
                return 18 <= contact.getAge()
                        && contact.getAge() <=25
                        && contact.getGender() == Contact.Gender.FEMALE;
            }
        });

        contactAged18To25Female.forEach(System.out::println);

        // This code using lambdaExpression
        List<Contact> contactAged18To25FemaleUsingLambda
                = contactService.findContacts(contactList, (Contact contact)->{
                    return 18 <= contact.getAge()
                            && contact.getAge() <=25
                            && contact.getGender() == Contact.Gender.FEMALE;
        });

        contactAged18To25FemaleUsingLambda.forEach(System.out::println);

    }
}
