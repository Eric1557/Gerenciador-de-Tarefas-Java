
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int op = 0;

        GerenciadorTarefas gr = new GerenciadorTarefas(new ArrayList<>());

        do {
            System.out.println("Sejam Bem vindos Gerenciador de Tarefas: ");
            System.out.println("1. Adicionar Tarefas ");
            System.out.println("2. Listar Tarefas ");
            System.out.println("3. Remover Tarefas ");
            System.out.println("4. Atualizar Tarefas ");
            System.out.println("5. Marcar Tarefa como Concluida ");
            System.out.println("6. Sair ");
            System.out.println("Escolha uma opção: ");

            try {
                op = sc.nextInt();
                sc.nextLine();

                switch (op) {
                    case 1:
                        
                        System.out.println("Digite o nome da tarefa:");
                        String nome = sc.nextLine();
                        System.out.println("Digite a descrição da Tarefa :");
                        String descricao = sc.nextLine();
                        gr.adicionarTarefas(nome, descricao);
                        break;

                    case 2:
                        gr.ListarTarefas();
                        break;

                    case 3:
                        System.out.println("Digite o ID da tarefa que será removida :");
                        int idRemover = sc.nextInt();
                        sc.nextLine();
                        gr.RemoverTarefas(idRemover);
                        break;

                    case 4:

                        System.out.println("Digite o ID da tarefa para atualizar: ");
                        int idAtualizar = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Digite o novo nome: ");
                        String novoNome = sc.nextLine();
                        System.out.println("Digite a nova descrição: ");
                        String novaDescricao = sc.nextLine();
                        System.out.println("Digite se a tarefa está concluida (s/n): ");
                        Boolean concluida = sc.nextLine().equalsIgnoreCase("s");
                        gr.AtualizarTarefas(idAtualizar, novoNome, novaDescricao, concluida);
                        break;

                    case 5:
                        System.out.println("Digite o ID da tarefa para marcar como concluída: ");
                        int idConcluida = sc.nextInt();
                        gr.MarcarConcluida(idConcluida);
                        break;

                    case 6:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida! ");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número.");
                sc.nextLine();

            }

        } while (op != 6);

        sc.close();

    }
}

    
