import java.lang.invoke.SwitchPoint;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);


//        Es1
        //Scrivi un programma che richieda all'utente di inserire due numeri interi e due numeri decimali.
        //Il programma deve sommare i numeri interi e i numeri decimali separatamente,
        // convertendo i numeri interi in numeri decimali tramite casting, e poi stampare il risultato.


        // Richiedi all'utente di inserire due numeri interi
//        System.out.print("Inserisci il primo numero intero: ");
//        int primoIntero = scanner.nextInt();
//        System.out.print("Inserisci il secondo numero intero: ");
//        int secondoIntero = scanner.nextInt();


//        // Richiedi all'utente di inserire due numeri decimali
//        System.out.print("Inserisci il primo numero decimale: ");
//        double primoDecimale = scanner.nextDouble();
//        System.out.print("Inserisci il secondo numero decimale: ");
//        double secondoDecimale = scanner.nextDouble();
//
////        Somma dei numeri interi trasformandoli in decimali
//        double sommaInteri = (double) primoIntero + (double) secondoIntero;
////        somma dei numeri decimali
//        double sommaDecimali = primoDecimale + secondoDecimale;
//
////        stampa dei risultati
//        System.out.println("La somma dei numeri interi trasformatiin decimale è " + sommaInteri);
//        System.out.println("La somma dei numeri decimali è " + sommaDecimali);
//
//        Es2
////        Scrivi un programma che prenda in input una stringa e determini se la parola inserita è "ciao",
////        "arrivederci", o "salve", utilizzando un costrutto if-else o switch.
//
//        System.out.print("Inserisci una parola tra 'ciao' 'arrivederci' o 'salve'");
//        String parolaRicevuta = scanner.next();

//        if (parolaRicevuta.equals("ciao")) {
//            System.out.println("Hai scelto " + parolaRicevuta);
//        } else if (parolaRicevuta.equals("arrivaderci")) {
//            System.out.println("Hai scelto " + parolaRicevuta);
//
//        } else if (parolaRicevuta.equals("arrivaderci")) {
//            System.out.println("Hai scelto " + parolaRicevuta);
//        }

//        switch (parolaRicevuta) {
//            case "ciao":
//                System.out.println("Hai scelto " + parolaRicevuta);
//                break;
//            case "arrivederci":
//                System.out.println("Hai scelto " + parolaRicevuta);
//                break;
//            case "salve":
//                System.out.println("Hai scelto " + parolaRicevuta);
//                break;
//
//        }

//        Es3
//        Scrivi un programma che stampi i numeri da 1 a 50,
//        ma salti i numeri divisibili per 3 (usando continue) e si fermi completamente se arriva al numero 40
//        (usando break).

//

//
//        String[] centri = {"Giuseppe", "7", "Alessio", "5", "Claudio", "10"};
//        String migliorGiocatore = "";
//        int maxCentri = 0;
//
//        for (int i = 0; i < centri.length; i += 2) {
//            int numeroCentri = Integer.parseInt(centri[i + 1]);
//
//
//            if (numeroCentri > maxCentri) {
//                migliorGiocatore = centri[i];
//                maxCentri = numeroCentri;
//            }
//        }
//
//        System.out.println("Il giocatore migliore è stato " + migliorGiocatore + " con " + maxCentri + " centri.");

//        EsercizioCicli.counter();
//        EsercizioCicli.maxNumArray();
//        EsercizioCicli.sumOfArray();
//        EsercizioCicli.invertArray();
//        EsercizioCicli.getTabelline();
//        EsercizioCicli.getApp();
//        EsercizioCicli.findNumber();
//        EsercizioCicli.calcMedia();
//        EsercizioCicli.calcVocali();
//        EsercizioCicli.isPalindroma();
//        EsercizioCicli.stampaMatrice();
//        EsercizioCicli.findHigher();
//        EsercizioCicli.findMaxElement();
//        EsercizioCicli.sum();
//        EsercizioCicli.columnSum();
//        EsercizioCicli.diagonalSum();
//        EsercizioCicli.position();
//        EsercizioCicli.isSimmetric();

//        Es classe potenza
//        Potenza potenza = new Potenza(25);
//        potenza.cambiaBase(3);
//        potenza.pow();


//        Es classe Conto
//        Conto conto = new Conto("Anna", 35000.59);
//        conto.versamento(12000);
//        conto.saldo();
//        System.out.println(Conto.qtConti);


//        Es classe Auto
//        Auto auto = new Auto("bmw", 15.4);
//        auto.rifornimento(30);
//        System.out.println(auto.dammiCarburante());
//        System.out.println(auto.drive(600));

//        Es classe studente
        Studente studente1 = new Studente("Anna", "06/03/2001");
        Studente studente2 = new Studente("Gianni", "25/08/2000");

        Studente.comparaDate(studente1, studente2);


    }


}