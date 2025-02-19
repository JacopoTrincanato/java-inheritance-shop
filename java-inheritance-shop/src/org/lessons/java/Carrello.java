package org.lessons.java;

import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {

        // creo uno scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vuoi inserire un nuovo smartphone, un nuovo televisore o un nuovo paio di cuffie?");

        String opzione = scanner.nextLine();

        Televisori televisore = new Televisori("Apple tv", "Apple", new BigDecimal(700), new BigDecimal(0.22), true,
                60);

        Cuffie cuffie = new Cuffie("Cuffie Galattiche", "JBL", new BigDecimal(70), new BigDecimal(0.22), "nero", true,
                false);

        // controllo che tipo di opzione ha scelto il cliente
        switch (opzione) {
            case "smartphone":
                // creo le variabili con i dati da inserire
                System.out.println("Inserisci il nome");
                String nome = scanner.nextLine();

                System.out.println("Inserisci la marca");
                String marca = scanner.nextLine();

                System.out.println("Inserisci il prezzo");
                BigDecimal prezzo = scanner.nextBigDecimal();

                System.out.println("Inserisci l'iva");
                BigDecimal iva = scanner.nextBigDecimal();
                scanner.nextLine();

                System.out.println("Inserisci l'imeiCode");
                String imeiCode = scanner.nextLine();

                System.out.println("Inserisci la memoria");
                int memoria = scanner.nextInt();

                Smartphone smartphone = new Smartphone(nome, marca, prezzo, iva,
                        imeiCode, memoria);

                System.out.println(smartphone);
                break;

            case "televisore":
                System.out.println(televisore);
                break;

            case "cuffie":
                System.out.println(cuffie);
                break;
        }

        // chiudo lo scanner
        scanner.close();
    }
}
