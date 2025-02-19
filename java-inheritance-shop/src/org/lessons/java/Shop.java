package org.lessons.java;

import java.math.BigDecimal;

public class Shop {
    public static void main(String[] args) {

        // creo un paio di cuffie
        Cuffie cuffie = new Cuffie("cuffie soniche", "JBL", new BigDecimal(123), new BigDecimal(0.22), "blu", true,
                false);

        System.out.println(cuffie.getCodice());

        // creo uno smartphone
        Smartphone smartphone = new Smartphone("iPhone 30", "Apple", new BigDecimal(21569), new BigDecimal(0.22),
                "546215982336754", 512);

        System.out.println(smartphone.getImeiCode());

        // creo uno televisore
        Televisori televisore = new Televisori("LG TV", "LG", new BigDecimal(765), new BigDecimal(0.22), true, 40);

        System.out.println(televisore.getDimensioni());

    }
}
