package com.infoshareacademy.patterns.chainofresponsibility;

/**
 * Created by milo on 11.07.17.
 */
public class SpamFilter extends Filter implements IFilterable {

    @Override
    public void processMail(Mail mail){
        filterSpam(mail);
    }

    private void filterSpam(Mail mail) {
        System.out.println("Filtering spam");
    }




}
