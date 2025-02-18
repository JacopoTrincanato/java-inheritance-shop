package org.lessons.java;

import java.math.BigDecimal;
import java.util.Random;

public class Prodotto {

    // attributi
    private int codice;
    public String nome;
    public String marca;
    public BigDecimal prezzo;
    public BigDecimal iva;

    // costruttore
    public Prodotto(String nome, String marca, BigDecimal prezzo, BigDecimal iva) {
        Random random = new Random();
        this.codice = random.nextInt(100000);
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // metodi
    public String getCodice() {
        return "Il codice del prodotto è " + codice;
    }

    public String getNome() {
        return "Il nome del prodotto è " + nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return "la marca del prodotto è " + marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPrezzo() {
        return "Il prezzo del prodotto è " + prezzo;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    public String getIva() {
        return "l'iva del prodotto è " + iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }
}
