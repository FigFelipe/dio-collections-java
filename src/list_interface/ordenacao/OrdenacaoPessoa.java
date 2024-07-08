package list_interface.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    // Atributo
    public List<Pessoa> pessoaList;

    // Construtor
    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){

        // Cria uma lista 'pessoasPorIdade' com o conteudo de 'pessoaList'
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);

        // Ordena a lista 'pessoasPorIdade' pelo metodo COMPARABLE
        Collections.sort(pessoasPorIdade);

        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){

        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);

        // Faz a ordenacao pelo COMPARATOR
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());

        return pessoasPorAltura;
    }

}
