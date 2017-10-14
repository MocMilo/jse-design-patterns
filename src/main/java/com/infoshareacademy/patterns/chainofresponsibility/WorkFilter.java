package com.infoshareacademy.patterns.chainofresponsibility;

/**
 * Created by milo on 11.07.17.
 */
public class WorkFilter extends Filter implements IFilterable {

    @Override
    public void processMail(Mail Mail){
        filterWork(Mail);
    }
    private void filterWork(Mail Mail) {
        System.out.println("WORK filtering algorithm");
    }
}
