package biblioteca;

public class DVD extends ItemBiblioteca{
    private int duracao;

    public DVD(String titulo, int ano, int duracao) {
        super(titulo, ano);
        this.duracao = duracao;
    }

    @Override
    public String mostrarDescricao() {
        return "DVD: " + titulo + ", " + ano + ", Duração: " + duracao + " min";
    }

}
