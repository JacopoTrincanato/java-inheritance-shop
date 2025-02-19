package org.lessons.java;

import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {

        // creo uno scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vuoi inserire un nuovo smartphone, un nuovo televisore o un nuovo paio di cuffie?");

        String opzione = scanner.nextLine();

        // controllo che tipo di opzione ha scelto il cliente
        switch (opzione) {
            case "smartphone":
                Smartphone smartphone = new Smartphone(null, null, null, null, null, 0);
                break;
            case "televisore":
                Televisori televisore = new Televisori(null, null, null, null, false, 0);
                break;

            case "cuffie":
                Cuffie cuffie = new Cuffie(null, null, null, null, null, false, false);
                break;
        }
    }
}
