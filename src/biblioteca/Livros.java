package biblioteca;

public class Livros extends ItemBiblioteca{

    private String autor;

    public Livros(String titulo, int ano, String autor) {
        super(titulo, ano);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String mostrarDescricao() {
        return "Livro: " + titulo + ", " + ano + ", Autor: " + autor;
    }
}

