package map_interface.operacoes_basicas;

public class Main {
    public static void main(String[] args) {

        // Instanciando um novo objeto 'AgendaContatos'
        AgendaContatos agendaContatos = new AgendaContatos();

        // Adicionando contatos
        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("João", 5665);
        agendaContatos.adicionarContato("Carlos", 1111111);
        agendaContatos.adicionarContato("Ana", 654987);
        agendaContatos.adicionarContato("Maria", 1111111);
        agendaContatos.adicionarContato("Camila", 44444);

        // Exibindo os contatos
        agendaContatos.exibirContatos();

        // Removendo contato
        agendaContatos.removerContato("Maria");
        agendaContatos.exibirContatos();

        // Pesquisa por nome
        System.out.println(agendaContatos.pesquisarPorNome("Camila"));


        // Instanciando um objeto 'Dicionario'
        Dicionario dicionario = new Dicionario();

        // Adicionando objeto key, value ao 'dicionarioMap'
        dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
        dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");

        // Exibindo objetos <key,value> do conjunto 'dicionarioMap'
        dicionario.exibirPalavras();

        // Pesquisa por palavra
        System.out.println(dicionario.pesquisarPorPalavra("Java")); // retorna null
        System.out.println(dicionario.pesquisarPorPalavra("java"));
        System.out.println(dicionario.pesquisarPorPalavra("Typescript")); // retorna null
        System.out.println(dicionario.pesquisarPorPalavra("typescript"));

        // Remover palavra
        dicionario.removerPalavra("typescript");

        // Exibindo objetos <key,value> do conjunto 'dicionarioMap' atualizado
        dicionario.exibirPalavras();

    }
}
