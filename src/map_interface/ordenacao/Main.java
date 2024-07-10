package map_interface.ordenacao;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {

        // Instanciando um novo objeto 'AgendaEventos'
        AgendaEventos agendaEventos = new AgendaEventos();

        // Adicionando objetos 'Evento' ao conjunto ao HashMap do construtor 'AgendaEventos'
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia", "Palestrante renomado");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
        agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação", "Competição de soluções criativas");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");

        // Exibindo os eventos de forma ordenada (utilizar o treeMap)
       agendaEventos.exibirAgenda();

       // Verificar o proximo evento
        agendaEventos.exibirProximoEvento();

    }
}
