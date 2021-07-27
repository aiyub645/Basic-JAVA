package com.company;
import javax.swing.*;


public class Coding extends JFrame{
    JFrame f;
    Coding()
    {
        this.f = new JFrame();

        this.setSize(400,400);
        this.setTitle("Log in");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        Coding C = new Coding();
    }
}


