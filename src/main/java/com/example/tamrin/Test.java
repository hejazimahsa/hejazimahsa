package com.example.tamrin;

public class Test {
    public static void main(String[] args) {
        String[] arrCities = new String[]{"ilam" , "rasht" , "tehran" , "amol" , "arak"};
        String[] newArrCities = new String[5];
        for (int i = 0; i < arrCities.length; i++) {
                newArrCities[i]=arrCities[i]+arrCities[i].length();
//                System.out.println(arrCities[i] + arrCities[i].length());
            System.out.println(newArrCities[i]);
        }
    }
}