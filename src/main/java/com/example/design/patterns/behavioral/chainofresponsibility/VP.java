package com.example.design.patterns.behavioral.chainofresponsibility;

public class VP extends Handler {
    @Override
    void handle(Request request) {
        if (request.getRequestType() == RequestType.PURCHASE)
            if (request.getAmount() < 1500)
                System.out.println("Request of " + request.getRequestType() + ": " + request.getAmount() + "is Approved by VP");
            else
                successor.handle(request);
    }
}
