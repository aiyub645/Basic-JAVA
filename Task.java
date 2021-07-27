package com.company;
import javax.swing.*;
import java.awt.*;

public class Task extends JFrame{
    JFrame frame;
    JLabel level1, level2, level3, level4;
    JTextField text1, text2, text3, text4;
    Task(){
        this.frame = new JFrame();
        this.level1 = new JLabel("Name: ");
        this.text1 = new JTextField(10);
        this.level2 = new JLabel("Designation: ");
        this.text2 = new JTextField(10);
        this.level3 = new JLabel("Salary: ");
        this.text3 = new JTextField(10);
        this.level4 = new JLabel("Overtime: ");
        this.text4 = new JTextField(10);
        this.setLayout(new FlowLayout());
        this.setSize(240, 300);
        this.setTitle("Login page");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(level1);
        add(text1);
        add(level2);
        add(text2);
        add(level3);
        add(text3);
        add(level4);
        add(text4);
    }
    public static void main(String[] args){
        Task p1 = new Task();
    }
}
