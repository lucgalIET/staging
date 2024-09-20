package ereditarieta;

import java.util.Objects;

public class Casello {
   private int receiptsSinceCollection;
   private int trucksSinceCollection;
   private int totalIncome;

    public Casello() {}

    public Casello(int receiptsSinceCollection, int trucksSinceCollection, int totalIncome) {
        this.receiptsSinceCollection = receiptsSinceCollection;
        this.trucksSinceCollection = trucksSinceCollection;
        this.totalIncome = totalIncome;
    }

    public int calculateToll(Truck truck){
       int cost4axels = 5 * truck.getAxels();
       int cost4weight = (int) (Math.round(truck.getPeso() / 1000) * 10);
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

    private void resetIncome() {
       int result = this.totalIncome = 0;
    }

    public int getTotalIncome() {
        return totalIncome;
    }

    public void setReceiptsSinceCollection(int receiptsSinceCollection) {
        this.receiptsSinceCollection = receiptsSinceCollection;
    }

    public void setTrucksSinceCollection(int trucksSinceCollection) {
        this.trucksSinceCollection = trucksSinceCollection;
    }

    public void setTotalIncome(int totalIncome) {
        this.totalIncome = totalIncome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Casello casello = (Casello) o;
        return receiptsSinceCollection == casello.receiptsSinceCollection && trucksSinceCollection == casello.trucksSinceCollection && totalIncome == casello.totalIncome;
    }

    @Override
    public int hashCode() {
        return Objects.hash(receiptsSinceCollection, trucksSinceCollection, totalIncome);
    }

    @Override
    public String toString() {
        return "Casello{" +
                "receiptsSinceCollection=" + receiptsSinceCollection +
                ", trucksSinceCollection=" + trucksSinceCollection +
                ", totalIncome=" + totalIncome +
                '}';
    }
}
