package map_interface.ordenacao;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {

    // Atributos
    private Map<LocalDate, Evento> eventoMap; // <key, value>

    // Construtor
    public AgendaEventos() {

        // HashMap vazio
        this.eventoMap = new HashMap<>();
    }

    // Metodos
    public void adicionarEvento(LocalDate data, String nome, String atracao){

        Evento evento = new Evento(nome, atracao);

        // <data, objeto 'Evento'>
        eventoMap.put(data, evento);
    }

    public void exibirAgenda(){

        // Criando um conjunto Map <key, value>, do tipo ordenado TreeMap
        // O treeMap recebe como parametro o Map 'eventoMap'
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);

        System.out.println(eventosTreeMap);
    }

    public void exibirProximoEvento(){

        // Retorna um conjunto SET com todas as keys do 'eventoMap'
        //Set<LocalDate> dataSet = eventoMap.keySet();

        // Retorna todos os valores do 'eventoMap'
        //Collection<Evento> values = eventoMap.values();

        // o GET não funcionaria pois nao sabemos qual a key referente
        //eventoMap.get()

        // Obtem a data atual
        LocalDate dataAtual =  LocalDate.now();

        // Obtem o Map dos elementos na ordem crescente
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);

        // Percorres os elementos do Map
        for (Map.Entry<LocalDate, Evento> entry : eventoMap.entrySet()){

            // Compara a data atual com o parametro <key>
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O próximo evento " + entry.getValue() + " acontecerá na data " + entry.getKey());

                break;
            }
        }
    }
}
