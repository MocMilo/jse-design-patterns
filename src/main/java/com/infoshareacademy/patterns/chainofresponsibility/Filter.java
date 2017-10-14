package com.infoshareacademy.patterns.chainofresponsibility;

/**
 * Created by milo on 11.07.17.
 */
public abstract class Filter implements IFilterable {

    private Filter succesorFilter;

    public void setSuccessor(Filter successorFilter){  // stting next filter in chain
        this.succesorFilter = successorFilter;
    }

    public void processFilteringMails(Mail Mail){

        processMail(Mail);                          // using own filtering method

        if(succesorFilter!=null)                    // prevents nullPointerEx in the last filter in chain
        succesorFilter.processFilteringMails(Mail); // delegating filter processing to successor
    }

    @Override
    public void processMail(Mail Mail) {
     System.out.print("base filtering algorithm");
    }
}
