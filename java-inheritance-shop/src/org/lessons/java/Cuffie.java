package org.lessons.java;

public class Cuffie extends Prodotto {
    // attributi
    public String colore;
    boolean isWireless;
    boolean isCablate;

    // costruttore
    public Cuffie(int codice, String colore, boolean isWireless, boolean isCablate) {
        // richiamo l'attributo codice da prodotto
        super(codice);
        this.colore = colore;
        this.isWireless = isWireless;
        this.isCablate = isCablate;
    }

    // metodi
    public String getColore() {
        return "il colore delle cuffie è " + colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public boolean getIsWireless() {
        return isWireless;
    }

    public void setIsWireless(boolean isWireless) {
        this.isWireless = isWireless;
    }

    public boolean getIsCablate() {
        return isCablate;
    }

    public void setIsCablate(boolean isCablate) {
        this.isCablate = isCablate;
    }
}
