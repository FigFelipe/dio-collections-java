package map_interface.ordenacao;

public class Evento {

    // Atributos
    private String nome;
    private String atracao;

    // Construtor
    public Evento(String nome, String atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }

    // Metodos de acesso
    public String getNome() {
        return nome;
    }

    public String getAtracao() {
        return atracao;
    }

    // ToString()
    @Override
    public String toString() {
        return "Evento{" +
                "nome='" + nome + '\'' +
                ", atracao='" + atracao + '\'' +
                '}';
    }
}
