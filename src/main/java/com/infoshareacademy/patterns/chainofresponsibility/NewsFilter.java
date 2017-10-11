package com.infoshareacademy.patterns.chainofresponsibility;

/**
 * Created by milo on 11.07.17.
 */
public class NewsFilter extends Filter implements IFilterable {

    @Override
    public void processMail(Mail mail){
        filterNews(mail);
    }

    private void filterNews(Mail mail) {
        System.out.println("Filtering news");
    }

}
