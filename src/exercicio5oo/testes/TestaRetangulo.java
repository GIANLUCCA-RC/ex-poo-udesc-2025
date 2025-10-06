package exercicio5oo.testes;

import exercicio5oo.classes.Retangulo;

public class TestaRetangulo {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.setLargura(8.0);
        retangulo.setAltura(8.0);

        System.out.println("Retangulo");
        System.out.println("Largura: " + retangulo.getLargura());
        System.out.println("Altura: " + retangulo.getAltura());
        System.out.println("Área: " + retangulo.calcularArea());
    }
}
