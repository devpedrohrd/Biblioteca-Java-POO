import java.util.Scanner;

public class BibliotecaApp {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        boolean exec = true;
        Biblioteca biblioteca = new Biblioteca();
        do {
            System.out.println("******* BIBLIOTECA *******");
            System.out.println("1) CADASTRAR LIVRO");
            System.out.println("2) LISTAR LIVROS");
            System.out.println("3) CADASTRAR USUARIO");
            System.out.println("4) REALIZAR EMPRESTIMO");
            System.out.println("5) DEVOLUCAO");
            System.out.println("6) REMOVER LIVRO");
            System.out.println("6) SAIR");
            System.out.println("**************************");

            System.out.println("Digite uma opcao:");
            int escolha = prompt.nextInt();
            prompt.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("Digite o titulo do livro:");
                    String titulo = prompt.nextLine();

                    System.out.println("Digite o id do livro:");
                    String idLivro = prompt.nextLine();

                    System.out.println("Digite autor do livro:");
                    String autor = prompt.nextLine();

                    Livro livro = new Livro(idLivro, titulo, autor, null);
                    biblioteca.adicionarLivro(livro);
                    System.out.println("Livro registrado com sucesso!");
                    break;
                case 2:
                    System.out.println("****** Lista de livros ******");
                    biblioteca.listarLivros();
                    break;
                case 3:
                    System.out.println("Digite o nome do usuario:");
                    String nome = prompt.nextLine();

                    System.out.println("Digite o id do usuario:");
                    String idUsuario = prompt.nextLine();

                    Usuario usuario = new Usuario(idUsuario, nome);
                    break;
            }

        } while (exec);

    }
}
