package com.company;


class Display{

    private String rsltn;
    public Display(String rsltn) {
        this.rsltn = rsltn;
    }
    public void print()
    {
        System.out.println(rsltn);
    }

    @Override
    public String toString() {
        return "Display [rsltn=" + rsltn + "]";
    }

}

class powepack{
    private double battery;
    public powepack(double battery) {
        this.battery = battery;
    }
    public void print()
    {
        System.out.println(battery);
    }

    @Override
    public String toString() {
        return "powepack [battery=" + battery + "]";
    }


}

class Cell_phone{
    private String model_no;
    private Display D;
    private powepack P;

    public Cell_phone(String model_no, Display d,powepack p) {
        this.model_no = model_no;
        D = d;
        P = p;
    }

    public void print()
    {
        System.out.println(model_no +" " + D + " " + P);
    }

}

public class Model {
    public static void main(String[] args) {
        Display d = new Display("LCD Panel");
        d.print();

        powepack p = new powepack(2750);
        p.print();

        Cell_phone cp = new Cell_phone("Iphone 11", d, p);
        cp.print();

    }
}
