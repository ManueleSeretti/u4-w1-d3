package Shop;

import java.util.Random;

public class Articolo {
    private int codice;
    private String description;
    private double prezzo;
    private int pezzi;


    public Articolo(String desc, double price, int items) {
        Random rndm = new Random();
        this.codice = rndm.nextInt(1, 1000);
        this.description = desc;
        this.prezzo = price;
        this.pezzi = items;


    }

    @Override
    public String toString() {
        return "Articolo{" +
                "codice=" + codice +
                ", description='" + description + '\'' +
                ", prezzo=" + prezzo +
                ", pezzi=" + pezzi +
                '}';
    }

    public double getPrezzo() {
        return prezzo;
    }
}
