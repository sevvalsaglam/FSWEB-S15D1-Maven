package org.example;

import org.example.mobile.Contact;
import org.example.mobile.MobilePhone;
import org.example.models.Grocery;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        MobilePhone mobilePhone=new MobilePhone("05347304383", new ArrayList<>());
        mobilePhone.addNewContact(new Contact("Şevval", "05072001348"));
        mobilePhone.addNewContact(new Contact("Selen", "05072001356"));
        mobilePhone.addNewContact(new Contact("Nur", "05072001390"));
        mobilePhone.addNewContact(new Contact("İboş", "05072001365"));
        mobilePhone.printContact();
    }
}
