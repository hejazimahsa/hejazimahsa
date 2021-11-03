package main.java.polymorphism;

import javax.xml.namespace.QName;

public class Saipa extends Cars {
    protected String name="quick";
    protected String systems = "automatic";
    protected String farmon = "hidrolic";


    public Object derives(){
        System.out.println("KindOf derives like: quick");
        return null;
    }

}
