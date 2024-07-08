package set_interface.pesquisa.exemplo_1;

public class Main {
    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();

        // Exibindo o conjunto de objetos de Tarefas (deve estar vazio)
        listaTarefas.exibirTarefas();

        // Adicionando uma nova Tarefa
        listaTarefas.adicionarTarefa("Estudar java");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Realizar compras");

        // Exibindo o conjunto de objetos de Tarefas
        listaTarefas.exibirTarefas();

        // Exibindo a quantidade de tarefas
        listaTarefas.contarTarefas();

        // Obter o conjunto de Tarefas Concluidas
        System.out.println("Tarefas Concluídas: " + listaTarefas.obterTarefasConcluidas());

        // Obter o conjunto de Tarefas Pendentes
        System.out.println("Tarefas Pendentes: " + listaTarefas.obterTarefasPendentes());

        // Marcar tarefa como Concluída
        listaTarefas.marcarTarefaConcluida("Estudar java");
        listaTarefas.marcarTarefaConcluida("Estudar C#");

        // Exibindo o conjunto de objetos de Tarefas (deve estar vazio)
        listaTarefas.exibirTarefas();

        // Marcar tarefa como Pendente
        listaTarefas.marcarTarefaPendente("Estudar java");
        listaTarefas.exibirTarefas();

        // Limpar o conjunto de Tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();

    }
}
