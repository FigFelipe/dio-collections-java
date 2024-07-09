package map_interface.operacoes_basicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    // Atributos
    // Map<Chave, Valor>
    // * Aceita somente parametros do tipo primitivo
    private Map<String, Integer> agendaContatoMap;

    // Construtor
    public AgendaContatos() {

        // HashMap é uma implementação da interface Map
        // que não mantem uma ordem específica dos elementos.
        // Os elementos são internamente armazenados através da funcao de hash,
        // qual melhora a eficiencia de operacoes de pesquisa e acesso.
        // O hashMap permite chaves ou valores nulos

        this.agendaContatoMap = new HashMap<>();
    }

    // Metodos
    public void adicionarContato(String nome, Integer telefone){

        // 'put' adiciona e/ou atualiza a chave, valor
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){

        // Verificar se o map contém elementos (não estiver vazio)
        if(!agendaContatoMap.isEmpty()){

            // Removendo objeto através da chave 'valor'
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){

        Integer numeroPorNome = null;

        if(!agendaContatoMap.isEmpty()){

            numeroPorNome = agendaContatoMap.get(nome);
        }

        return numeroPorNome;
    }
}
