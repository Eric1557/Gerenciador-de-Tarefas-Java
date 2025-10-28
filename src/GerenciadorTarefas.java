import java.util.List;
import java.util.ArrayList;

public class GerenciadorTarefas {

  List<Tarefa> tarefas = new ArrayList<>();
  private int proxId = 1;

  public GerenciadorTarefas(List<Tarefa> tarefas) {
    this.tarefas = tarefas;
  }

  public void adicionarTarefas(String nome, String descricao) {
     tarefas.add(new Tarefa(proxId++,nome,descricao));
     System.out.println("Tarefa "  + nome + " adicionada com sucesso!\n ");
  
  }

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


