package main.java.polymorphism;

public class Main {
    public static void main(String[] args) {
        Cars myForest = new Cars();
        Cars mySaipa = new Saipa();
        Cars myMotors = new Motors();
        myForest.derives();
        mySaipa.derives();
        myMotors.derives();


    }
}









