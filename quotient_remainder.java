// Question 15
// CP - Write a program to take two numbers and print their quotient and reminder
// Hint => Use division operator (/) for quotient and moduli operator (%) for reminder
// I/P => number1, number2
// O/P => The Quotient is ___ and Reminder is ___ of two number ___ and _


import java.util.Scanner;
public class quotient_remainder {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int quotient = number1 / number2;
        int remainder = number1 % number2;
        System.out.println("The Quotient is " + quotient + " and the remainder is " + remainder + " of two number " + number1 + " and " + number2);
        sc.close();

    }
    
}
