package exercicio1oo.classes;

public class TestaCarro {
    public static void main(String[] args) {
        Carro car = new Carro();
        car.modelo = "Aventador";
        car.marca = "Lamborghini";
        car.ano = 2025;
        car.velocidade = 350.00;
        System.out.println("Carro: ");
        System.out.println("Modelo" + car.modelo);
        System.out.println("Marca" + car.marca);
        System.out.println("Ano" + car.ano);
        System.out.println("Velocidade" + car.velocidade);
    }
}
