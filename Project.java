package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Project extends JFrame implements ActionListener {
    JTextField t1;
    JTextField t2;
    JButton button;
    JLabel l5;
    Project(){
        t1 = new JTextField(15);
        t2 = new JTextField(15);
        button = new JButton("Result");
        l5 = new JLabel();
        add(t1);
        add(t2);
        add(button);
        add(l5);
        this.setSize(200,250);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        button.addActionListener(this);

    }

    public static void main(String[] args) {
        Project project = new Project();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());
        int result = num1+num2;
        l5.setText("Sum = "+ result);
    }
}
