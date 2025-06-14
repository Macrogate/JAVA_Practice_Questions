// Question 11
// CP - Write a program to find the side of the square whose parameter you read from the user
// Hint => The Perimeter of the Square is 4 times the side
// I/P => perimeter
// O/P => The length of the side is ___ whose perimeter is _


import java.util.Scanner;
public class Que11 {
    public static void main(String [] args){
        Scanner sc= new Scanner (System.in);
        int perimeter = sc.nextInt();
        int side = perimeter / 4;
        System.out.println("The Length of the side is " + side + " Whose perimeteer is " + perimeter);

    }
    
}
