//- TollBooth ()
//- void calculateToll (Truck truck)
//- void displayData ()
//- void onReceiptCollection ()
//e le variabili di istanza:
//- int receiptsSinceCollection;
//- int trucksSinceCollection;
//I camion devono pagare 5 dollari per ciascun asse piu' 10 dollari per ogni tonnellata di peso.
//Il casello deve raccogliere i pedaggi e visualizzandoli su video,
//inoltre periodicamente si dovranno visualizzare il numero di camion passati e l'incasso totale,
//e contestualmente tali dati dovranno essere azzerati.
//Individuazione delle classi necessarie a risolvere il problema

public class Casello {
   private int receiptsSinceCollection;
   private int trucksSinceCollection;
   private int totalIncome;

   public int calculateToll(Truck truck){
       int cost4axels = 5 * truck.getAxels();
       int cost4weight = Math.round(truck.getTotalWeight() / 1000) * 10;
       int totale = cost4weight + cost4axels;
       this.totalIncome += totale;
       this.receiptsSinceCollection++;
       this.trucksSinceCollection++;
       return totale;
   }

    public int getReceiptsSinceCollection() {
        return receiptsSinceCollection;
    }

    public int getTrucksSinceCollection() {
        return trucksSinceCollection;
    }
    public int checktruck() {
    int numtruks = this.trucksSinceCollection;
    this.totalIncome = 0;
    this.trucksSinceCollection = 0;
    this.resetIncome();
    return numtruks;
    }

    private int resetIncome() {
       int result = this.totalIncome = 0;
       return result;
    }

    public int getTotalIncome() {
        return totalIncome;
    }

}
