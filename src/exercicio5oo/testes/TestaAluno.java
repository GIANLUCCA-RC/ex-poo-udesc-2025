package exercicio5oo.testes;

import exercicio5oo.classes.Aluno;

public class TestaAluno {
    public static void main(String[] args) {
        Aluno gianlucca = new Aluno();
        gianlucca.setMatricula("CESMO-42");
        gianlucca.setNome("Gianlucca Ravese Canello");
        gianlucca.setIdade(21);
        gianlucca.setNota1(8);
        gianlucca.setNota2(8);
        gianlucca.setNota3(8);
        gianlucca.setNota4(8);

        System.out.println("Dados do Aluno:");
        System.out.println("Matricula" + gianlucca.getMatricula());
        System.out.println("Nome" + gianlucca.getNome());
        System.out.println("Idade" + gianlucca.getIdade());
        System.out.println("Nota" + gianlucca.getNota1());
        System.out.println("Nota" + gianlucca.getNota2());
        System.out.println("Nota" + gianlucca.getNota3());
        System.out.println("Nota" + gianlucca.getNota4());
        System.out.println("Média" + gianlucca.calcularMedia());
        gianlucca.imprimirSituacao();
    }
}
