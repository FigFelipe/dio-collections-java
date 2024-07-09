package map_interface.pesquisa;

public class Palavra {

    // Atributos
    private String linguagem;
    private int contagem;

    // Construtor
    public Palavra(String linguagem, int contagem) {
        this.linguagem = linguagem;
        this.contagem = contagem;
    }

    // Metodos de acesso
    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public int getContagem() {
        return contagem;
    }

    public void setContagem(int contagem) {
        this.contagem = contagem;
    }

    // ToString()
    @Override
    public String toString() {
        return "Palavra{" +
                "linguagem='" + linguagem + '\'' +
                ", contagem=" + contagem +
                '}';
    }
}
