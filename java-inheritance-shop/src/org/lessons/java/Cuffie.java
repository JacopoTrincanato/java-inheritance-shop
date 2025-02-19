package org.lessons.java;

import java.math.BigDecimal;

public class Cuffie extends Prodotto {
    // attributi
    private String colore;
    private boolean isWireless;
    private boolean isCablate;

    // costruttore
    public Cuffie(String nome, String marca, BigDecimal prezzo, BigDecimal iva, String colore, boolean isWireless,
            boolean isCablate) {
        // richiamo l'attributo codice da prodotto
        super(nome, marca, prezzo, iva);
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

    // override
    @Override
    public String toString() {
        return String.format(
                "Nome cuffie: %s, Marca cuffie: %s, Prezzo: %s, Colore: %s, isWireless: %s, isCablate: %s",
                this.nome, this.marca, this.prezzo, this.colore, this.isWireless, this.isCablate);
    }
}
