package com.infoshareacademy.patterns.chainofresponsibility;

/**
 * Created by milo on 11.07.17.
 */
public class SpamFilter extends Filter implements IFilterable {

    @Override
    public void processMail(Mail Mail){
        filterSpam(Mail);
    }

    private void filterSpam(Mail Mail) {
        System.out.println("SPAM filtering algorithm");
    }




}
