package com.company;

class Shape{
    protected int location;
    public Shape(int l){
        location = l;
    }
    public void display(){
        System.out.println(location);
    }
}

class Rectangle{
    private int height;
    private int width;
    public Rectangle(int h, int i){
        height = h;
        width = i;
    }
    public void display(){
        System.out.println(height+width);
    }
}


public class NewClass_2 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5,10);
        r.display();
    }
}
