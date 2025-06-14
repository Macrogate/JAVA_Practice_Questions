// Question 8
// CP - Write a program that takes your height in centimeters and converts it into feet and inches
// Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
// I/P => height
// O/P => Your Height in cm is ___ while in feet is ___ and inches is _

import java.util.Scanner;
public class Que8 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int heightInCm = sc.nextInt();
        int totalInches =  (int)(heightInCm / 2.54);
        int feet = totalInches / 12;
        int inches = totalInches % 12;
        System.out.println("Your Height in cm is " + heightInCm + " while in feet is " + feet + " and inches is "+ inches);
    }
    
}
