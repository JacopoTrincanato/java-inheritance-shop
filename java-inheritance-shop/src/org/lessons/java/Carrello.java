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

        Televisori televisore = new Televisori(null, null, null, null, false, 0);

        Cuffie cuffie = new Cuffie(null, null, null, null, null, false, false);

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
    }
}
