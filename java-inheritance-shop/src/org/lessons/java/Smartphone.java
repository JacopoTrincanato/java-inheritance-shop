package org.lessons.java;

public class Smartphone extends Prodotto {

    // attributi
    String imeiCode;
    int quantitaMemoria;

    // costruttore
    public Smartphone(int codice, String imeiCode, int quantitaMemoria) {
        // richiamo l'attributo codice da prodotto
        super(codice);
        this.imeiCode = imeiCode;
        this.quantitaMemoria = quantitaMemoria;

    }

    // metodi
    public String getImeiCode() {
        return "l'imeiCode del prodotto è " + imeiCode;
    }

    public void setImeiCode(String imeiCode) {
        this.imeiCode = imeiCode;
    }

    public String getQuantitaMemoria() {
        return "la Quantità di memoria del prodotto è " + quantitaMemoria + " GB";
    }

    public void setQuantitaMemoria(int quantitaMemoria) {
        this.quantitaMemoria = quantitaMemoria;
    }
}
