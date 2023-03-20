package com.example.design.patterns.behavioral.chainofresponsibility;

public class Demo {
    public static void main(String[] args) {
        CEO ceo = new CEO();
        VP vp = new VP();
        Director director = new Director();

        director.setSuccessor(vp);
        vp.setSuccessor(ceo);

        Request request = new Request(RequestType.CONFERENCE, 500);
        director.handle(request);

        request = new Request(RequestType.PURCHASE, 1000);
        director.handle(request);

        request = new Request(RequestType.PURCHASE, 2000);
        director.handle(request);
    }
}
