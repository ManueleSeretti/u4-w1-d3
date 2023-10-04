package Shop;

import java.util.Arrays;

public class Carrello {
    private Cliente cliente;
    private Articolo[] lista;
    private double conto;

    public Carrello(Cliente cliente) {
        this.cliente = cliente;
        this.conto = 0;

    }


    public void setLista(Articolo[] lista) {
        this.lista = lista;
        this.conto = 0;

        for (Articolo articolo : lista) {
            this.conto = this.conto + articolo.getPrezzo();
        }

    }

    @Override
    public String toString() {
        return "Carrello{" +
                "cliente=" + cliente +
                ", lista=" + Arrays.toString(lista) +
                ", conto=" + conto +
                '}';
    }

    public double totale() {
        this.conto = 0;

        for (int i = 0; i < lista.length; i++) {

            this.conto = this.conto + lista[i].getPrezzo();

        }
        return this.conto;


    }
}
