package com.infoshareacademy.patterns.chainofresponsibility;

/**
 * Created by milo on 11.07.17.
 */
public class GitFilter extends Filter implements IFilterable {

    @Override
    public void processMail(Mail Mail){
        filterGitHub(Mail);
    }

    private void filterGitHub(Mail Mail) {
        System.out.println("GITHUB filtering algorithm");
    }
}
