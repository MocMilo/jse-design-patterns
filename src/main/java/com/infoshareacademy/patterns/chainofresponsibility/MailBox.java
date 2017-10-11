package com.infoshareacademy.patterns.chainofresponsibility;

public class MailBox {

    private Filter mailfilter;

    public void setMailfilter(Filter mailfilter) {
        this.mailfilter = mailfilter;       // setting first filter in chain
    }

    public void receiveMail(Mail mail) {
        mailfilter.processFilteringMails(mail);
    }
}
