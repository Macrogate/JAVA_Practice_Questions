// 1.	Sample Program 1 - Create a program to check if 3 values are internal angles of a triangle.

// Hint => 
// a.	Get integer input for 3 variables named x, y, and z.
// b.	Find the sum of x, y, and z.
// c.	If the sum is equal to 180, print ”The given angles are internal angles of a triangle” else print They are not

import java.util.Scanner;
public class sumOfAngles{
    public static void main(String[]  args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sumOfAngles = a+b+c;
        if(sumOfAngles == 180){
            System.out.println("The Given Angles are Internal angles of a triangle");
        }else{
            System.out.println("they are not the anles of a trianngle");
            sc.close();
        }


    }
}