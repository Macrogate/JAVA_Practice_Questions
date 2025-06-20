
// Question 24
// CP - Create a program to find the total income of a person by taking salary and bonus from the user
// Hint =>
// 1. Create a variable named salary and take user input.
// 2. Create another variable bonus and take user input.
// 3. Compute income by adding salary and bonus and print the result
// I/P => salary, bonus
// O/P => The salary is INR ___ and the bonus is INR ___. Hence Total Income is INR___

import java.util.Scanner;
public class Que24 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        int bonus = sc.nextInt();
        int totalIncome = salary + bonus;
        System.out.println("The salary is INR " + salary+ " and the bonus id INR " + bonus + ". Hence total income is " + totalIncome);
        sc.close();
    }
    
}
