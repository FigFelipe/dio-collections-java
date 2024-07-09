package set_interface.ordenacao;

public class Main {
    public static void main(String[] args) {

        // Instanciando um novo objeto 'cadastroProdutos' do tipo 'CadastroProdutos'
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        // Adicionando produtos ao conjunto
        cadastroProdutos.adicionarProduto(1L, "Smartphone", 1000d, 10);
        cadastroProdutos.adicionarProduto(2L, "Notebook", 1500d, 5);
        cadastroProdutos.adicionarProduto(1L, "Mouse", 30d, 20);
        cadastroProdutos.adicionarProduto(4L, "Teclado", 50d, 15);

        // Exibindo o conjunto de objetos 'Produtos'
        // Obs.: Nesse caso, como houve a duplicacao do codigo '1'
        // o conjunto SET nao permite duplicação do mesmo,
        // mantendo assim a primeira ocorrencia do produto
        System.out.println(cadastroProdutos.produtoSet);

        // Exibir produto por nome
        // O treeSet consegue ordernar através do comparable
        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        // Exibir produtos por preco
        System.out.println(cadastroProdutos.exibirPorPreco());
    }
}
