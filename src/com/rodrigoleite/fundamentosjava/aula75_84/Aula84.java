package com.rodrigoleite.fundamentosjava.aula75_84;

import java.util.StringTokenizer;

public class Aula84 {

    public static void main(String[] args) {
        
        /*Classe String Tokenizer: É uma classe usada para leituras de arquivos para extrair strings, tem um funcionamento bem semelhante ao método split() da classe String, mas como é uma classe terá alguns métodos extras bem úteis para leitura de arquivos. */

        String doArquivo = "1;João;30";

        StringTokenizer st = new StringTokenizer(doArquivo, ";");

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
