import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livrosDisponiveis;
    private List<Usuario> usuariosRegistrados;

    public Biblioteca() {
        this.livrosDisponiveis = new ArrayList<>();
        this.usuariosRegistrados = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livrosDisponiveis.add(livro);
    }

    public void removerLivro(Livro livro) {
        livrosDisponiveis.remove(livro);
    }

    public void registarUsuarios(Usuario usuario) {
        usuariosRegistrados.add(usuario);
    }

    public boolean realizarEmprestimo(Livro livro, Usuario usuario) {
        if (livrosDisponiveis.contains(livro) && usuariosRegistrados.contains(usuario)) {
            System.out.println("Emprestimo foi realizado com sucesso para o usuario " + usuario.getNome());
            return livro.emprestar();
        }
        return false;
    }

    public boolean devolucao(Livro livro) {
        return livro.devolver();
    }

    public void listarLivros() {
        for (Livro livro : livrosDisponiveis) {
            System.out.println("********************");
            System.out.println("Titulo -> " + livro.getTitulo());
            System.out.println("Autor -> " + livro.getAutor());
            System.out.println("Disponibilidade -> " + livro.getDisponibilidade());
            System.out.println("Id Livro -> " + livro.getIdLivro());
            System.out.println("*****************");
        }
    }
}