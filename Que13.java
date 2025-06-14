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
