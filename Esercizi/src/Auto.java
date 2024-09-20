//Progettare una classe che rappresenta una automobile. Ogni automobile è caratterizzata da un:
// consumo di carburante (litri/chilometro),
// quantità di carburante presente nel serbatoio.
//
// Il consumo è indicato specificatamente nel costruttore.
// Inizialmente il serbatoio è vuoto. I metodi della classe sono:
// metodo drive per simulare il percorso di un’automobile per una certa distanza,
//      riducendo di conseguenza il livello di carburante nel suo serbatoio;
// metodo dammiCarburante che ritorna il livello del carburante;
// metodo faiRifornimento, per fare rifornimento.
//
// Il metodo drive non può essere invocato per una distanza maggiore di quella percorribile con il carburante disponibile

public class Auto {
    private String brand;
//    Il consumo è applicato in lt/100km
    private double consumoCarburante;
//    Il carburante è conteggiato in lt.
    private double carburante;

    public Auto(String brand, double consumo) {
        this.brand = brand;
        this.consumoCarburante = consumo;
    }

    public void rifornimento(double c) {
        this.carburante += c;
    }

    public String dammiCarburante() {
        String carburante = "Hai ancora " + this.carburante + " lt di carburante nel serbatoio";
        return carburante;
    }

    public String drive(double km) {
        double kmDesiderati = km;
        double carburanteNecessario = kmDesiderati / this.consumoCarburante;
        String result;
        if (carburanteNecessario > this.carburante) {
            result = "Non hai abbastanza carburante per effetuare questo viaggio. Fare rifornimento.";
            return result;
        }
        result = "Per effettuare questo viaggio consumerai " + carburanteNecessario + "lt di carburante";
        return result;

    }
}
