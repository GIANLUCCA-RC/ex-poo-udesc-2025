package exercicio5oo.testes;

import exercicio5oo.classes.ContaBancaria;

public class TestaContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setNumeroConta("12345");
        conta.setTitular("Gian");
        conta.setSaldo(1000);

        System.out.println("Conta Bancária");
        System.out.println("Número da Conta: " + conta.getNumeroConta());
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo: " + conta.getSaldo() + " reais");
    }
}
