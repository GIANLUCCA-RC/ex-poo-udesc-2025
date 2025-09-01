package exercicio1oo.classes;

public class TestaAluno {
    public static void main(String[] args) {
        Aluno Gianlucca = new Aluno();
        Gianlucca.matricula = "CESMO-42";
        Gianlucca.nome = "Gianlucca Ravese Canello";
        Gianlucca.idade = 21;
        Gianlucca.nota1 = 8;
        Gianlucca.nota2 = 8;
        Gianlucca.nota3 = 10;
        Gianlucca.nota4 = 9;
        System.out.println("Dados do Aluno:");
        System.out.println("Matrcula" + Gianlucca.matricula);
        System.out.println("Nome" + Gianlucca.nome);
        System.out.println("Idade" + Gianlucca.idade);
        System.out.println("Nota" + Gianlucca.nota1);
        System.out.println("Nota" + Gianlucca.nota2);
        System.out.println("Nota" + Gianlucca.nota3);
        System.out.println("Nota" + Gianlucca.nota4);

    }
}
