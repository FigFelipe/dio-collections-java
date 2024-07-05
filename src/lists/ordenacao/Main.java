package lists.ordenacao;

public class Main {
    public static void main(String[] args) {

        // Criando uma instancia da classe OrdenacaoPessoa
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        // Adicionando pessoas à lista
        ordenacaoPessoa.adicionarPessoa("Alice", 20, 1.56);
        ordenacaoPessoa.adicionarPessoa("Bob", 30, 1.80);
        ordenacaoPessoa.adicionarPessoa("Charlie", 25, 1.70);
        ordenacaoPessoa.adicionarPessoa("David", 17, 1.56);

        // Imprimindo a lista
        System.out.println(ordenacaoPessoa.pessoaList);

        // Ordenando por idade
        System.out.println(ordenacaoPessoa.ordenarPorIdade());

        // Ordenando por altura
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}
