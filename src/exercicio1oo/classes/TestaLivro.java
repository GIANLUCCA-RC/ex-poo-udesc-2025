package exercicio1oo.classes;

public class TestaLivro {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.titulo = "Java o mundo quase impossível";
        livro.autor = "Herculano de Biasi";
        livro.genero = "Ficcão Cientifica";
        livro.emprestado = false;
        System.out.println("Livro");
        System.out.println("Titulo: " + livro.titulo);
        System.out.println("Autor: " + livro.autor);
        System.out.println("Genero: " + livro.genero);
        System.out.println("Emprestado: " + livro.emprestado);

    }

}
