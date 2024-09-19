import java.lang.reflect.Array;
import java.util.*;

public class EsercizioCicli {

    //        Modificare il codice in modo da inserire in due array
//        rispettivamente i numeri pari e i numeri dispari, tra 0 e 50
    public static void counter() {
        for (int i = 50; i > 0; i--) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }

    //
//        Es 4
//        Scrivi un metodo che prenda in input un array di 5 numeri interi e implementi un metodo per trovare
//        il massimo valore nell'array. Il risultato deve essere stampato dal main
    public static void maxNumArray() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeri = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Inserisci un numero intero");
            int num = scanner.nextInt();
            numeri.add(num);
        }
        Integer maxNum = numeri.get(0);
        for (int i = 1; i < numeri.size(); i++) {
            if (numeri.get(i) > maxNum)
                maxNum = numeri.get(i);

        }
        System.out.println("Il numero maggiore nell'Array è " + maxNum);

    }


//    Es 5
//    Scrivi un metodo che prenda in input un array di 5 numeri interi e calcoli
//    la somma di tutti gli elementi dell'array. Stampa poi il risultato dal main.

    public static void sumOfArray() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeri = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Inserisci un numero intero");
            Integer num = scanner.nextInt();
//
            numeri.add(num);
        }
        Integer sum = 0;
        for (Integer integer : numeri) {
            sum += integer;
        }

        System.out.println("La somma dei numeri è " + sum);
    }

    //    Es 6
//    Scrivi un programma che prenda in input un array di 5 numeri interi e stampi l'array in ordine inverso.
    public static void invertArray() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeri = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Inserisci un numero intero");
            Integer num = scanner.nextInt();
//
            numeri.add(num);
        }

        int[] b = new int[numeri.size()];
        int j = numeri.size();
        for (int i = 0; i < numeri.size(); i++) {
            b[j - 1] = numeri.get(i);
            j = j - 1;
        }

        // stampa dell'array invertito
        System.out.println("L'array invertito è:");
        for (int k = 0; k < numeri.size(); k++) {
            System.out.print(b[k] + " ");
        }
    }
//    Es7
//    Scrivere un programma TabellineAritmetiche che chiede in ingresso
//    all’utente un numero intero da memorizzare nella variabile n e visualizza
//    in uscita la tabellina aritmetica del numero stesso.
//    Se ad esempio il numero inserito è 5 le righe visualizzate devono essere

    public static void getTabelline() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il numero da moltiplicare");
        int num = scanner.nextInt();

        System.out.println("La tabellina del " + num + "è:");
        for (int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.println(num + " X " + i + " = " + result);
        }
    }

//    Es8
//    Realizzare un programma che acquisisca da tastiera (standard input)
//    10 valori numerici interi e li elabori in base alle seguenti indicazioni.
//    1) Ciascuno dei valori rappresenta il numero di download relativi ad un'applicazione
//    presente nel famoso Prof Store.
//
//    2) A seconda del numero di download, un’applicazione viene associata ad una delle
//    seguenti categorie:
//      Categoria Gold: numero di download superiori a 2 milioni;
//      Categoria Silver: numero di download compresi tra 500 mila e 2 milioni;
//      Categoria Bronze: numero di download inferiori a 500 mila.
//
//    3) Il programma deve visualizzare sullo schermo (standard output) il numero
//    di applicazioni appartenenti a ciascuna delle tre categorie.

    //
    public static void getApp() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> apps = new ArrayList<>();
        ArrayList<Integer> gold = new ArrayList<>();
        ArrayList<Integer> silver = new ArrayList<>();
        ArrayList<Integer> bronze = new ArrayList<>();

        System.out.println("Inserisci il dumero di download della appliacazione n. 1");
        Integer app1 = scanner.nextInt();
        apps.add(app1);

        System.out.println("Inserisci il dumero di download della appliacazione n. 2");
        Integer app2 = scanner.nextInt();
        apps.add(app2);

        System.out.println("Inserisci il dumero di download della appliacazione n. 3");
        Integer app3 = scanner.nextInt();
        apps.add(app3);

        System.out.println("Inserisci il dumero di download della appliacazione n. 4");
        Integer app4 = scanner.nextInt();
        apps.add(app4);

        System.out.println("Inserisci il dumero di download della appliacazione n. 5");
        Integer app5 = scanner.nextInt();
        apps.add(app5);

        System.out.println("Inserisci il dumero di download della appliacazione n. 6");
        Integer app6 = scanner.nextInt();
        apps.add(app6);

        System.out.println("Inserisci il dumero di download della appliacazione n. 7");
        Integer app7 = scanner.nextInt();
        apps.add(app7);

        System.out.println("Inserisci il dumero di download della appliacazione n. 8");
        Integer app8 = scanner.nextInt();
        apps.add(app8);

        System.out.println("Inserisci il dumero di download della appliacazione n. 9");
        Integer app9 = scanner.nextInt();
        apps.add(app9);

        System.out.println("Inserisci il dumero di download della appliacazione n. 10");
        Integer app10 = scanner.nextInt();
        apps.add(app10);

        for (Integer app : apps) {
            if (app > 2_000_000) {
                gold.add(app);
            } else if (app <= 2_000_000 && app >= 500_000) {
                silver.add(app);
            } else if (app < 500_000) {
                bronze.add(app);
            }
        }

        System.out.println("Il numero di app nella categoria Gold è : " + gold.size());
        System.out.println("Il numero di app nella categoria Silver è : " + silver.size());
        System.out.println("Il numero di app nella categoria Bronze è : " + bronze.size());

    }

//    Es9
//    Scrivi un metodo che prenda in input dei numeri interi da inserire
//    in un array; dopodiche' chiede all'utente un numero da cercare e
//    , se presente, ne restituisce l'indice.

    public static void findNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanti numeri vuoi inserire?");
        Integer[] numeri = new Integer[scanner.nextInt()];

        for (int i = 0; i < numeri.length; i++) {
            System.out.println("Inserisci il " + (i + 1) + "° numero");
            numeri[i] = scanner.nextInt();
        }
        System.out.println("inserisci il numero da cercare");
        Integer numDaCercare = scanner.nextInt();
        boolean check = false;
        int indiceNum = 0;

        for (int i = 0; i < numeri.length; i++) {
            if (numeri[i] == numDaCercare) {
                check = true;
                indiceNum = i;
                break;
            }
        }

        if (check) {
            System.out.println("L'indice del tuo numero è: " + indiceNum);
        } else {
            System.out.println("Nessuna corrispondenza trovata");
        }

    }

//    Es 10
//    Scrivi un metodo che prenda in input un array di n numeri interi e Calcola
//    la media dei valori presenti nell'array

    public static void calcMedia() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanti numeri vuoi inserire?");
        int n = scanner.nextInt();
        Integer[] numeri = new Integer[n];

        for (int i = 0; i < numeri.length; i++) {
            System.out.println("Inserisci il " + (i + 1) + "° numero");
            numeri[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int e : numeri) {
            sum += e;
        }

        int media = sum / n;
        System.out.println("la media dei valori presenti è: " + media);

    }

//    Es 11
//    Scrivi un programma che prenda in input una stringa e restituisca il numero
//    di vocali presenti.

    public static void calcVocali() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci le tue parole");
        char[] frase = scanner.nextLine().toLowerCase().trim().toCharArray();

        String vocali = "aeiouy";
        char[] vocaliChar = vocali.toCharArray();
        int count = 0;

        for (char lettera : frase) {
            for (char e : vocaliChar) {
                if (e == lettera)
                    count++;
            }
        }
        System.out.println("Le vocali presenti nella tua frase sono: " + count);
    }

//    Es 12
//    Scrivi un programma che verifichi se una stringa è un palindromo

    public static void isPalindroma() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la tua parola");
        String parola = scanner.next();

        int left = 0;
        int right = parola.length() - 1;
        boolean isPalindroma = false;

//        for (int i = 0; i < parola.length(); i++) {
//            if (parola.charAt(left) != parola.charAt(right)) {
//                isPalindroma = false;
//                break;
//            }
//            left++;
//            right--;
//            isPalindroma = true;
//        }

        while (left < right) {
            if (parola.charAt(left) != parola.charAt(right)) {
                isPalindroma = false;
                break;
            }
            left++;
            right--;
            isPalindroma = true;
        }

        if (isPalindroma) {
            System.out.println("La tua parola è palindroma");
        } else {
            System.out.println("La tua parola non è palindroma");
        }
    }

//Es 12
//    stampare la somma di tutti gli elementi della matrice

    public static void stampaMatrice() {
        int[][] matrice = {{1, 2, 3,}, {12, 3, 67}, {34, 5, 98}};
        int count = 0;
        for (int[] x : matrice) {
            for (int y : x) {
                count += y;
            }
        }
        System.out.println("la somma dei numeri è: " + count);
    }

//    Es 13
//    trovare il massimo elemento della matrice

    public static void findHigher() {
        int[][] matrice = {{1, 2, 3,}, {12, 3, 67}, {34, 5, 98}};
        int maxNum = 0;
        for (int[] x : matrice) {
            for (int y : x) {
                if (y > maxNum)
                    maxNum = y;
            }
        }
        System.out.println("Il numero maggiore è: " + maxNum);
    }

//    Es 14
//    trovare il massimo elemento della diagonale principale
//    (assumendo che la matrice sia quadrata)

    public static void findMaxElement() {
        int[][] matrice = {{5, 2, 3}, {2, 6, 8}, {3, 96, 34}};
        for (int[] x : matrice) {
            System.out.println(Arrays.toString(x));
        }


        int index = 0;
        for (int[] x : matrice) {
            System.out.println();
            int num = x[index];
            System.out.print(num);
            index++;
        }
    }

//    Es 15
//    separatamente per ciascuna riga,
//    stampare la somma degli elementi della riga

    public static void sum() {
        int[][] matrice = {{5, 2, 3}, {2, 6, 8}, {3, 96, 34}};
        int count = 0;
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                count += matrice[i][j];
            }
            System.out.println(count);
            count = 0;
        }

    }

//    Es 16
//    separatamente per ciascuna colonna,
//    stampare la somma degli elementi della colonna

    public static void columnSum() {
        int[][] matrice = {{5, 2, 3}, {2, 6, 8}, {3, 96, 34}};
        int count = 0;
        int index = 0;
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                count += matrice[index][i];
                index++;

            }
            System.out.println(count);
            index = 0;
            count = 0;
        }

    }
    //        Es 17
//        stampare la somma di tutti gli elementi sulla diagonale principale
//        (assumendo che la matrice sia quadrata)

    public static void diagonalSum() {
        int[][] matrice = {{5, 2, 3}, {2, 6, 8}, {3, 96, 34}};
        for (int[] x : matrice) {
            System.out.println(Arrays.toString(x));
        }


        int index = matrice.length - 1;
        int sum = 0;
        for (int[] x : matrice) {
            System.out.println();
            int num = x[index];
            sum += num;
            index--;
        }
        System.out.print(sum);
    }

//    ES 18
//    stampare la posizione (riga e colonna) dell’elemento massimo

    public static void position() {
        int[][] matrice = {{5, 20, 300}, {2000, 6, 8}, {3, 960, 34}};
        for (int[] x : matrice) {
            System.out.println(Arrays.toString(x));
        }

        int riga = 1;
        int colonna = 1;
        int maxNum = 0;
        for (int i = 0; i < matrice.length; i++) {
            System.out.println();
            for (int j = 0; j < matrice[i].length; j++) {
                if (matrice[i][j] > maxNum) {
                    maxNum = matrice[i][j];
                    riga = i + 1;
                    colonna = j + 1;
                }
            }
        }
        System.out.println("colonna " + colonna + ", Riga " + riga);
    }

//    Es 19
//    verificare se la matrice (che si assume quadrata) è simmetrica

    public static void isSimmetric() {
        int[][] matrice = {{1, 2, 3}, {2, 4, 5}, {3, 5, 6}};
        boolean isSimmetric = true;
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice.length; j++) {
                if (matrice[i][j] != matrice[j][i]) {
                    isSimmetric = false;
                    break;
                }
            }
        }

        if (isSimmetric) {
            System.out.println("La matrice è simmetrica");
        } else {
            System.out.println("La matrice non è simmetrica");
        }
    }

}