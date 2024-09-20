package ereditarieta;

public abstract class VeicoloAbstract {

    private double peso;
    private String marca;
    private String modello;
    private int anno;
    private String targa;
    private String alimentazione;


//    costruttori
    public VeicoloAbstract() {
    }

    public VeicoloAbstract(double peso, String marca, String modello, int anno, String targa, String alimentazione) {
        this.peso = peso;
        this.marca = marca;
        this.modello = modello;
        this.anno = anno;
        this.targa = targa;
    }


//    getter & setter
        public double getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getAlimentazione() {
        return alimentazione;
    }

    public void setAlimentazione(String alimentazione) {
        this.alimentazione = alimentazione;
    }
}
