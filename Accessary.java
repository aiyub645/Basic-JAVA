package com.company;

class shape{
    private String name;

    public shape(String name) {
        super();
        this.name = name;
    }

    public void print() {
        System.out.println(name);
    }
}

class table{
    private double height,length,width;

    public table(double height, double length, double width) {
        super();
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public void print() {
        System.out.println("height : " + height + "\nlength : " + length + "\nwidth : " + width);
    }
}

class stationary{

}

class pen{
    private String color,name;

    public pen(String color, String name) {
        super();
        this.color = color;
        this.name = name;
    }

    public void print() {
        System.out.println("Color : " + color + "\nName : " + name);
    }
}

class book{
    private String name;
    private int pages;

    public book(String name, int pages) {
        super();
        this.name = name;
        this.pages = pages;
    }

    public void print() {
        System.out.println("Name : " + name + "\nPages : " + pages);
    }
}


public class Accessary {
    public static void main(String[] args) {
        shape sp = new shape("Square");
        sp.print();

        table tb = new table(100, 100, 100);
        tb.print();

        book bk = new book("Python", 300);
        bk.print();

        pen pn = new pen("Red", "Parker");
        pn.print();

    }
}
