package org.lessons.java;

public class Televisori extends Prodotto {
    // attributi
    public int dimensioni;
    public boolean isSmart;

    // costruttore
    public Televisori(int codice, boolean isSmart, int dimensioni) {
        // richiamo l'attributo codice da prodotto
        super(codice);
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
