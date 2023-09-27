import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String idUsuario;
    private String nome;
    private List<String> livrosEmprestado;

    public Usuario(String idUsuario, String nome, String livroEmprestado) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.livrosEmprestado = new ArrayList<>();
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getLivroEmprestado() {
        return livrosEmprestado;
    }

    public void setLivroEmprestado(List<String> livroEmprestado) {
        this.livrosEmprestado = livroEmprestado;
    }

    public void addLivrosEmprestados(String idLivro) {
        livrosEmprestado.add(idLivro);
    }

    public void removerLivrosEmprestados(String idLivro) {
        livrosEmprestado.remove(idLivro);
    }

    public List<Livro> getLivrosEmprestados() {
        return null;
    }
}
