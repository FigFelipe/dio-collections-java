package map_interface.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    // Atributos
    private Map<Long, Produto> estoqueProdutosMap;

    // Construtor
    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    // Metodos
    public void adicionarProduto(long codigo, String nome, int quantidade, double preco){

        // informando o objeto 'Produto' como parametro de 'value' da <key, value>
        // <long codigo, new Produto(nome, preco, quantidade)
        estoqueProdutosMap.put(codigo, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){

        double valorTotalEstoque = 0d;

        if(!estoqueProdutosMap.isEmpty()){

            // ForEach de objetos 'Produto' dentro da coleção Map 'estoqueProdutosMap'
            // qual retorna somente seu parametro 'value', desconsiderando o parametro 'key'
            for(Produto p : estoqueProdutosMap.values()){

                valorTotalEstoque += p.getPreco() * p.getQuantidade();
            }
        }

        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){

        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        // Obtem somente o parametro 'value' do Map 'estoqueProdutosMap'
        for(Produto p : estoqueProdutosMap.values()){

            if(p.getPreco() > maiorPreco){
                produtoMaisCaro = p;

                maiorPreco = p.getPreco();
            }
        }

        return produtoMaisCaro;

    }

    public Produto obterProdutoMaisBarato(){

        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;

        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                if(p.getPreco() < menorPreco){
                    produtoMaisBarato = p;

                    menorPreco = p.getPreco();
                }
            }
        }

        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){

        Produto produtoMaiorQuantidadeValorTotalNoEstoque = null;
        double maiorValorTotalProdutosEstoque = 0d;

        if(!estoqueProdutosMap.isEmpty()){

            for(Map.Entry<Long, Produto> entry : estoqueProdutosMap.entrySet()){

                double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();

                if(valorProdutoEmEstoque > maiorValorTotalProdutosEstoque){

                    maiorValorTotalProdutosEstoque = valorProdutoEmEstoque;

                    produtoMaiorQuantidadeValorTotalNoEstoque = entry.getValue();
                }
            }
        }

        return produtoMaiorQuantidadeValorTotalNoEstoque;
    }

}
