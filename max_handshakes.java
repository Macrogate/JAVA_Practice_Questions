// Question 22
// CP - Create a program to find the maximum number of handshakes among N number of students.
// Hint =>
// 1. Get integer input for the numberOfStudents variable.
// 2. Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possiblehandshakes.
// 3. Display the number of possible handshakes.



import java.util.Scanner;
public class max_handshakes {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int possibleHandShakes = (n * (n - 1)) / 2;
        System.out.println("The maximum number of handchakes are " + possibleHandShakes);
        sc.close();

    }
    
}
