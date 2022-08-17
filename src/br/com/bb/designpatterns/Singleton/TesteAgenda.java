package br.com.bb.designpatterns.Singleton;

public class TesteAgenda {

    public static void main(String[] args) {
        /*Agenda agenda = new Agenda();
        agenda.ocupa("Segunda");
        agenda.ocupa("Terca");
        System.out.println(agenda.getDiasDisponiveis());*/

        reservaDia("Segunda");
        reservaDia("Terca");
        reservaDia("Sabado");
    }

    public static void reservaDia(String dia){
        Agenda agenda = new Agenda();
        agenda.ocupa(dia);
        System.out.println(agenda.getDiasDisponiveis());
    }


}
