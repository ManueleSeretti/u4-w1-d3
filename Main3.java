import Shop.Articolo;
import Shop.Carrello;
import Shop.Cliente;

public class Main3 {
    public static void main(String[] args) {
        Articolo art1 = new Articolo("telefono", 125, 10);
        Articolo art2 = new Articolo("tv", 625, 10);
        Articolo art3 = new Articolo("pc", 825, 10);

        Articolo[] list = {art1, art2, art3};

        Cliente cliente1 = new Cliente("gigi latrottola", "gigi@gmail.com", "22/07/2020");

        Carrello carrello1 = new Carrello(cliente1);

        carrello1.setLista(list);
        System.out.println("DETTAGLI DEL CARRELLO" + carrello1);

        System.out.println("il conto finale è: " + carrello1.totale());
    }
}
