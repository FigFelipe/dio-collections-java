package map_interface.pesquisa;

public class Main {
    public static void main(String[] args) {

        // Instanciando um novo objeto 'EstoqueProdutos'
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        // Adicionando objetos 'Produto'
        estoqueProdutos.adicionarProduto(1L, "Notebook", 1, 1500.0);
        estoqueProdutos.adicionarProduto(2L, "Mouse", 5, 25.0);
        estoqueProdutos.adicionarProduto(3L, "Monitor", 10, 400.0);
        estoqueProdutos.adicionarProduto(4L, "Teclado", 2, 40.0);

        // Exibindo o estoque de produtos
        estoqueProdutos.exibirProdutos();

        // Calcula e exibe o valor total do estoque
        System.out.println(estoqueProdutos.calcularValorTotalEstoque());

        // Obtem e exibe o produto mais caro
        Produto produtoMaisCaro = estoqueProdutos.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);

        // Obtem e exibe o produto mais barato
        Produto produtoMaisBarato = estoqueProdutos.obterProdutoMaisBarato();
        System.out.println("Produto mais barato: " + produtoMaisBarato);

        // Obtem e exibe o produto com a maior quantidade em valor no estoque
        Produto produtoMaiorQuantidadeValorTotal = estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
        System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);


        // Instanciando um novo objeto 'ContagemPalavras'
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        // Adicionando palavras na collection Map
        contagemPalavras.adicionarPalavra("Java", 2);
        contagemPalavras.adicionarPalavra("Python", 8);
        contagemPalavras.adicionarPalavra("JavaScript", 1);
        contagemPalavras.adicionarPalavra("C#", 6);

        // Exibir objetos 'Palavras' no Map
        contagemPalavras.exibirPalavras();

        // Exibe a contagem total de linguagens
        System.out.println("Existem " + contagemPalavras.exibirContagemPalavras() + " palavra(s).");

        // Exibir a linguagem mais frequente
        String linguagemMaisFrequente = contagemPalavras.encontrarPalavraMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);

    }
}
