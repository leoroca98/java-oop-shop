package org.lessons.java.shop;

import java.util.Random;

//definisco i campi

public class Articolo {
    private final int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private double iva;

    // definisco il costruttore
    public Articolo(String nome, String descrizione, double prezzo, double iva) {
        this.codice = generateRandomCode();
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    //  utilizzo un metodo privato per generare un codice casuale 8 cifre
    private int generateRandomCode() {
        Random random = new Random();
        return random.nextInt(99999999) + 1;
    }

    //  getter
    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public double getIva() {
        return iva;
    }

    // setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    // metodo per ottenere il prezzo comprensivo di IVA
    public double getPrezzoConIva() {
        return prezzo * (1 + iva / 100);
    }

    // metodo per ottenere il nome esteso
    public String getNomeEsteso() {
        String codicePadded = String.format("%08d", codice);
        return codicePadded + "-" + nome;
    }
}