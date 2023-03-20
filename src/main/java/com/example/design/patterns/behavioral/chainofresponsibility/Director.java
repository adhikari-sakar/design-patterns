package com.example.design.patterns.behavioral.chainofresponsibility;

import static com.example.design.patterns.behavioral.chainofresponsibility.RequestType.CONFERENCE;

public class Director extends Handler {

    //chaining the responsibility if cannot handle
    @Override
    void handle(Request request) {
        if (request.getRequestType() == CONFERENCE)
            System.out.println("Request of " + request.getRequestType() + ": " + request.getAmount() + "is Approved by Director");
        else
            successor.handle(request);
    }
}
