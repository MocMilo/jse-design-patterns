package com.infoshareacademy.patterns.chainofresponsibility;

public class MailBox {


    public void receiveMail(Mail mail) {
        filterSpam(mail);
        filterNews(mail);
        filterWork(mail);
        filterGitHub(mail);
    }

    private void filterSpam(Mail mail) {
        System.out.println("Filtering spam");
    }

    private void filterNews(Mail mail) {
        System.out.println("Filtering news");
    }

    private void filterWork(Mail mail) {
        System.out.println("Filtering work");
    }

    private void filterGitHub(Mail mail) {
        System.out.println("Filtering github");
    }
}
