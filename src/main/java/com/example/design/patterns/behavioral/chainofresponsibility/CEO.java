package com.example.design.patterns.behavioral.chainofresponsibility;

public class CEO extends Handler {

    @Override
    void handle(Request request) {
        System.out.println("Request of " + request.getRequestType() + ": " + request.getAmount() + "is Approved by CEO");
    }
}
