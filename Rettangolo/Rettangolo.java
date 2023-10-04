package Rettangolo;

public class Rettangolo {
    private double base;
    private double altezza;


    public Rettangolo(double base,double altezza){
        this.base=base;
        this.altezza=altezza;
    }

    public void stampaRettangolo(){
        double area= this.base * this.altezza;
        double perimetro= 2* (this.base+this.altezza);
        System.out.println("l'area è: " + area);
        System.out.println("il perimetro è: " + perimetro);
    }
    public static void stampaDueRettangoli(Rettangolo r1,Rettangolo r2){
        double area1= r1.base * r1.altezza;
        double area2= r2.base * r2.altezza;
        double perimetro1= 2* (r1.base+r1.altezza);
        double perimetro2= 2* (r2.base+r2.altezza);
        double sommaAree= area1+area2;
        double sommaPerimetri=perimetro1+perimetro2;
        System.out.println("l'area del primo rettangolo è: " + area1 +" il perimetro è: " + perimetro1);
        System.out.println("l'area del secondo rettangolo è: " + area2 +" il perimetro è: " + perimetro2);
        System.out.println("lasomma delle aree è: " + sommaAree +"e la somma dei perimetri è: " + sommaPerimetri);

    }

}
