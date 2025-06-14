// Question 2
// CP - Suppose you have to divide 14 pens among 3 students equally. Write a program to find how manypens each student will get if the pens must be divided equally. 
// Also, find the remaining non-distributedpens.
// Hint =>
// Use Modulus Operator (%) to find the reminder.Use Division Operator to find the Quantity of pens
// I/P => NONE
// O/P => The Pen Per Student is ___ and the remaining pen not distributed is __


import java.util.Scanner;

public class que29 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int totalPens = sc.nextInt();
        int students = sc.nextInt();
        int penPerStudent = totalPens / students;
        int remainingPens = totalPens % students;
        System.out.println("The pen per student is " + penPerStudent + " and the remaining pens not distributed is " + remainingPens);
        sc.close();
    }    
}
