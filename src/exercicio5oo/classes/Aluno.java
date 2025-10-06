package exercicio5oo.classes;

public class Aluno {
    //atributos privaods
    private String matricula;
    private String nome;
    private int idade;
    private int nota1, nota2, nota3, nota4;

    public  Aluno() {

    }

    public Aluno(String matricula, String nome, int idade,  int nota1, int nota2, int nota3, int nota4) {
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    public void imprimirSituacao() {
        double media = calcularMedia();
        if (media >= 7) {
            System.out.println(nome + " Aprovado");
        } else {
            System.out.println(nome + " Reprovado");
        }
    }

    public double calcularMedia() {
        double media = (nota1 + nota2 + nota3 + nota4) / 4.0;
        return media;
    }

    //métodos publicos
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public void setNota4(int nota4) {
        this.nota4 = nota4;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public int getNota1() {
        return this.nota1;
    }

    public int getNota2() {
        return this.nota2;
    }

    public int getNota3() {
        return this.nota3;
    }

    public int getNota4() {
        return this.nota4;
    }

    public String toString() {
        return toString();
    }
}
