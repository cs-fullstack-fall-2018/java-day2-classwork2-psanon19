import java.util.Scanner;

public class ex15 {


    public static void count(int counter){
        int number = 0;
        int secondCounter = 0;
        System.out.println("How far should we go?: ");
        while (number <= secondCounter) {
            System.out.println(number);
            number += 1;
        }
    }
    public static void main(String[] args) {
        // Exercise 15:
        //Create a function in your program that counts from 0 to [NUMBER]

        Scanner getThe = new Scanner(System.in);
        int counter = 0;
        int mainCounter = 0;
        System.out.println("How many times should this run? ");
        int howManyTimes= getThe.nextInt();

        while (mainCounter <= howManyTimes) {
            System.out.println("Printed " + mainCounter + " times.");
            mainCounter += 1;
            count(0);

        }


    }
}