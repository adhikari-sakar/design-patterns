package com.example.design.patterns.behavioral.command;

public class EveryDayExample {
    public static void main(String[] args) {
        Task task1 = new Task(10, 20);
        Task task2 = new Task(30, 40);

        // command encapsulation for Task Object to execute its operation
        Thread thread1 = new Thread(task1);
        thread1.start(); //invoker

        Thread thread2 = new Thread(task2);
        thread2.start();
    }

    static class Task implements Runnable {
        int x;
        int y;

        public Task(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public void run() {
            System.out.println(x * y); //receiver
        }
    }
}


