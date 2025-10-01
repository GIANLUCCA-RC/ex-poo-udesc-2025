package exercicio4oo.testes;

import exercicio4oo.classes.Carro;

public class TestaCarro {
    public static void main(String[] args) {
        Carro car = new Carro();
        car.setModelo("Aventador");
        car.setMarca("Lamborghini");
        car.setAno(2025);
        car.setVelocidade(350.00);

        System.out.println("Carro: ");
        System.out.println("Modelo: " + car.getModelo());
        System.out.println("Marca: " + car.getMarca());
        System.out.println("Ano: " + car.getAno());
        System.out.println("Velocidade: " + car.getVelocidade());
        System.out.println(car.imprimirVelocidadeAtual());
    }
}
