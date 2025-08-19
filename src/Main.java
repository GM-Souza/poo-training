import biblioteca.DVD;
import biblioteca.Livros;
import biblioteca.Revista;
import usuarios.Aluno;
import usuarios.Professor;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Criando itens
        DVD dvd = new DVD("Interestelar", 2014, 169);
        Livros livros = new Livros("O Senhor dos Anéis", 1954, "J.R.R. Tolkien");
        Revista revista = new Revista("Super Interessante", 2023, "Edição 400");

        // Criando usuários
        Aluno aluno = new Aluno("Carlos");
        Professor professor = new Professor("Ana");

        // Testando empréstimos
        aluno.emprestarItem(livros);
        aluno.emprestarItem(revista);
        aluno.emprestarItem(dvd);
        aluno.emprestarItem(dvd); // deve bloquear (limite 3)

        professor.emprestarItem(livros);
        professor.emprestarItem(revista);
        professor.emprestarItem(dvd);


    }
}