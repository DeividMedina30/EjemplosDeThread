package edu.escuelaing.arep.threads;

public class HelloWorldRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello from run: " + Thread.currentThread());
    }

    public static void main(String[] args){
        Thread t = new Thread(new HelloWorldRunnable());
        t.start();
        System.out.println("Hello from main: " + (Thread.currentThread()));
    }
}
