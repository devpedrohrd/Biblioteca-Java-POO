import java.util.Scanner;

public class BibliotecaApp {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        boolean exec = true;
        Biblioteca biblioteca = new Biblioteca();
        Usuario usuario = null;
        Livro livro = null;

        do {
            biblioteca.menu();
            int escolha = prompt.nextInt();
            prompt.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("***** CADASTRO DE LISVRO *****");
                    System.out.println("Digite o titulo do livro:");
                    String titulo = prompt.nextLine();

                    System.out.println("Digite o id do livro:");
                    String idLivro = prompt.nextLine();

                    System.out.println("Digite autor do livro:");
                    String autor = prompt.nextLine();

                    livro = new Livro(idLivro, titulo, autor, null);
                    biblioteca.adicionarLivro(livro);
                    System.out.println("Livro registrado com sucesso!");
                    break;
                case 2:
                    System.out.println("****** Lista de livros ******");
                    biblioteca.listarLivros();
                    break;
                case 3:
                    System.out.println("***** CADASTRO DE USUARIO *****");
                    System.out.println("Digite o nome do usuario:");
                    String nome = prompt.nextLine();

                    System.out.println("Digite o id do usuario:");
                    String idUsuario = prompt.nextLine();

                    usuario = new Usuario(idUsuario, nome);
                    break;
                case 4:
                    System.out.println("Digite o livro que deseja reservar:");
                    String id = prompt.nextLine();
                    if (id.equals(livro.getIdLivro())) {
                        biblioteca.realizarEmprestimo(livro, usuario);
                        livro.emprestar();
                    }
                    System.out.println("Emprestimo realizado com sucesso!");
                    break;
                case 5:
                    exec = false;
            }

        } while (exec);

    }
}
