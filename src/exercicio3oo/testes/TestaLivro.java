package exercicio3oo.testes;

import exercicio3oo.classes.Livro;

public class TestaLivro {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setTitulo("Java o mundo quase impossível");
        livro.setAutor("Herculano de Biasi");
        livro.setGenero( "Ficcão Cientifica");
        livro.setEmprestado(false);

        System.out.print("Livro");
        System.out.printf("Titulo: " + livro.getTitulo());
        System.out.printf("Autor: " + livro.getAutor());
        System.out.printf("Genero: " + livro.getGenero());
        System.out.print("Emprestado: " + livro.getEmprestado());
    }
}
