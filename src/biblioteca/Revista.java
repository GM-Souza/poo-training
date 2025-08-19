package biblioteca;

public class Revista extends ItemBiblioteca{
    private String edicao;

    public Revista(String titulo, int ano, String edicao) {
        super(titulo, ano);
        this.edicao = edicao;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }


    @Override
    public String mostrarDescricao() {
        return "Revista: " + titulo + ", " + ano + ", Edição: " + edicao;
    }
}
