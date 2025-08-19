package biblioteca;

public class DVD extends ItemBiblioteca{
    private int duracao;

    public DVD(String titulo, int ano, int duracao) {
        super(titulo, ano);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String mostrarDescricao() {
        return "DVD: " + getTitulo() + ", " + getAno() + ", Duração: " + getDuracao() + " min";
    }

}
