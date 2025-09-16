package exercicio3oo.testes;

import exercicio3oo.classes.Carro;

public class TestaCarro {
    public static void main(String[] args) {
        Carro car = new Carro();
        car.setModelo("Aventador");
        car.setMarca("Lamborghini");
        car.setAno(2025);
        car.setVelocidade(350.00);

        System.out.print("Carro: ");
        System.out.printf("Modelo" + car.getModelo());
        System.out.printf("Marca" + car.getMarca());
        System.out.printf("Ano" + car.getAno());
        System.out.printf("Velocidade" + car.getVelocidade());
    }
}
