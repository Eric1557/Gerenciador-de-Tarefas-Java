public class Tarefa {

    private String nome;
    private int id;
    private String descricao;
    private boolean concluida;

    public Tarefa() {
    }

    public Tarefa(String nome,int id, String descricao, boolean concluida) {
        this.nome = nome;
        this.id = id;
        this.descricao = descricao;
        this.concluida = false;
    }

    public Tarefa(int id,String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        return String.format("ID: %d\nNome: %s\nDescrição: %s\nConcluída: %s\n", id, nome, descricao,
                concluida ? "SIM" : "NÃO");
    }

}
