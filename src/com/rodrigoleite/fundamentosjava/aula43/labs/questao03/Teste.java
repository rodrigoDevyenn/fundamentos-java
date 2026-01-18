package com.rodrigoleite.fundamentosjava.aula43.labs.questao03;

public class Teste {

    public static void main(String[] args){

        Animal animal1 = new Animal();
        animal1.setNome("Camelo");
        animal1.setComprimento(150);
        animal1.setCor("Amarelo");
        animal1.setAmbiente("Terra");
        animal1.setVelocidade(2.0);

        Peixe animal2 = new Peixe();
        animal2.setNome("Tubarão");
        animal2.setComprimento(300);
        animal2.setVelocidade(1.5);
    
        Mamifero animal3 = new Mamifero();
        animal3.setNome("Urso-do-canadá");
        animal3.setComprimento(180);
        animal3.setCor("Vermelho");
        animal3.setVelocidade(0.5);

        Animal[] animais = new Animal[3];
        animais[0] = animal1;
        animais[1] = animal2;
        animais[2] = animal3;


        System.out.println("Zoo:");
        System.out.println("-----------------------------");
        for(Animal animal : animais){
            System.out.println(animal);
            System.out.println("-----------------------------");
        }






    }
}
