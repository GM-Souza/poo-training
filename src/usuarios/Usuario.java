package usuarios;

import biblioteca.ItemBiblioteca;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {
    private String nome;
    private List<ItemBiblioteca> itensEmprestados;

    public Usuario(String nome) {
        this.nome = nome;
        this.itensEmprestados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Metodo abstrato: podeEmprestar() (verifica limite de itens)

    public abstract int podeEmprestar();

    //Metodo: emprestarItem(item) (verifica se pode e adiciona).

    public void emprestarItem(ItemBiblioteca item) {
        if (itensEmprestados.size() < podeEmprestar()) {
            itensEmprestados.add(item);
            System.out.println(getNome()+" emprestou: "+item.mostrarDescricao());
        } else {
            System.out.println(getNome() + " já atingiu o limite de empréstimos!");
        }
    }


}
