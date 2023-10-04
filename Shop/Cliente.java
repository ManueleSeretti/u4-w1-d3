package Shop;

import java.util.Random;

public class Cliente {
    private int codiceCliente;
    private String name;
    private String email;
    private String date;

    public Cliente(String name, String email, String date) {
        Random rndm = new Random();
        this.codiceCliente = rndm.nextInt(1, 1000);
        this.name = name;
        this.email = email;
        this.date = date;

    }

    @Override
    public String toString() {
        return "Cliente{" +
                "codiceCliente=" + codiceCliente +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
