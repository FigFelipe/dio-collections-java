package list_interface.ordenacao;

import java.util.Comparator;

public class ComparatorPorAltura implements Comparator<Pessoa> {

    // Utilizar 'alt + Insert', Implement Methods
    // selecionar somente o metodo compare

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}
