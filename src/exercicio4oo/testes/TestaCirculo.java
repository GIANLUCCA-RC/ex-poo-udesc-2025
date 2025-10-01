package exercicio4oo.testes;

import exercicio4oo.classes.Circulo;

public class TestaCirculo {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.setRaio(8.0);
        // Math.PI
        System.out.print("Circulo");
        System.out.printf("Raio: " + circulo.getRaio());
        System.out.println("Diâmetro" + circulo.calcularDiametro());
        System.out.println("Perímetro" + circulo.calcularPerimetro());
        System.out.println("Área" + circulo.calcularArea());
    }
}
