package lists.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    // Atributos
    private List<Livro> livroList;

    // Construtor de Livros
    public CatalogoLivros() {

        // Instanciando um ArrayList vazio
        this.livroList = new ArrayList<>();
    }

    // Metodos
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){

        // Adicionando um novo item Livro instanciado
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor (String autor){

        // Criando uma lista de objeto 'Livro' com nome 'livrosPorAutor' instanciado em um ArrayList vazio
        List<Livro> livrosPorAutor = new ArrayList<>();

        // Verificar se a lista nao esta vazia
        if(!livroList.isEmpty()){

            // Percorrer a conteudo da lista 'livroList'
            for(Livro l : livroList){

                // Se o 'autor' informado existir na lista 'livroList'
                if(l.getAutor().equalsIgnoreCase(autor)){

                    // Entao adicioná-lo á lista de 'livrosPorAutor'
                    livrosPorAutor.add(l);
                }
            }
        }

        // Finalizando com o retorno da lista 'livrosPorAutor'
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){

        // Criando uma lista de Livros nomeada de 'livroPorIntervaloAnos'
        List<Livro> livroPorIntervaloAnos = new ArrayList<>();

        // Se a lista de livros 'livroList' não estiver vazia
        if(!livroList.isEmpty()){

            // Percorrer a lista de livros
            for(Livro l : livroList){

                // Verifica se o ano de publicacao atende ao intervalo de anos informado
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){

                    // Adicionar o livro à lista 'livroPorIntervaloAnos'
                    livroPorIntervaloAnos.add(l);
                }
            }
        }

        return livroPorIntervaloAnos;

    }

    public Livro pesquisarPorTitulo(String titulo){

        // Cria um objeto tipo Livro com nome de 'livroPorTitulo'
        Livro livroPorTitulo = null;

        if(!livroList.isEmpty()){ // Verifica se a lista nao é vazia
            for(Livro l : livroList){ // Percorre os elementos da lista 'livroList'
                if(l.getTitulo().equalsIgnoreCase(titulo)){ // Compara o titulo do livro com o parametro informado
                    livroPorTitulo = l;

                    break; // Interrompe o laço FOR pois queremos somente o primeiro elemento encontrado da lista
                }
            }
        }

        return livroPorTitulo;
    }
}
