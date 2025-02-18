package org.lessons.java;

import java.math.BigDecimal;

public class Televisori extends Prodotto {
    // attributi
    private int dimensioni;
    private boolean isSmart;

    // costruttore
    public Televisori(String nome, String marca, BigDecimal prezzo, BigDecimal iva, boolean isSmart, int dimensioni) {
        // richiamo l'attributo codice da prodotto
        super(nome, marca, prezzo, iva);
        this.dimensioni = dimensioni;
        this.isSmart = isSmart;

    }

    // metodi
    public String getDimensioni() {
        return "le dimesioni del televisore sono " + dimensioni + " pollici";
    }

    public void setDimensioni(int dimensioni) {
        this.dimensioni = dimensioni;
    }

    public boolean getIsSmart() {
        return isSmart;
    }

    public void setIsSmart(boolean isSmart) {
        this.isSmart = isSmart;
    }

}
