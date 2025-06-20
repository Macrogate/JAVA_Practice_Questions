// Question 28
// CP - Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
// Hint => Simple Interest = Principal * Rate * Time / 100
// I/P => principal, rate, time
// O/P => The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___


import java.util.Scanner;
public class Que28 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int principle = sc.nextInt();
        int rate = sc.nextInt();
        int time = sc.nextInt();

        int SI = (principle * rate * time) / 100;
        System.out.println("The simple interest is " + SI + " for principle " + principle + " for rate " + rate + " and time " + time);
        sc.close();
    }
    
}
