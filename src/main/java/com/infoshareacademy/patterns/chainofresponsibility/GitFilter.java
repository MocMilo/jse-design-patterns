package com.infoshareacademy.patterns.chainofresponsibility;

/**
 * Created by milo on 11.07.17.
 */
public class GitFilter extends Filter implements IFilterable {

    @Override
    public void processMail(Mail mail){
        filterGitHub(mail);
    }

    private void filterGitHub(Mail mail) {
        System.out.println("Filtering github");
    }
}
