// Question 9
// CP - Create a program to convert the distance of 10.8 kilometers to miles.
// Hint => 1 km = 1.6 miles
// I/P => NONE
// O/P => The distance ___ km in miles is _

import java.util.Scanner;
public class Que9 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        double distanceInKm = sc.nextDouble();
        double distanceInMiles = distanceInKm / 1.6;
        System.out.println("The distance " + distanceInKm + " km in mles is " + distanceInMiles);
        sc.close();
    }
    
}
