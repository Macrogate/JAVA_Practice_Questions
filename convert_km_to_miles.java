// Question 9
// CP - Create a program to convert the distance of 10.8 kilometers to miles.
// Hint => 1 miles = 1.6 km
// I/P => NONE
// O/P => The distance ___ km in miles is _

import java.util.Scanner;
public class convert_km_to_miles {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        double distanceInKm = sc.nextDouble();
        double distanceInMiles = distanceInKm / 1.6;
        System.out.println("The distance " + distanceInKm + " km in mles is " + distanceInMiles);
        sc.close();
    }
    
}
