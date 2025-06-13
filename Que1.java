// add two numbers in Java

import java.util.Scanner;
public class Que1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum is: " + sum);
        sc.close();
    }
}
