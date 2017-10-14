package com.infoshareacademy.patterns.chainofresponsibility;

public class Main {

    public static void main(String[] args) {

        // CHAIN OF RESPONSIBILITY pattern

        // Solves an issue:
        // Application needs to support several 'algorithms' to process the object but
        // in comparison to 'Strategy pattern' - choice of current algorithm is 'not pre-determined',
        // Object is sent to next algorithm in a chain
        // and the decision 'how to process current object' is made inside current algorithm.

        // example: MailBox receives an e-Mail. Current e-Mail should be filtered:
        // 'to store e-Mail in proper folder','to mark as important', 'to block spam...' etc.
        //
        // To support this feature 'several filtering algorithms' have to be involved in the process.
        // Using CH-O-R design pattern every Filter executes it's own algorithm on the e-Mail
        // and then sends this e-Mail to the next filter in a chain.


        Mail email = new Mail("from@xyz.com", "to@zzz.com", "content");
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
        mailBox.setMailFilter(gitFilter);

        // execute chain
        mailBox.receiveMail(email);
    }
}
