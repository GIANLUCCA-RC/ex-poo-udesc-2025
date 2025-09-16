package exercicio3oo.testes;

import exercicio3oo.classes.Aluno;

public class TestaAluno {
    public static void main(String[] args) {
        Aluno gianlucca = new Aluno();
        gianlucca.setMatricula("CESMO-42");
        gianlucca.setNome("Gianlucca Ravese Canello");
        gianlucca.setIdade(21);
        gianlucca.setNota1(8);
        gianlucca.setNota2(8);
        gianlucca.setNota3(10);
        gianlucca.setNota4(9);

        System.out.print("Dados do Aluno:");
        System.out.printf("Matricula" + gianlucca.getMatricula());
        System.out.printf("Nome" + gianlucca.getNome());
        System.out.printf("Idade" + gianlucca.getIdade());
        System.out.printf("Nota" + gianlucca.getNota1());
        System.out.printf("Nota" + gianlucca.getNota2());
        System.out.printf("Nota" + gianlucca.getNota3());
        System.out.printf("Nota" + gianlucca.getNota4());
    }
}
