import java.util.List;
import java.util.ArrayList;

//Classe principal que gerencia uma lista de tarefas
public class GerenciadorTarefas {
   //Lista principal que gerencia uma lista de tarefas
  List<Tarefa> tarefas = new ArrayList<>();
  //Variável para controlar o próximo ID disponível
  private int proxId = 1;
  //Construtor que inicializa o gerenciador com uma lista de tarefas
  public GerenciadorTarefas(List<Tarefa> tarefas) {
    this.tarefas = tarefas;
  }
  // Método para adicionar uma nova tarefa á lista
  public void adicionarTarefas(String nome, String descricao) {
     tarefas.add(new Tarefa(proxId++,nome,descricao));
     System.out.println("Tarefa "  + nome + " adicionada com sucesso!\n ");
  
  }
  // Método para listar todas as tarefas á lista
  public void ListarTarefas() {
    if (tarefas.isEmpty()) {
      System.out.println("Lista de tarefas vazia !");
      return;
    } else {
      for (Tarefa t : tarefas) {
        System.out.println(t);
      }
    }
  }
  // Método para remover uma tarefa com base no ID
  public void RemoverTarefas(int id) {
    for (Tarefa t : tarefas) {
      if (id == t.getId()) {
        tarefas.remove(t);
        System.out.println("Tarefa " + t.getNome() + " removida com sucesso !\n");
        return;
      }
    }
    System.out.println("Erro : As Tarefas não foram removidas !");
  }
  // Método para atualizar os dados de uma tarefa existente
  public void AtualizarTarefas(int id, String nome, String descricao, boolean concluida) {
    for (Tarefa t : tarefas) {
      t.setNome(nome);
      t.setDescricao(descricao);
      t.setConcluida(concluida);
      System.out.println("Tarefa " + t.getNome() + " atualizada com sucesso !\n");
      return;
    }
    System.out.println("Erro : As Tarefas não foram atualizadas !");
  }
  // Método para marcar uma tarefa como concluída
  public void MarcarConcluida(int id) {
    for (Tarefa t : tarefas) {
      if (id == t.getId()) {
        t.setConcluida(true);
        System.out.println("Tarefa marcada como concluída !\n");
        return;
      }
    }
    System.out.println("Tarefa não encontrada !");

  }

}


