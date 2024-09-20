//La classe Truck dovra' contenere i seguenti metodi:
//- Truck (int axles, int totalWeight)
//- int getAxles ()
//- int getTotalWeight ()
//e le variabili di istanza:
//- int axles;
//- int totalWeight;


public class Truck {

    private int axels;
    private int totalWeight;

    public Truck(int axels, int totalWeight) {
        this.axels = axels;
        this.totalWeight = totalWeight;
    }

    public int getAxels() {
        return axels;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
