package org.lessons.java;

import java.math.BigDecimal;

public class Smartphone extends Prodotto {

    // attributi
    private String imeiCode;
    private int quantitaMemoria;

    // costruttore
    public Smartphone(String nome, String marca, BigDecimal prezzo, BigDecimal iva, String imeiCode,
            int quantitaMemoria) {

        super(nome, marca, prezzo, iva);
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

    // override
    @Override
    public String toString() {
        return String.format("Nome telefono: %s, Marca telefono: %s, Prezzo: %s, Codice IMEI: %s, Memoria: %s",
                this.nome, this.marca, this.prezzo, this.imeiCode, this.quantitaMemoria);
    }
}
