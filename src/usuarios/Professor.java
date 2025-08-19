package usuarios;

public class Professor extends Usuario {
    public Professor(String nome) {
        super(nome);
    }

    @Override
    public int podeEmprestar() {
        return 5;
    }
}