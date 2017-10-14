package com.infoshareacademy.patterns.chainofresponsibility;

/**
 * Created by milo on 11.07.17.
 */
public class NewsFilter extends Filter implements IFilterable {

    @Override
    public void processMail(Mail Mail){
        filterNews(Mail);
    }

    private void filterNews(Mail Mail) {
        System.out.println("NEWS filtering algorithm");
    }

}
