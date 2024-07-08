package set_interface.operacoes_basicas;

public class Main {

    public static void main(String[] args) {

        // Criando um objeto 'conjuntoConvidados' do tipo 'ConjuntoConvidados'
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        // Exibindo a quantidade de Convidados
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do SET de Convidados");

        // Adicionando Convidados
        conjuntoConvidados.adicionarConvidado("Alice", 1234);
        conjuntoConvidados.adicionarConvidado("Bob", 1235);
        conjuntoConvidados.adicionarConvidado("Charlie", 1235);
        conjuntoConvidados.adicionarConvidado("David", 1236);

        // Exibindo a quantidade de Convidados
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do SET de Convidados");

        // Exibindo os convidados
        conjuntoConvidados.exibirConvidados();

        // Removendo, por codigo de convite, um convidado do conjunto
        conjuntoConvidados.removerConvidadoPorConvite(1236);

        // Exibindo a quantidade de Convidados
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do SET de Convidados");

        // Exibindo a lista atualizada de convidados no conjunto
        conjuntoConvidados.exibirConvidados();

    }
}
