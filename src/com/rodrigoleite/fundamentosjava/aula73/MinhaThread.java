package com.rodrigoleite.fundamentosjava.aula73;

public class MinhaThread implements Runnable {

    private String nome;
    private boolean suspensa;
    private boolean terminada;

    public MinhaThread(String nome) {
        this.nome = nome;
        this.suspensa = false;
        new Thread(this, nome).start();
    }

    @Override
    public void run() {
        System.out.println("Thread " + this.nome + " Iniciada");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(this.nome + " Contador: " + i);
                Thread.sleep(200);
                synchronized(this){
                    while(suspensa){
                        System.out.println("Thread " + this.nome + " Suspensa");
                        wait();
                        System.out.println("Thread " + this.nome + " Resumida");
                    }
                    if (terminada){
                        break;
                    }   
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread " + this.nome + " Finalizada");
    }

    public void suspend(){
        this.suspensa = true;
    }

    public synchronized void resume(){
        this.suspensa = false;
        notify();
    }

    public synchronized void stop(){
        this.terminada = true;
        notify();
    }
}
