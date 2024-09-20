//Realizzare la classe Studente che abbia due attributi:
//nome
//anno di nascita
//Di tale classe si implementi i costruttore di default, quello parametrizzato, i metodi get, set ed il metodo toString.
//Implementare la classe TestStudente in cui il metodo main permetta di creare due oggetti:
//Il primo oggetto deve essere creato usando il costruttore di default. L’utente deve inserire i valori da tastiera.
//Il secondo oggetto deve essere creato usando il costruttore parametrizzato. L’utente deve inserire i valori da tastiera.
//Indicare se i due studenti sono coetanei, oppure indicare chi è nato prima.
//Una volta completati i due file si documenti la classe ed i metodi realizzati e rendere il main iterativo

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class Studente {
    private String nome;
    private String dataDiNascita;

    public Studente(String nome, String data) {
        this.nome = nome;
        this.dataDiNascita = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(String dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    @Override
    public String toString() {
        return "Studente" +
                "nome='" + nome + '\'' +
                ", dataDiNascita='" + dataDiNascita + '\'';
    }

    public static void comparaDate(Studente studente1, Studente studente2 ) throws ParseException {
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        Date dataStudente1 = formatoData.parse(studente1.getDataDiNascita());
        Date dataStudente2 = formatoData.parse(studente2.getDataDiNascita());

        if (dataStudente1.before(dataStudente2)) {
            System.out.println("Lo studente di nome " + studente1.getNome() + " è nato prima");
        } else {
            System.out.println("Lo studente di nome " + studente2.getNome() + " è nato prima");
        }
    }
}

