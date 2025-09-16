package exercicio3oo.testes;

import exercicio3oo.classes.ContaBancaria;

public class TestaContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setNumeroConta("12345");
        conta.setTitular("Gian");
        conta.setSaldo(25500);

        System.out.print("Conta Bancária");
        System.out.printf("Número da Conta" + conta.getNumeroConta());
        System.out.printf("Titular" + conta.getTitular());
        System.out.printf("Saldo" + conta.getSaldo());
    }
}
