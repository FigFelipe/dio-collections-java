package map_interface.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    // Atributos
    private Map<String, Integer> palavrasMap;

    // Construtor
    public ContagemPalavras() {
        this.palavrasMap = new HashMap<>();
    }

    // Metodos
    public void adicionarPalavra(String linguagem, Integer contagem){
        palavrasMap.put(linguagem, contagem);
    }

    public void removerPalavra(String palavra){
        if (!palavrasMap.isEmpty()){
            palavrasMap.remove(palavra);
        } else {
            System.out.println("Não foi possível remover " + palavra + " pois o Map está vazio.");
        }
    }

    public void exibirPalavras(){
        System.out.println(palavrasMap);
    }

    public int exibirContagemPalavras(){
        int contagemTotal = 0;

        if(!palavrasMap.isEmpty()){
            for(int contagem : palavrasMap.values()){
               contagemTotal += contagem;
            }
        }

        return contagemTotal;
    }

    public String encontrarPalavraMaisFrequente(){

        String linguagemMaisFrequente = null;
        int maiorContagem = 0;

        if(!palavrasMap.isEmpty()){
            for(Map.Entry<String, Integer> entry : palavrasMap.entrySet()){

                if(entry.getValue() > maiorContagem){
                    maiorContagem = entry.getValue();
                    linguagemMaisFrequente = entry.getKey();
                }

            }
        }

        return linguagemMaisFrequente;

    }
}
