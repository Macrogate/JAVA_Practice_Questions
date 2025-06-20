// Question 6
// CP - Write a program to find the age of Harry if the birth year is 2000. Assume the Current Year is 2024
// I/P => NONE
// O/P => Harry's age in 2024 is ___

import java.util.Scanner;
public class harry_age {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int birthYear = sc.nextInt();
        int currYear = sc.nextInt();
        int age = currYear - birthYear;
        System.out.println("Harry's age in " + currYear + " is " + age);
        sc.close();
    }
}