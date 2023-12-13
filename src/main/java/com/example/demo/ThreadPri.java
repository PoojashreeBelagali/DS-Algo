package com.example.demo;

public class ThreadPri implements Runnable{


    @Override
    public void run() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        ThreadPri thread = new ThreadPri();
        Thread t = new Thread(thread);
        t.start();
    }
}
