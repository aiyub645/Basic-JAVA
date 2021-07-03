package com.company;

class Student{
    private String studid;
    private String name;
    private static String society;
    public Student(String n, String s){
        studid = s;
        name = n;
    }
    public static void setsociety(String s){
        society = s;
    }
    public void display(){
        System.out.println(studid+ ","+name+","+society);
    }

}


public class NewClass {
        public static void main(String[] args) {
            //Student set society("DIU");
            Student a = new Student("193-15-13456","Aiyub Ali");
            Student b = new Student("192-15-12345","Arjuman Nahar");
            a.display();
            b.display();


        }

}
