public class Livro {
    private String idLivro;
    private String titulo;
    private String autor;
    private Boolean disponibilidade;

    public Livro(String idLivro, String titulo, String autor, Boolean disponibilidade) {
        this.idLivro = idLivro;
        this.disponibilidade = true;
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public String getIdLivro() {
        return idLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public Boolean getDisponibilidade() {
        return disponibilidade;
    }

    public Boolean emprestar() {
        if (disponibilidade) {
            disponibilidade = false;
            return true;
        } else {
            return false;
        }
    }

    public Boolean devolver() {
        if (!disponibilidade) {
            disponibilidade = false;
            return true;
        } else {
            return false;
        }
    }
}
