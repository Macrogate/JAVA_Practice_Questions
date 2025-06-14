// Question 23
// CP - Create a program to convert weight from pounds to kilograms.
// Hint => 1 pound = 2.2 kg
// I/P => weight
// O/P => The weight of the person in pounds is ___ and in kg is


import java.util.Scanner;
public class Que23 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        double weightInPound = sc.nextDouble();
        double weightInKg = weightInPound / 2.2;
        System.out.println("The weight of the person in pounds is " + weightInPound + " and in kg is " + weightInKg);
        sc.close();
    }
    
}
