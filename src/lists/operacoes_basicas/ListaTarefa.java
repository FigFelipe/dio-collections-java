package lists.operacoes_basicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    // Atributo
    private List<Tarefa> tarefaList;

    // Construtor
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    // Metodos
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){

        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        // Percorrer toda a lista 'tarefaList'
        for(Tarefa t : tarefaList) {

            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }

        // Removendo todas as tarefas da lista 'tarefasParaRemover'
        // da lista de tarefas 'tarefasList'
        tarefaList.removeAll(tarefasParaRemover);

    }

    public int numeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

}

