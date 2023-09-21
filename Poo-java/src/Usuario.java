public class Usuario {
    private String idUsuario;
    private String nome;

    public Usuario(String idUsuario, String nome) {
        this.idUsuario = idUsuario;
        this.nome = nome;
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

}
