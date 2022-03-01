package edu.escuelaing.arep.threads;

public class HelloWorldThreads extends Thread{

    @Override
    public void run(){
        System.out.println("Hello from run: " + this.toString());
    }

    public static void main(String[] args){
        (new HelloWorldThreads()).start();
        System.out.println("Hello from main: " + (Thread.currentThread().toString()));
    }
}
