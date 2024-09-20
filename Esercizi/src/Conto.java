//Creare una classe ContoCorrente in grado di simulare un conto corrente reale, quindi con versamenti, prelievi
// , stampa saldo e dammi la lista degli ultimi 5 movimenti.

import java.util.ArrayList;

public class Conto {
    private double amount;
    private String owner;
    static int qtConti;
    public Conto(String o, double a) {
        this.owner = o;
        this.amount = a;
        qtConti++;
    }

    public void versamento (double versamento){
        this.amount += versamento;
    }

    public boolean prelievo(double prelievo) {
        if (prelievo > this.amount) {
            System.out.println("La cifra richiesta è superiore a quella disponibile. Operazione annullata");
            return false;
        }
        this.amount -= prelievo;
        System.out.println("Prelievo effettuato, saldo residuo pari a € " + this.amount);
        return true;
    }

    public void saldo() {
        System.out.println("Il tuo saldo è: €" + this.amount);
    }

}
