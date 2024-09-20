package ereditarieta;

public interface VeicoloInterface {
//     non ha attributi
//     non puo' avere istanze / non puo' essere istanziata
//    non ha metodi concreti -> solo astratti (fino a java 8 [escluso])
//    i metodi public abstract non ho il body

    double siMuove();
    VeicoloAbstract accelera(int x);


//    java 8 ->
    static void metodo() {
        System.out.println("Ciao");
    }

    default void metodo2() {
        System.out.println("Sono di default");
    }

}
