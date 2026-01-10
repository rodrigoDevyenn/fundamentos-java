package com.rodrigoleite.fundamentosjava.aula19;

public class Arrays {

    public static void main(String[] args) {
        
        //Digamos que você queira armazenar as temperatura médias de cada dia do ano.
        //Armazenar isso em variáveis simples daria muito trabalho.
        //  double tempDia001 = 32.2;
        //  double tempDia002 = 24;
        //  double tempDia003 = 23.7;
        //  double tempDia004 = 33.7;
        //  double tempDia005 = 22.4;

        //Usando Arrays 
        double[] temperaturas = new double[365];

        temperaturas[0] = 32.2;
        temperaturas[1] = 24;
        temperaturas[2] = 23.7;
        temperaturas[3] = 33.7;
        temperaturas[4] = 22.4;

        System.out.println("A temperatura do dia 3 é " + temperaturas[2]);

        System.out.println("O tamanho do Array é " + temperaturas.length);

        System.out.println("Os valores do arrays São: ");

        for(int i = 0; i < temperaturas.length;i++){
            System.out.println("A temperatura do dia " + (i + 1) + " é " + temperaturas[i] + "°C");
        }

        // for melhorado para iteração com arrays
        for (double temp : temperaturas ){
            System.out.println(temp);
        }

    }
}
