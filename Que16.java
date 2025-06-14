// Question 16
// CP - Write a program to create a basic calculator for addition, subtraction, multiplication, and division.The program should ask for two numbers (floating point) and perform all the operations
// Hint =>
// Create a variable number1 and number 2 and take user inputs.Perform Arithmetic Operations of addition, subtraction, multiplication and division and assign theresult to a variable and finally print the result
// I/P => number1, number2
// O/P => The addition, subtraction, multiplication, and division value of 2 numbers ___ and ___ is ___,____, ____, and __

import java.util.Scanner;
public class Que16 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        double sum = number1 + number2;
        double difference = number1 - number2;
        double product = number1 *  number2;
        double multiplication = number1 / number2;
        System.out.println("The Sum, Difference, Product, multiplication of two numbers is " + sum + ", " + difference + ", " + product + ", " + multiplication);
        sc.close();


    }
    
}
