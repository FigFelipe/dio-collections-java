package set_interface.operacoes_basicas.exemplo_1;

public class Main {
    public static void main(String[] args) {

        // Instanciando um objeto 'conjuntoLinguagens'
        ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

        // Adicionando palavras ao conjunto
        conjuntoLinguagens.adicionarPalavra("JAVA");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("JavaScript");
        conjuntoLinguagens.adicionarPalavra("C#");

        // Exibindo as linguagens unicas do conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();

        // Removendo uma linguagem do conjunto
        conjuntoLinguagens.removerPalavra("JAVA");
        conjuntoLinguagens.exibirPalavrasUnicas();

        // Removendo uma linguagem inexistente
        conjuntoLinguagens.removerPalavra("Swift");

        // Verificando se uma linguagem está no conjunto
        System.out.println("A linguagem 'JAVA' está no conjunto? " + conjuntoLinguagens.verificarPalavra("JAVA"));
        System.out.println("A linguagem 'C#' está no conjunto? " + conjuntoLinguagens.verificarPalavra("C#"));

    }
}
