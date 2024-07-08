package set_interface.pesquisa.exemplo_1;


import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    // Atributos
    private Set<Tarefa> listaTarefas;

    // Construtor
    public ListaTarefas() {
        this.listaTarefas = new HashSet<>();
    }

    // Metodos
    public void adicionarTarefa(String descricao){

        listaTarefas.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao){

        Tarefa tarefaParaRemover = null;

        // Se o conjunto de 'Tarefa' nao for vazio
        if(!listaTarefas.isEmpty()){

            // Percorrer o conjunto de objetos 'Tarefas'
            for(Tarefa t : listaTarefas){

                if(t.getDescricao().equalsIgnoreCase(descricao)){

                    tarefaParaRemover  = t;

                    listaTarefas.remove(tarefaParaRemover);

                    break;
                }
            }
        }
    }

    public void exibirTarefas(){

        System.out.println(listaTarefas);
    }

    public void contarTarefas(){
        System.out.println("Total de tarefas: " + listaTarefas.size());
    }

    public Set<Tarefa> obterTarefasConcluidas(){

        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        if(!listaTarefas.isEmpty()){
            for(Tarefa t : listaTarefas){
                if(t.isConcluida()){
                    tarefasConcluidas.add(t);
                }
            }
        } else {
            System.out.println("Não existem tarefas concluídas");
        }

        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){

        Set<Tarefa> tarefasPendentes = new HashSet<>();

        if(!listaTarefas.isEmpty()){
            for(Tarefa t : listaTarefas){
                if(!t.isConcluida()){
                    tarefasPendentes.add(t);
                }
            }
        } else {
            System.out.println("Não existem tarefas pendentes");
        }

        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){

        if(!listaTarefas.isEmpty()) {
            for (Tarefa t : listaTarefas) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    t.setConcluida(true);

                    System.out.println("A tarefa '" + t.getDescricao() + "' foi marcada como CONCLUÍDA.");

                    break;
                } else {
                    //System.out.println("A tarefa '" + descricao + "' não foi encontrada.");
                }
            }
        }
    }

    public void marcarTarefaPendente(String descricao){

        if(!listaTarefas.isEmpty()) {
            for (Tarefa t : listaTarefas) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {

                    t.setConcluida(false);

                    System.out.println("A tarefa '" + t.getDescricao() + "' foi marcada como PENDENTE.");

                    break;
                } else {
                    System.out.println("A tarefa '" + descricao + "' não foi encontrada.");
                }
            }
        }
    }

    public void limparListaTarefas(){

        if(listaTarefas.isEmpty()){
            System.out.println("O conjunto de Tarefas já está vazio.");
        } else {
            listaTarefas.clear();

            System.out.println("O conjunto de tarefas foi limpo.");

        }
    }
}
