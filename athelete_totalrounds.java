// Question 27
// CP - An athlete runs in a triangular park with sides provided as input by the user in meters. If the athletewants to complete a 5 km run, then how many rounds must the athlete complete
// Hint => The perimeter of a triangle is the addition of all sides and the number of rounds is thedistance/perimeter
// I/P => side1, side2, side3
// O/P => The total number of rounds the athlete will run is ___ to comp


import java.util.Scanner;
public class athelete_totalrounds {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        int distance = 5;
        int distanceInMeter = distance * 1000;

        int perimeter = side1 + side2 + side3;

        int rounds = distanceInMeter / perimeter;
        System.out.println("The total number of rounds the athelete will run is " + rounds + " to complete 5 km run. ");
        sc.close();


    }
    
}
