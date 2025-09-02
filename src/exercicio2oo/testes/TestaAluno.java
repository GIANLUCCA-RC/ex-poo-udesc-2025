package exercicio2oo.testes;

import exercicio2oo.classes.Aluno;

public class TestaAluno {
    public static void main(String[] args) {
        Aluno gianlucca = new Aluno();
        gianlucca.matricula = "CESMO-42";
        gianlucca.nome = "Gianlucca Ravese Canello";
        gianlucca.idade = 21;
        gianlucca.nota1 = 8;
        gianlucca.nota2 = 8;
        gianlucca.nota3 = 10;
        gianlucca.nota4 = 9;
        System.out.println("Dados do Aluno:");
        System.out.println("Matrcula" + gianlucca.matricula);
        System.out.println("Nome" + gianlucca.nome);
        System.out.println("Idade" + gianlucca.idade);
        System.out.println("Nota" + gianlucca.nota1);
        System.out.println("Nota" + gianlucca.nota2);
        System.out.println("Nota" + gianlucca.nota3);
        System.out.println("Nota" + gianlucca.nota4);

    }
}
