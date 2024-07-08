package list_interface.operacoes_basicas;

public class Main {
    public static void main(String[] args) {

        // Criando um objeto do tipo listaTarefa
        ListaTarefa listaTarefa = new ListaTarefa();

        // Quando o objeto do tipo 'ListaTarefa' é instanciado na classe 'ListaTarefa'
        // é automaticamente criado pelo construtor um Arraylist vazio
        System.out.println("Número total de tarefas: " + listaTarefa.numeroTotalTarefas());

        // Adicionando uma nova Tarefa
        listaTarefa.adicionarTarefa("Tarefa 1");

        // Visualizando a Tarefa adicionada
        System.out.println("Número total de tarefas: " + listaTarefa.numeroTotalTarefas());

        // Adicionando uma nova Tarefa
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("Número total de tarefas: " + listaTarefa.numeroTotalTarefas());

        // Removendo uma tarefa
        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("Número total de tarefas: " + listaTarefa.numeroTotalTarefas());

        // Obtendo descricao de Tarefas
        listaTarefa.obterDescricoesTarefas();


        // Criando um objeto Carrinho de Compras
        CarrinhoCompras meuCarrinhoCompras = new CarrinhoCompras();

        // Adicionando um novo item ao carrinho de compras
        meuCarrinhoCompras.adicionarItem("Lápis",2d, 3);
        meuCarrinhoCompras.adicionarItem("Lápis",2d, 3);
        meuCarrinhoCompras.adicionarItem("Caderno",35d, 3);
        meuCarrinhoCompras.adicionarItem("Borracha",2d, 2);

        // Exibindo os itens do carrinho
        meuCarrinhoCompras.exibirItens();

        // Removendo itens do carrinho de compras
        meuCarrinhoCompras.removerItem("Lápis");

        // Exibindo os itens atualizados do carrinho de compras
        meuCarrinhoCompras.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("Valor total da compra: " + meuCarrinhoCompras.calcularValorTotal());

    }
}
