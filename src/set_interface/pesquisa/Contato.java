package set_interface.pesquisa;

import java.util.Objects;

public class Contato {

    // Atributos
    private String nome;
    private int numero;

    // Construtor
    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    // Metodos de acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    // Metodos equals() e hashCode()
    // * hashCode é unico
    // Nesse caso escolhemos que somente unico atributo à ser comparado é o 'nome'
    // Ou seja, não é possível adicionar contatos com o mesmo 'nome'
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return getNumero() == contato.getNumero() && Objects.equals(getNome(), contato.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getNumero());
    }

    // ToString() para exibir as informações do objeto em formato de texto
    // ao inves de exibir o endereço de memória
    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }
}
