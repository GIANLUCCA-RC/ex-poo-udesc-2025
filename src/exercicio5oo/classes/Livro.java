package exercicio5oo.classes;

public class Livro {
    private String titulo;
    private String autor;
    private String genero;
    private boolean emprestado;

    public Livro(){

    }
    public Livro(String titulo, String autor, String genero, boolean emprestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.emprestado = emprestado;
    }

    public void emprestarLivro() {
        this.emprestado = true;
    }

    public void devolverLivro() {
        this.emprestado = false;
    }

    public boolean verificarEmprestado() {
        return !this.emprestado;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public boolean getEmprestado() {
        return emprestado;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public String toString() {
        return toString();
    }
}
