package ereditarieta;

import java.util.Objects;

public class Truck extends VeicoloAbstract implements VeicoloInterface{

    private int axels;
    boolean inMovement;
    String alimentazione;


    //    costruttori
    public Truck(int axels) {
        this.axels = axels;
    }

    public Truck(double peso, String marca, String modello, int anno, String targa, String alimentazione, int axels) {

        super(peso, marca, modello, anno, targa, alimentazione);
        this.axels = axels;
    }

    //    getter & setter
    public int getAxels() {
        return axels;
    }
    public void setAxels(int axels) {

        this.axels = axels;
    }

    //    hash & equals methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Truck truck = (Truck) o;
        return axels == truck.axels;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(axels);
    }


//    override interface
    @Override
    public void avvia() {
        this.inMovement = true;
    }

    @Override
    public void ferma() {
        this.inMovement = false;
    }




}
