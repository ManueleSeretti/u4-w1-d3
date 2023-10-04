package Sim;

import java.util.Arrays;
import Sim.Call;


public class Sim {
    private int number;
    private int credito;
    private Call[] list=new Call[5];


    public Sim(int numero){
        this.number = numero;
        this.credito=0;

    }

    public void setList(Call list1,Call list2,Call list3,Call list4,Call list5) {
        this.list[0] = list1;
        this.list[1] = list2;
        this.list[2] = list3;
        this.list[3] = list4;
        this.list[4] = list5;
    }

    @Override
    public String toString() {
        return "Sim{" +
                "number=" + number +
                ", credito=" + credito +
                ", list=" + Arrays.toString(list) +
                '}';
    }





}
