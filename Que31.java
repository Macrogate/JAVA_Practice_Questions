import java.util.Scanner;
public class Que31 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number % 15 == 0){
            System.out.println("fizzBuzz");
        }else if(number % 5 == 0){
            System.out.println("Buzz");
        }else if(number % 3 == 0){
            System.out.println("Fizz");
        }else{
            System.out.println(number);
        }
    }
}
