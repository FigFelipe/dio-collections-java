package list_interface.pesquisa;

public class Main {
    public static void main(String[] args) {

        // Criando um novo objeto 'CatalaogoLivros'
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        // Adicionando livros ao catálogo
        catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
        catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
        catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
        catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);

        // Pesquisando livro por autor
        System.out.println(catalogoLivros.pesquisarPorAutor("Susan J. Fowler"));

        // Pesquisando livro por intervalo de ano
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2009, 2012));

        // Pesquisando por titulo
        System.out.println(catalogoLivros.pesquisarPorTitulo("Código Limpo"));

    }
}
