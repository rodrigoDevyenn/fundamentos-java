package com.rodrigoleite.fundamentosjava.aula32;

public class TesteCarro {

    public static void main(String[] args) {
        
        Carro carro = new Carro();

        // forma de se atribuir valores aos atributos private através dos metodos sets
        carro.setMarca("Fiat");
        carro.setModelo("Ducato");
        carro.setNumPassageiros(10);
        carro.setCapCombustivel(100);
        carro.setConCombustivel(0.2);

        // forma de obter os atributos private da classe através dos metodos gets
        System.out.println(carro.getMarca());
        System.out.println(carro.getModelo());
        System.out.println(carro.getNumPassageiros());
        System.out.println(carro.getCapCombustivel());
        System.out.println(carro.getConCombustivel());
    }
}
