package Arrays;
import java.util.Scanner;
public class input_in_array {
    public static void main(String [] args){
        int marks [] = new int[100];
        Scanner sc = new Scanner(System.in);

         marks[0] = sc.nextInt();
         marks[1] = sc.nextInt();
         marks[2] = sc.nextInt();

         System.out.println(" Physics " + marks[0] + " Chemistry " + marks[1] + " Maths " + marks[2]);
    }
    
}
