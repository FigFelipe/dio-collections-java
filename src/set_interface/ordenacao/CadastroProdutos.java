package set_interface.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    // Atributos
    public Set<Produto> produtoSet;

    // Construtor
    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    // Metodos
    public void adicionarProduto(long codigo, String nome, double preco, int quantidade){

        // Adicionando o objeto 'Produto' ao conjunto 'produtoSet'
        produtoSet.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {

        // O 'Treeset' possibilita a ordenação por ordem alfabetica
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);

        return produtosPorNome;
    }

    public Set<Produto> exibirPorPreco(){

        // O ordenador 'Treeset' recebe o 'comparatorPorPreco'
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());

        produtosPorPreco.addAll(produtoSet);

        return produtosPorPreco;
    }
}
