// Question 13
// CP - Write a program that takes the base and height in cm to find the area of a triangle in square inchesand square centimeters
// Hint => Area of a Triangle is ½ * base * height and 1 in = 2.54 cm
// I/P => base, height
// O/P => The Area of the triangle in sq in is ___ and sq cm is ___


import java.util.Scanner;
public class Que13 {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int base = sc.nextInt();
        int height = sc.nextInt();
        double area = 0.5 * base * height;

        // convert into inches
        double areaInCm = area * 2.54;
        System.out.println("The area of the triangle in Sq is " + area + " sq cm is " + areaInCm);
        sc.close();
    }
    
}
