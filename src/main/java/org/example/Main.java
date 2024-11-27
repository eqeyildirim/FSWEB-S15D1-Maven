package org.example;

import org.example.mobile.Contact;
import org.example.mobile.MobilePhone;
import org.example.models.Grocery;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//       Grocery grocery=new Grocery();
//       grocery.startGrocery();
        MobilePhone mob=new MobilePhone("32132",new ArrayList<>());
        mob.addNewContact(new Contact("Ali","32132"));
        mob.addNewContact(new Contact("ADSI","321321"));
        mob.addNewContact(new Contact("adsi","321321"));
        mob.addNewContact(new Contact("dedsa","321321"));
        mob.addNewContact(new Contact(null,"321321"));
        mob.printContact();
    }
}
