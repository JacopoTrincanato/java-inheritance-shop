package org.lessons.java;

public class Smartphone extends Prodotto {

    // attributi
    public String imeiCode;
    public int quantitaMemoria;

    // costruttore
    public Smartphone(int codice, String imeiCode, int quantitaMemoria) {
        // richiamo l'attributo codice da prodotto
        super(codice);
        this.imeiCode = imeiCode;
        this.quantitaMemoria = quantitaMemoria;

    }

    // metodi
    public String getImeiCode() {
        return "l'imeiCode dello smartphone è " + imeiCode;
    }

    public void setImeiCode(String imeiCode) {
        this.imeiCode = imeiCode;
    }

    public String getQuantitaMemoria() {
        return "la Quantità di memoria dello smartphone è " + quantitaMemoria + " GB";
    }

    public void setQuantitaMemoria(int quantitaMemoria) {
        this.quantitaMemoria = quantitaMemoria;
    }
}
