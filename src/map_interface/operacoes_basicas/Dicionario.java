package map_interface.operacoes_basicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    // Atributos
    private Map<String, String> dicionarioMap;

    // Construtor
    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    // Metodos
    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if(!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavras(){
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra){

        String pesquisaPorPalavra = null;

        if(!dicionarioMap.isEmpty()){
            pesquisaPorPalavra = dicionarioMap.get(palavra);
        }

        return pesquisaPorPalavra;
    }
}
