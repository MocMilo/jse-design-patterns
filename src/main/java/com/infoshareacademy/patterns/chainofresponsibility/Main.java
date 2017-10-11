package com.infoshareacademy.patterns.chainofresponsibility;

public class Main {

    public static void main(String[] args) {

        Mail mail = new Mail("from@mail.com", "to@mail.com", "content");
        MailBox mailBox = new MailBox();

        mailBox.receiveMail(mail);
    }
}
