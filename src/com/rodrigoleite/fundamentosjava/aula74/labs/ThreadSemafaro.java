package com.rodrigoleite.fundamentosjava.aula74.labs;


public class ThreadSemafaro  implements Runnable{

    private CorSemafaro cor;
    private boolean parar;
    private boolean corMudou;

    public ThreadSemafaro(){
        this.cor = CorSemafaro.VERMELHO;
        this.parar = false;
        this.corMudou = false;
        new Thread(this).start();
    }

    @Override
    public void run() {
        
        while(!parar){
            try{
                Thread.sleep(this.cor.getTempoEspera());
                mudarCor();
            } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }
    }

    private synchronized void mudarCor(){
        if (this.cor == CorSemafaro.VERMELHO){
            this.cor = CorSemafaro.VERDE;
        } else if (this.cor == CorSemafaro.VERDE){
            this.cor = CorSemafaro.AMARELO;
        
        } else if (this.cor == CorSemafaro.AMARELO){
            this.cor = CorSemafaro.VERMELHO;
        }
        this.corMudou = true;
        notify();
    }

    public synchronized void esperar(){
        while(!corMudou){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        corMudou = false;
    }

    public CorSemafaro getCor(){
        return this.cor;
    }

    public void desligarSemafaro(){
        this.parar = true;
    }
    
}
