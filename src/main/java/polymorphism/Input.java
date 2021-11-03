package main.java.polymorphism;
import java.util.Scanner;

    public class Input {

        public static int vars;

        public static void main(String[] args) {

                System.out.println("Enter a Number :");
                Scanner in = new Scanner(System.in);
                vars = in.nextInt();


                if (vars == 0) {
                    System.out.println(new Cars().derives());
                }
            if (vars == 1) {
                System.out.println(new Saipa().derives());
            }
                else {

                    System.out.println(new Motors().derives());

                }
            }
        }





