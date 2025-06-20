// Question 19
// CP - Create a program to swap two numbers
// Hint =>
// 1. Create a variable number1 and take user input.
// 2. Create a variable number2 and take user input.
// 3. Swap number1 and number2  and print the swapped output
// I/P => number1, number2
// O/P => The swapped numbers are  ___ and ___



import java.util.Scanner;
public class swap_numbers {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        // Swapping the numbers using a temporary variable
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("The swapped numbers are " + num1 + " and " + num2);
        sc.close();
    }
    
}
