package com.company;

public class Project3 {
    public static void main(String[] args) {
        int x = 0, y = 0, z;
        try {
            System.out.println("z = " + (x / y));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println("Done !!");
        }
    }
}
