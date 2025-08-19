package usuarios;

import biblioteca.ItemBiblioteca;

import java.util.List;

public class Aluno extends Usuario{

    public Aluno(String nome) {
        super(nome);
    }

    @Override
    public int podeEmprestar() {
        return 3;
    }
}
