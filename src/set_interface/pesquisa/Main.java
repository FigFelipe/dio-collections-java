package set_interface.pesquisa;

public class Main {
    public static void main(String[] args) {

        // Instanciando um novo objeto 'agendaContatos'
        AgendaContatos agendaContatos = new AgendaContatos();

        // Exibindo os contatos da agenda
        agendaContatos.exibirContatos();

        // Adicionando contatos à agenda
        agendaContatos.adicionarContato("João", 123456789);
        agendaContatos.adicionarContato("Maria", 987654321);
        agendaContatos.adicionarContato("Maria Fernandes", 55555555);
        agendaContatos.adicionarContato("Ana", 88889999);
        agendaContatos.adicionarContato("Fernando", 77778888);
        agendaContatos.adicionarContato("Carolina", 55555555);

        // Exibindo os contatos da agenda
        agendaContatos.exibirContatos();

        // Pesquisando a agenda por nome
        System.out.println(agendaContatos.pesquisarPorNome("Ana"));

        // Modificando o numero de telefone por pesquisa de usuario
        agendaContatos.atualizarNumeroContato("Maria", 12345);
        agendaContatos.exibirContatos();


    }
}
