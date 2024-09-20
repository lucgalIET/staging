package ereditarieta;

public class Autostrada {
    public static void main(String[] args) {
//        Es casello
//        Si vuole scrivere un insieme di classi Java che consentano la gestione dei pedaggi di camion presso dei caselli autostradali.
//        I camion devono pagare 5 dollari per ciascun asse piu' 10 dollari per ogni tonnellata di peso.
//        Il casello deve raccogliere i pedaggi e visualizzandoli su video,
//        inoltre periodicamente si dovranno visualizzare il numero di camion passati e l'incasso totale,
//        e contestualmente tali dati dovranno essere azzerati.
//        Individuazione delle classi necessarie a risolvere il problema

//        ------------------------ PT 2
//
//        Utilizzare la classe astratta e l'interfaccia integrandole nel progetto
//        creare un'altra classe figli di Veicolo
//        definire n metodi nell'interfaccia VeicoloInterface comuni a tutti i veicoli



        Truck truck1 = new Truck(3, 4568);
        Casello casello = new Casello();
        casello.calculateToll(truck1);
        System.out.println(casello.getTotalIncome());
        System.out.println(casello.getTrucksSinceCollection());
        casello.checktruck();
        System.out.println("quantità " + casello.getTrucksSinceCollection());
        System.out.println("Income " + casello.getTotalIncome());


    }
}
