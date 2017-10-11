package com.infoshareacademy.patterns.chainofresponsibility;

/**
 * Created by milo on 11.07.17.
 */
public abstract class Filter implements IFilterable {

    private Filter succesorFilter;

    public void setSuccessor(Filter successorFilter){  // stting next filter in chain
        this.succesorFilter = successorFilter;
    }

    public void processFilteringMails(Mail mail){
        processMail(mail);                          // using own filtering method
        succesorFilter.processFilteringMails(mail); // delegating filter processing to successor
    }

    @Override
    public void processMail(Mail mail) {
     System.out.print("Generic filter");
    }
}
