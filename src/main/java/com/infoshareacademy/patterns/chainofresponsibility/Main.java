package com.infoshareacademy.patterns.chainofresponsibility;

public class Main {

    public static void main(String[] args) {

        Mail mail = new Mail("from@mail.com", "to@mail.com", "content");
        MailBox mailBox = new MailBox();

        // creating filters
        GitFilter gitFilter = new GitFilter();
        NewsFilter newsFilter = new NewsFilter();
        SpamFilter spamFilter = new SpamFilter();
        WorkFilter workFilter = new WorkFilter();

        // setting chain
        gitFilter.setSuccessor(newsFilter);
        newsFilter.setSuccessor(spamFilter);
        spamFilter.setSuccessor(workFilter);

        // set first filter
        mailBox.setMailfilter(gitFilter);

        // execute chain
        mailBox.receiveMail(mail);
    }
}
