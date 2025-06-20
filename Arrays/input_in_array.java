package Arrays;
import java.util.Scanner;
public class input_in_array {
    public static void main(String [] args){
        int marks [] = new int[3];
        Scanner sc = new Scanner(System.in);

         marks[0] = sc.nextInt();
         marks[1] = sc.nextInt();
         marks[2] = sc.nextInt();

         System.out.println(" Physics " + marks[0] + " Chemistry " + marks[1] + " Maths " + marks[2]);

        //  update the marks in array
         marks[2] += 1;
         System.out.println("Update marks in maths " + marks[2]);

        //  find percentages of marks

        int percentage = (marks[0] + marks[1] + marks[2]) / 2;
        System.out.println("percentage of marks is " + percentage);
    }
    
}
