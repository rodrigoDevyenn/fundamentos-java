package com.rodrigoleite.fundamentosjava.aula69;

public class Teste3 {

    public static void main(String[] args) {

        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("Thread #1", 500);
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("Thread #2", 800);
        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("Thread #3", 1200);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.start();
        t2.start();
        t3.start();

        // Método join faz com que tudo que estiver após a chamada dele, seja executado somente
        // quando a thread dele ser finalizada.
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Programa Finalizado.");
    }
}
