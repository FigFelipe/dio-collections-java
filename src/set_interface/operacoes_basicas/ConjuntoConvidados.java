package set_interface.operacoes_basicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    // Atributos
    private Set<Convidado> convidadoSet;

    // Construtor
    public ConjuntoConvidados(){
        this.convidadoSet = new HashSet<>();
    }

    // Metodos
    public void adicionarConvidado(String nome, int codigoConvite){

        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorConvite(int codigoConvite){

        // Interface SET nao aceita elementos iguais

        // Criando um novo objeto do tipo 'Convidado' com nome de'convidadoParaRemover'
        Convidado convidadoParaRemover = null;

        // Percorrendo o set de 'ConvidadosSet'
        for(Convidado c : convidadoSet){

            // Se o atributo 'getCodigoConvite' do objeto 'c' do tipo 'Convidado' foi igual
            // ao parametro 'int codigoConvite', entao
            if(c.getCodigoConvite() == codigoConvite){

                // Atribuir o objeto 'c' ao objeto 'convidadoParaRemover'
                convidadoParaRemover = c;
                break;
            }
        }

        // Removendo o objeto 'convidadoParaRemover' do SET Interface
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){

        return convidadoSet.size();
    }

    public void exibirConvidados(){

        System.out.println(convidadoSet);
    }
}
