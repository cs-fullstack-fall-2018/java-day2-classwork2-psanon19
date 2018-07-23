import java.util.Scanner;

public class ex13 {


    public static void count(int counter){
        int number = 0;
        while (number <= 5) {
            System.out.println(number);
            number += 1;
        }
    }
    public static void main(String[] args) {
        // Exercise 13:
        //Create a function that counts 0 to 5 three times in a row


        int counter = 0;
        int mainCounter = 1;
        while (mainCounter <= 3) {
            System.out.println("Printed " + mainCounter + " times.");
            mainCounter += 1;
            count(0);

        }


    }
}