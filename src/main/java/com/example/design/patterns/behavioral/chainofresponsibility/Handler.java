package com.example.design.patterns.behavioral.chainofresponsibility;

public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    abstract void handle(Request request);
}
