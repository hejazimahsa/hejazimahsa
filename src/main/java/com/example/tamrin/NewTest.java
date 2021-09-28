package com.example.tamrin;

public class NewTest {
    public static void main(String[] args) {
        String[] names = new String[]{"mahsa" , "maryam" , "mona" , "arezo" , "azin" , "lale"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);

            String[] families = new String[]{"hejazi" , "mamadi" , "tavoli" , "nakhostin" , "ansari" , "amiri"};
            for (int j = 0; j < names.length; j++) {
                System.out.println(families [j] +names[i]);


            }
        }
    }
}