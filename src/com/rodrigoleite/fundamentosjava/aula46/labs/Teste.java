package com.rodrigoleite.fundamentosjava.aula46.labs;

public class Teste {

    public static void main(String[] args){

        FiguraGeometrica[] figuras = new FiguraGeometrica[7];

        Quadrado quadrado = new Quadrado();
        quadrado.setNome("Quadrado");
        quadrado.setCor("Azul");
        quadrado.setLado(4);
        figuras[0] = quadrado;

        Triangulo triangulo = new Triangulo();
        triangulo.setNome("Triângulo");
        triangulo.setCor("Azul");
        triangulo.setBase(6);
        triangulo.setAltura(4);
        figuras[1] = triangulo;

        Circulo circulo = new Circulo();
        circulo.setNome("Círculo");
        circulo.setCor("Azul");
        circulo.setRaio(4);
        figuras[2] = circulo;

        Cubo cubo = new Cubo();
        cubo.setNome("Cubo");
        cubo.setCor("Vermelho");
        cubo.setLado(4);
        figuras[3] = cubo;

        Cilindro cilindro = new Cilindro();
        cilindro.setNome("Cilíndro");
        cilindro.setCor("Vermelho");
        cilindro.setAltura(6);
        cilindro.setRaio(4);
        figuras[4] = cilindro;

        Piramide piramideQuadrada = new Piramide();
        piramideQuadrada.setNome("Pirâmide Quadrada");
        piramideQuadrada.setCor("Vermelho");
        piramideQuadrada.setAltura(4);
        piramideQuadrada.setApotema(2);
        piramideQuadrada.setArestaBase(4);
        piramideQuadrada.setAreaBase(quadrado);
        piramideQuadrada.setAltura(6);
        figuras[5] = piramideQuadrada;

        Piramide piramideTriangular = new Piramide();
        piramideTriangular.setNome("Pirâmide Triângular");
        piramideTriangular.setCor("Vermelho");
        piramideTriangular.setAltura(4);
        piramideTriangular.setApotema(2);
        piramideTriangular.setArestaBase(4);
        piramideTriangular.setAreaBase(triangulo);
        piramideTriangular.setAltura(6);
        figuras[6] = piramideTriangular;

        System.out.println("FIGURAS GEOMÉTRICAS");
        System.out.println("-----------------------------");
        for (FiguraGeometrica figura : figuras) {
            if (figura != null){
                System.out.println("Figura: " + figura.getNome());
                System.out.println("Cor: " + figura.getCor());
                if (figura instanceof Figura2D){
                    Figura2D f2d = (Figura2D) figura;
                    System.out.println("Dimensões: " + 2);
                    System.out.println("Área: " +  f2d.calcularArea());
                }
                if (figura instanceof Figura3D){
                    Figura3D f3d = (Figura3D) figura;
                    System.out.println("Dimensões: " + 3);
                    System.out.println("Área: " +  f3d.calcularArea());
                    System.out.println("Volume: " + f3d.calcularVolume());
                }    
                System.out.println("-----------------------------");
            }
        }
    }
}
