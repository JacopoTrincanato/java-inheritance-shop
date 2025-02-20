//fai sempre l'override del metodo toString per stampare in maniera chiara le informazioni

package org.lessons.java;

import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {

        // creo uno scanner
        Scanner scanner = new Scanner(System.in);

        // creo un arrayList carrello dove salvare i prodotti
        Prodotto[] carrello = new Prodotto[3];

        // ciclo all'interno del carrello per aggiungere gli elementi
        for (int i = 0; i < carrello.length; i++) {

            // mostro a schermo la domanda iniziale
            System.out.println("Vuoi inserire un nuovo smartphone, un nuovo televisore o un nuovo paio di cuffie?");

            // creo una variabile che permetta all'utente di scegliere l'opzione
            String opzione = scanner.nextLine();

            // creo le variabili con i dati della classe prodotto da inserire
            System.out.println("Inserisci il nome");
            String nome = scanner.nextLine();

            System.out.println("Inserisci la marca");
            String marca = scanner.nextLine();

            System.out.println("Inserisci il prezzo");
            BigDecimal prezzo = scanner.nextBigDecimal();

            System.out.println("Inserisci l'iva");
            BigDecimal iva = scanner.nextBigDecimal();
            scanner.nextLine();

            // controllo che tipo di opzione ha scelto il cliente e in base a quello stampo
            // il modello di inserimento dati
            switch (opzione) {

                case "smartphone":

                    // creo le variabili con i dati della classe Smartphone da inserire
                    System.out.println("Inserisci l'imeiCode");
                    String imeiCode = scanner.nextLine();

                    System.out.println("Inserisci la memoria");
                    int memoria = scanner.nextInt();
                    scanner.nextLine();

                    Smartphone smartphone = new Smartphone(nome, marca, prezzo, iva,
                            imeiCode, memoria);

                    // indico che lo smartphone è uguale ad un elemento del carrello
                    carrello[i] = smartphone;

                    break;

                case "televisore":

                    // creo le variabili con i dati della classe Televisori da inserire
                    System.out.println("Inserisci se è smart scegliendo tra true e false");
                    boolean isSmart = scanner.nextBoolean();

                    System.out.println("Inserisci la dimensioni");
                    int dimensioni = scanner.nextInt();
                    scanner.nextLine();

                    Televisori televisore = new Televisori(nome, marca, prezzo, iva,
                            isSmart, dimensioni);

                    // indico che il televisore è uguale ad un elemento del carrello
                    carrello[i] = televisore;

                    break;

                case "cuffie":

                    // creo le variabili con i dati della classe Cuffie da inserire
                    System.out.println("Inserisci il colore");
                    String coloreCuffie = scanner.nextLine();

                    System.out.println("Inserisci se sono wireless o meno scegliendo tra true e false");
                    boolean isWireless = scanner.nextBoolean();

                    System.out.println("Inserisci se sono cablate o meno scegliendo tra true e false");
                    boolean isCablate = scanner.nextBoolean();
                    scanner.nextLine();

                    Cuffie cuffie = new Cuffie(nome, marca, prezzo, iva,
                            coloreCuffie, isWireless, isCablate);

                    // indico che le cuffie sono uguali ad un elemento del carrello
                    carrello[i] = cuffie;

                    break;
            }

        }

        // chiudo lo scanner
        scanner.close();

        // ciclo all'interno del carrello per stampare gli elementi
        for (int i = 0; i < carrello.length; i++) {
            System.out.println(carrello[i]);
        }

    }
}
