package generics_type;

public class Box <T>{

    // T representa 'type'
    private T t;

    // <Tipos Genericos>
    //    E - Elemento (usado extensivamente pelo Java Collections Framework)
    //    K - Chave
    //    N - Número
    //    T - Tipo
    //    V - Valor
    //    S, U, V, etc. - 2º, 3º, 4º tipos

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
}
