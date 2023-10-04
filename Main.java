import Rettangolo.Rettangolo;

public class Main {
    public static void main(String[] args) {
        Rettangolo ret1 = new Rettangolo(14.2,20);
        Rettangolo ret2 = new Rettangolo(10,15);
        ret1.stampaRettangolo();
        Rettangolo.stampaDueRettangoli(ret1,ret2);
    }


}
