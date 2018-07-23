import java.util.Scanner;

public class ex14 {


    public static void count(int counter){
        int number = 0;
        while (number <= 5) {
            System.out.println(number);
            number += 1;
        }
    }
    public static void main(String[] args) {
        // Exercise 14:
        //Create a program that sends a different function a number, and that function prints that many “-”.

        Scanner getThe = new Scanner(System.in);
        int counter = 0;
        int mainCounter = 1;
        System.out.println("How many times should this run? ");
        int howManyTimes= getThe.nextInt();

        while (mainCounter <= howManyTimes) {
            System.out.println("Printed " + mainCounter + " times.");
            mainCounter += 1;
            count(0);

        }


    }
}