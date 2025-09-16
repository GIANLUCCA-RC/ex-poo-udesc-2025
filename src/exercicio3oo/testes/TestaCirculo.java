package exercicio3oo.testes;

import exercicio3oo.classes.Circulo;

public class TestaCirculo {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.setRaio(8.0);

        System.out.print("Circulo");
        System.out.printf("raio: " + circulo.getRaio());
    }
}
