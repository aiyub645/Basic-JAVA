package com.company;

class shop{
    private String mail;

    public shop(String mail) {
        super();
        this.mail = mail;
    }

    public void print()
    {
        System.out.println(mail);
    }
}

class customer{
    private String name;

    public customer(String name) {
        super();
        this.name = name;
    }

    public void print()
    {
        System.out.println(name);
    }
}

class display{

}
class product{

}
class outlet {

    private String display;
    public outlet(String display) {
        super();
        this.display = display;
    }

    public void print()
    {
        System.out.println(display);
    }
}

public class Shoping {
    public static void main(String[] args) {
        shop sp = new shop("aiyubali15-13456@diu.edu.bd");
        sp.print();

        customer cs = new customer("Aiyub Ali");
        cs.print();

        outlet ot = new outlet("LCD");
        ot.print();


    }
}
