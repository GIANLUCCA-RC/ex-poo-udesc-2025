package exercicio5oo.classes;

public class Carro {
    private String modelo;
    private String marca;
    private int ano;
    private double velocidade;

    public Carro(){

    }
    public Carro(String modelo, String marca, int ano, double velocidade){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.velocidade = velocidade;
    }

    public void acelerar() {
        this.velocidade += 10;
    }

    public void frear() {
        this.velocidade -= 10;
    }

    public String imprimirVelocidadeAtual() {
        return "Velocidade Atual " + this.velocidade + " Km/h";
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public int getAno() {
        return this.ano;
    }

    public double getVelocidade() {
        return this.velocidade;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public String toString() {
        return toString();
    }
}