package exercicio3oo.testes;

import exercicio3oo.classes.Retangulo;

public class TestaRetangulo {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.setLargura(8.0);
        retangulo.setAltura(8.0);

        System.out.print("Retangulo");
        System.out.printf("Largura: " + retangulo.getLargura());
        System.out.printf("Altura: " + retangulo.getAltura());
    }
}
