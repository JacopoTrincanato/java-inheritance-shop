package org.lessons.java;

import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {

        // creo uno scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vuoi inserire un nuovo smartphone, un nuovo televisore o un nuovo paio di cuffie?");

        String opzione = scanner.nextLine();

        Smartphone smartphone = new Smartphone("Galaxy s4", "Samsung", new BigDecimal(300), new BigDecimal(0.22),
                "123456789012345", 32);

        Televisori televisore = new Televisori("Apple tv", "Apple", new BigDecimal(700), new BigDecimal(0.22), true,
                60);

        Cuffie cuffie = new Cuffie("Cuffie Galattiche", "JBL", new BigDecimal(70), new BigDecimal(0.22), "nero", true,
                false);

        // controllo che tipo di opzione ha scelto il cliente
        switch (opzione) {
            case "smartphone":
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
