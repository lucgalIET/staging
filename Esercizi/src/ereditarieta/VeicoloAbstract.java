package ereditarieta;

public abstract class VeicoloAbstract {

    public int x;
    private double y;

    public VeicoloAbstract() {
    }

    public VeicoloAbstract(int x, double y) {
        this.x = x;
        this.y = y;
    }

    public void somma(int x, int y) {

    }

    public abstract void sottr(int x, int y);

}
