package exercicio1oo.classes;

public class TestaContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.numeroConta = "12345";
        conta.titular = "Gianlucca";
        conta.saldo = 25500;
        System.out.println("Conta Bancária");
        System.out.println("Número da Conta" + conta.numeroConta);
        System.out.println("Titular" + conta.titular);
        System.out.println("Saldo" + conta.saldo);
    }
}
