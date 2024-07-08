package set_interface.pesquisa.exemplo_1;

import java.util.Objects;

public class Tarefa {

    // Atributos
    private String descricao;
    private boolean isConcluida;

    // Construtor
    public Tarefa(String descricao, boolean isConcluida) {
        this.descricao = descricao;
        this.isConcluida = isConcluida;
    }

    // Metodos de acesso
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluida() {
        return isConcluida;
    }

    public void setConcluida(boolean concluida) {
        isConcluida = concluida;
    }

    // Metodos equals() e hashCode
    // A descricao da tarefa deve ser exclusiva
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return isConcluida() == tarefa.isConcluida() && Objects.equals(getDescricao(), tarefa.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescricao(), isConcluida());
    }

    // ToString()

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", isConcluida=" + isConcluida +
                '}';
    }
}
