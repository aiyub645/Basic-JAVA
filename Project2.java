package com.company;
import java.util.Scanner;

public class Project2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        try {
            System.out.println("String = " + str.charAt(100));
        } catch (Exception a) {
            System.out.println(a);
        } finally {
            System.out.println("Done");
        }
    }
}
