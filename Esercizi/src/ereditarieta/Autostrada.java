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



        Truck truck1 = new Truck(4568.34, "Iveco", "Daily", 2018, "GE189YD", "Diesel", 3);
        Truck truck2 = new Truck(44568.34, "Mercedes", "Benz", 2020, "jE129DF", "Metano", 4);
        Casello casello = new Casello();

//        calcolo del prezzo da pagare
        truck1.avvia();
        boolean inViaggio = truck1.inMovement;
        if (inViaggio) {
            int prezzotruck1 = casello.calculateToll(truck1);
        System.out.println("Il prezzo da pagare è: " + prezzotruck1 + "€");
        }
//        int prezzotruck2 = casello.calculateToll(truck2);
////        System.out.println("Il prezzo da pagare è: " + prezzotruck2 + "€");

//        controllo l'incasso totale
        System.out.println("L'incasso totale è:  " + casello.getTotalIncome() + "€");

//        controllo la quantità di veicoli transitati
        System.out.println("I veicoli transitati sono: " + casello.getTrucksSinceCollection());

//        controllo la quantità deiveicoli passati e l'incasso totale, dopodichè l azzero
//        int totalePassaggi =  casello.checktruck();
//        System.out.println("Il numero dei passaggi è: " + totalePassaggi);



    }
}
