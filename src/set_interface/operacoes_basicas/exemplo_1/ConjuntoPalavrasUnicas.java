package set_interface.operacoes_basicas.exemplo_1;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    // Atributos
    private Set<String> palavrasUnicasSet;

    // Construtor
    public ConjuntoPalavrasUnicas(){
        this.palavrasUnicasSet = new HashSet<>();
    }

    // Metodos
    public void adicionarPalavra(String palavra){
        palavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra){

        // Se o conjunto 'palavrasUnicasSet' for diferente de vazio
        if(!palavrasUnicasSet.isEmpty()){

            if(palavrasUnicasSet.contains(palavra)){

                palavrasUnicasSet.remove(palavra);
            }
            else{
                System.out.println("Palavra '" + palavra + "' não encontrada no conjunto SET.");
            }
        }
        else {
            System.out.println("O conjunto está vazio.");
        }
    }

    public boolean verificarPalavra(String palavra){
        return palavrasUnicasSet.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        if(!palavrasUnicasSet.isEmpty()){
            System.out.println(palavrasUnicasSet);
        }
        else {
            System.out.println("O conjunto está vazio");
        }
    }
}
