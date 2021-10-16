package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Forest myForest =new Forest();
        Forest myAnimuls =new Animuls();
        Forest myDogs= new Dogs();
        myForest.KindOfAnimuls();
        myDogs.KindOfAnimuls();
        myAnimuls.KindOfAnimuls();


    }
}
