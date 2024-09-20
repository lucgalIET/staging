//Creare una classe ‘potenza’ , con un campo intero “base”,
// dotata di costruttore che prende in input un numero a e lo salva in base,
// di un metodo pow() che stampi a video la potenza di base
// (ossia stampa il prodotto di base*base),
// e di un metodo cambiobase() che permette di cambiare il campo “base

public class Potenza {
    private int base;

    public Potenza(int b) {
        this.base = b;
    }

    public void pow(){
        int potenza = this.base * this.base;
        System.out.println("La potenza è: " + potenza);
    }

    public void cambiaBase(int b) {
        this.base = b;
    }
}
