package exercicio5oo.classes;

public class Circulo {
    private double raio;

    public Circulo(){

    }
    public Circulo(double raio){
        this.raio = raio;
    }

    public double calcularDiametro() {
        return 2 * raio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public double calcularArea() {
        return Math.PI * (raio * raio);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public String toString() {
        return toString();
    }
}
