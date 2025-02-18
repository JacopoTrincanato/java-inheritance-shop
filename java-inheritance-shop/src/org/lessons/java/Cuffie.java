package org.lessons.java;

public class Cuffie extends Prodotto {
    // attributi
    public String colore;
    public String tipo;

    // costruttore
    public Cuffie(int codice, String tipo, String colore) {
        // richiamo l'attributo codice da prodotto
        super(codice);
        this.colore = colore;

        boolean isWireless = true;

        if (isWireless) {
            this.tipo = "Wireless";
        } else {
            this.tipo = "Cablate";
        }

    }

    // metodi
    public String getColore() {
        return "il colore delle cuffie è " + colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
