package exercicio4oo.testes;

import exercicio4oo.classes.Livro;

public class TestaLivro {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setTitulo("Java o mundo quase impossível");
        livro.setAutor("Herculano de Biasi");
        livro.setGenero( "Ficcão Cientifica");
        livro.setEmprestado(false);

        System.out.println("Livro");
        System.out.println("Titulo: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Genero: " + livro.getGenero());
        System.out.println("Emprestado: " + livro.getEmprestado());
        System.out.println("Verificar Disponibilidade: " + livro.verificarEmprestado());
    }
}
