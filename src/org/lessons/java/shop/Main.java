package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        // creazione di uno o più articoli
        Articolo articolo1 = new Articolo("Articolo 1", "Descrizione articolo 1", 20.0, 10.0);
        Articolo articolo2 = new Articolo("Articolo 2", "Descrizione articolo 2", 15.0, 8.0);

        System.out.println("Codice articolo 1: " + articolo1.getCodice());
        System.out.println("Nome articolo 1: " + articolo1.getNome());
        System.out.println("Descrizione articolo 1: " + articolo1.getDescrizione());
        System.out.println("Prezzo base articolo 1: " + articolo1.getPrezzo());
        System.out.println("IVA articolo 1: " + articolo1.getIva());
        System.out.println("Prezzo comprensivo di IVA articolo 1: " + articolo1.getPrezzoConIva());
        System.out.println("Nome esteso articolo 1: " + articolo1.getNomeEsteso());

        articolo1.setNome("Articolo Modificato");
        articolo1.setPrezzo(25.0);

        System.out.println("Nome articolo 1 (dopo la modifica): " + articolo1.getNome());
        System.out.println("Prezzo base articolo 1 (dopo la modifica): " + articolo1.getPrezzo());
        System.out.println("Prezzo comprensivo di IVA articolo 1 (dopo la modifica): " + articolo1.getPrezzoConIva());
        System.out.println("Nome esteso articolo 1 (dopo la modifica): " + articolo1.getNomeEsteso());

        System.out.println("Codice articolo 2: " + articolo2.getCodice());
        System.out.println("Nome articolo 2: " + articolo2.getNome());
        System.out.println("Descrizione articolo 2: " + articolo2.getDescrizione());
        System.out.println("Prezzo base articolo 2: " + articolo2.getPrezzo());
        System.out.println("IVA articolo 2: " + articolo2.getIva());
        System.out.println("Prezzo comprensivo di IVA articolo 2: " + articolo2.getPrezzoConIva());
        System.out.println("Nome esteso articolo 2: " + articolo2.getNomeEsteso());
    }
}
