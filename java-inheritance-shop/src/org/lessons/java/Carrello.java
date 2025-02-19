package org.lessons.java;

import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {

        // creo uno scanner
        Scanner scanner = new Scanner(System.in);

        // mostro a schermo la domanda iniziale
        System.out.println("Vuoi inserire un nuovo smartphone, un nuovo televisore o un nuovo paio di cuffie?");

        // creo una variabile che permetta all'utente di scegliere l'opzione
        String opzione = scanner.nextLine();

        // creo un array carrello dove salvare i prodotti
        Prodotto[] carrello = new Prodotto[0];

        // creo un nuovo carrello lungo come quello originale + 1
        Prodotto[] carrelloAggiornato = new Prodotto[carrello.length + 1];

        // copio il carrello originale nel nuovo, prodotto per prodotto
        for (int i = 0; i < carrello.length; i++) {
            carrelloAggiornato[i] = carrello[i];
        }

        // controllo che tipo di opzione ha scelto il cliente e in base a quello stampo
        // il modello di inserimento dati
        switch (opzione) {

            case "smartphone":

                // creo le variabili con i dati da inserire
                System.out.println("Inserisci il nome");
                String nomeTelefono = scanner.nextLine();

                System.out.println("Inserisci la marca");
                String marcaTelefono = scanner.nextLine();

                System.out.println("Inserisci il prezzo");
                BigDecimal prezzoTelefono = scanner.nextBigDecimal();

                System.out.println("Inserisci l'iva");
                BigDecimal ivaTelefono = scanner.nextBigDecimal();
                scanner.nextLine();

                System.out.println("Inserisci l'imeiCode");
                String imeiCode = scanner.nextLine();

                System.out.println("Inserisci la memoria");
                int memoria = scanner.nextInt();

                Smartphone smartphone = new Smartphone(nomeTelefono, marcaTelefono, prezzoTelefono, ivaTelefono,
                        imeiCode, memoria);

                System.out.println(smartphone);

                // aggiungo l'ultimo prodotto alla fine
                carrelloAggiornato[carrelloAggiornato.length - 1] = smartphone;

                // sovrascrivo il carrello originale con quello aggiornato
                carrello = carrelloAggiornato;

                break;

            case "televisore":

                // creo le variabili con i dati da inserire
                System.out.println("Inserisci il nome");
                String nomeTelevisore = scanner.nextLine();

                System.out.println("Inserisci la marca");
                String marcaTelevisore = scanner.nextLine();

                System.out.println("Inserisci il prezzo");
                BigDecimal prezzoTelevisore = scanner.nextBigDecimal();

                System.out.println("Inserisci l'iva");
                BigDecimal ivaTelevisore = scanner.nextBigDecimal();
                scanner.nextLine();

                System.out.println("Inserisci se è smart scegliendo tra true e false");
                boolean isSmart = scanner.nextBoolean();

                System.out.println("Inserisci la dimensioni");
                int dimensioni = scanner.nextInt();

                Televisori televisore = new Televisori(nomeTelevisore, marcaTelevisore, prezzoTelevisore, ivaTelevisore,
                        isSmart, dimensioni);

                System.out.println(televisore);

                // aggiungo l'ultimo prodotto alla fine
                carrelloAggiornato[carrelloAggiornato.length - 1] = televisore;

                break;

            case "cuffie":

                // creo le variabili con i dati da inserire
                System.out.println("Inserisci il nome");
                String nomeCuffie = scanner.nextLine();

                System.out.println("Inserisci la marca");
                String marcaCuffie = scanner.nextLine();

                System.out.println("Inserisci il prezzo");
                BigDecimal prezzoCuffie = scanner.nextBigDecimal();

                System.out.println("Inserisci l'iva");
                BigDecimal ivaCuffie = scanner.nextBigDecimal();
                scanner.nextLine();

                System.out.println("Inserisci il colore");
                String coloreCuffie = scanner.nextLine();

                System.out.println("Inserisci se sono wireless o meno scegliendo tra true e false");
                boolean isWireless = scanner.nextBoolean();

                System.out.println("Inserisci se sono cablate o meno scegliendo tra true e false");
                boolean isCablate = scanner.nextBoolean();

                Cuffie cuffie = new Cuffie(nomeCuffie, marcaCuffie, prezzoCuffie, ivaCuffie,
                        coloreCuffie, isWireless, isCablate);

                System.out.println(cuffie);

                // aggiungo l'ultimo prodotto alla fine
                carrelloAggiornato[carrelloAggiornato.length - 1] = cuffie;

                break;
        }

        // chiudo lo scanner
        scanner.close();
    }
}
