package lists.operacoes_basicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    // Atributos
    private List<Item> itemList;

    // Construtor
    public CarrinhoCompras(){
        this.itemList = new ArrayList<>();
    }

    // Metodos
    public void adicionarItem(String nome, double preco, int quantidade){

        // Criando novo item com nome, preco e quantidade
        Item item = new Item(nome, preco, quantidade);

        // Adicionando item à lista itemList do tipo Item
        this.itemList.add(item);
    }

    public void removerItem(String nome){

        // Criando uma lista exclusiva de itens para remocao
        List<Item> itensParaRemover = new ArrayList<>();

        // Se a lista 'itensParaRemover' não for vazia, entao
        if(!itemList.isEmpty()){

            // Percorrer os itens da lista
            for(Item i : itemList){

                // Se a lista encontrar o objeto com o nome informado
                if(i.getNome().equalsIgnoreCase(nome)){

                    // Entao adiciona o item para a lista 'itensParaRemover'
                    itensParaRemover.add(i);
                }
            }
        }

    }

    public double calcularValorTotal(){

        double valorTotal = 0d;

        // Se a lista nao for vazia
        if(!itemList.isEmpty()){

            // Percorrer os elementos da lista
            for(Item item : itemList){

                // Calcula o valor do item de acordo com a quantidade do mesmo
                double valorItem = item.getPreco() * item.getQuantidade();

                // Atualiza o valor total
                valorTotal += valorItem;
            }

            return valorTotal;
        }
        else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirItens(){

        if(!itemList.isEmpty()){
            System.out.println(this.itemList);
        } else {
            System.out.println("A lista está vazia");
        }
    }
}
