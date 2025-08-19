package usuarios;

import biblioteca.ItemBiblioteca;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {
    protected String nome;
    protected List<ItemBiblioteca> itensEmprestados;

    public Usuario(String nome) {
        this.nome = nome;
        this.itensEmprestados = new ArrayList<>();
    }

    //Metodo abstrato: podeEmprestar() (verifica limite de itens)

    public abstract int podeEmprestar();

    //Metodo: emprestarItem(item) (verifica se pode e adiciona).

    public void emprestarItem(ItemBiblioteca item) {
        if (itensEmprestados.size() < podeEmprestar()) {
            itensEmprestados.add(item);
            System.out.println(nome+" emprestou: "+item.mostrarDescricao());
        } else {
            System.out.println(nome + " já atingiu o limite de empréstimos!");
        }
    }
}
