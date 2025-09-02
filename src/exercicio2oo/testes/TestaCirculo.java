package exercicio2oo.testes;

import exercicio2oo.classes.Circulo;

public class TestaCirculo {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.raio = 8.0;
        System.out.println("Circulo");
        System.out.println("raio: " + circulo.raio);
    }
}
