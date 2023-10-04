import Sim.Call;
import Sim.Sim;

public class Main2 {
    public static void main(String[] args) {
        Sim lele = new Sim(333122323);

        Call call1 = new Call(3212112, 23);
        Call call2 = new Call(3212112, 23);
        Call call3 = new Call(3212112, 23);
        Call call4 = new Call(3212112, 23);
        Call call5 = new Call(3212112, 23);
        lele.setList(call1, call2, call3, call4, call5);

        System.out.println(lele);
    }
}
