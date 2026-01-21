package com.rodrigoleite.fundamentosjava.aula60;

public class EscopoVariaveis {

    private int valor;

    public int getValor(){
        return valor;
    }

    public void setValor(int valor){
        this.valor = valor;
    }

    public int calculaValor(int valor){
        valor  = valor + 10;
        //this.valor = valor;
        return valor;
    }

    public int teste(){
        int valor = 5;
        if(true){
            valor--;
        }
        //this.valor = valor;
        return valor;
    }

    public void outroTeste(){
        
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }

        // i++;     // - Isso gera um erro de compilação, pois
                    // a variável i existe somente dentro do
                    // bloco for.
        
        int j;
        for (j = 0; j < 10; j++){
            System.out.println(j);
        }

        j++;        // - Isso é possível, já que a variável
                    // foi declarada fora do bloco for, e 
                    // dentro do bloco do método. / j++; == 11
                
    }

    public void maisUmTeste(){
        boolean flag = true;

        if (flag){
            int umaVariavel = 10;
            umaVariavel++;
            System.out.println(umaVariavel);       // - Isso funciona, pois o comando está
                                                   // dentro do escopo da variável;
        }

        //System.out.println(umaVariavel);         // - Isso gera um erro de compilação, pois
                                                   // essa chamada está fora do bloco no qual
                                                   // a variável foi declarada(bloco if);
    }

    public void maisUmOutroTeste(int num){ // variavel num, pode ser usada em todo o método.

        int total = 0;                         // variável total pode ser usada em todo o método.

        try {
            int outroNum = 0;
            total = num / outroNum;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            total++;
            //outroNum++;                       // Erro de compilação, a variável outroNum
                                                // só existe dentro do bloco try.
            //e.printStackTrace();              // Erro de compilação, a variável e
                                                // só existe dentro do bloco catch.
        }
        num++;
        //outroNum++;                           // Erro de compilação, a variável outroNum
                                                // só existe dentro do bloco try.
        //e.printStackTrace();                  // Erro de compilação, a variável e
                                                // só existe dentro do bloco catch.
          
    }
}