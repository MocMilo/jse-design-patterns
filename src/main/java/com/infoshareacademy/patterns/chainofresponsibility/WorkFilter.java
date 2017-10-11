package com.infoshareacademy.patterns.chainofresponsibility;

/**
 * Created by milo on 11.07.17.
 */
public class WorkFilter extends Filter implements IFilterable {

    @Override
    public void processMail(Mail mail){
        filterWork(mail);
    }
    private void filterWork(Mail mail) {
        System.out.println("Filtering work");
    }
}
