package com.infoshareacademy.patterns.chainofresponsibility;

public class MailBox {

    private Filter mailFilter;

    public void setMailFilter(Filter mailFilter) {
        this.mailFilter = mailFilter;       // setting first filter in chain
    }

    public void receiveMail(Mail Mail) {
        mailFilter.processFilteringMails(Mail);
    }
}
