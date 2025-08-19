package biblioteca;

public abstract class ItemBiblioteca {
    protected String titulo;
    protected int ano;

    public abstract String mostrarDescricao();

    public ItemBiblioteca(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }

}
