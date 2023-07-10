package com.bulbul.advancedjava.lambdaex.contactapp;

import java.util.ArrayList;
import java.util.List;

public class ContactService {

    public List<Contact> findContactAgedBetween18And25(List<Contact> contacts){
        List<Contact> contactAgedBetween18And25 = new ArrayList<>();

        for(Contact contact : contacts){
            if(contact.getAge()>=18 && contact.getAge()<=25){
                contactAgedBetween18And25.add(contact);
            }
        }
        return contactAgedBetween18And25;
    }


    public List<Contact> findContacts(List<Contact> contacts, FilterCriteria filterCriteria){
        List<Contact> matchedContacts = new ArrayList<>();

        for(Contact contact : contacts){
            if(filterCriteria.match(contact)){
                matchedContacts.add(contact);
            }
        }

        return matchedContacts;
    }
}
