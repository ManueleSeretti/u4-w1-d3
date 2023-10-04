package Sim;

public class Call {
    private int numeroTele;
    private int secound;



    public Call(int num, int sec){
        this.numeroTele=num;
this.secound=sec;
    }

    @Override
    public String toString() {
        return
                "numeroTele=" + numeroTele +
                "- secound=" + secound ;
    }
}
