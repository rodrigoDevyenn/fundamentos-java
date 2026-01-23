package com.rodrigoleite.fundamentosjava.aula75_84;

public class Aula76 {

    public static void main(String[] args) {
        
        String curso = "Curso ";
        String java = "Java";
        String cursoJava = curso + java;
        System.out.println(cursoJava);

        String expressao = "2 + 2 = ";
        String expressaoCompleta = expressao + (2+2); // () para 4
        System.out.println(expressaoCompleta);
        
        String expressaoCompleta2 = expressao + 2 + 2; // 22
        System.out.println(expressaoCompleta2); 

        String um = String.valueOf(1);
        System.out.println(um);

        String texto = "Lorem Ipsum is simply dummy text of the printing and " + 
                    "typesetting industry. Lorem Ipsum has been the industry's " + 
                    "standard dummy text ever since the 1500s, when an unknown " +
                    "printer took a galley of type and scrambled it to make a  " +
                    "type specimen book. It has survived not only five centuries, " +
                    "but also the leap into electronic typesetting, remaining";

        System.out.println(texto);
        System.out.println();
        
        String concatenacao = "Lorem Ipsum is simply dummy text of the printing and ";
        concatenacao += "typesetting industry. Lorem Ipsum has been the industry's ";
        concatenacao += "standard dummy text ever since the 1500s, when an unknown ";
        concatenacao += "printer took a galley of type and scrambled it to make a  ";
        concatenacao += "type specimen book. It has survived not only five centuries, ";
        concatenacao += "but also the leap into electronic typesetting, remaining";

        System.out.println(concatenacao);
        System.out.println();

        String concatenacaoln = "Lorem Ipsum is simply dummy text of the printing and ";
        concatenacaoln += "\ntypesetting industry. Lorem Ipsum has been the industry's ";
        concatenacaoln += "\nstandard dummy text ever since the 1500s, when an unknown ";
        concatenacaoln += "\nprinter took a galley of type and scrambled it to make a  ";
        concatenacaoln += "\ntype specimen book. It has survived not only five centuries, ";
        concatenacaoln += "\nbut also the leap into electronic typesetting, remaining";

        System.out.println(concatenacaoln);
    }
}
