package edu.escuelaing.arep.threads;

public class HelloWorldRunnable2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello from run: " + Thread.currentThread());
        try {
            Thread.sleep(4000); //provoca que el intérprete ponga al hilo en curso a dormir durante el número de milisegundos que se indiquen en el parámetro de invocación.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        Thread t = new Thread(new HelloWorldRunnable());
        t.start();
        try {
            t.join(); //se utiliza para mantener la ejecución del hilo que se está ejecutando actualmente hasta que el hilo especificado esté muerto
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello from main: " + (Thread.currentThread()));
    }
}
