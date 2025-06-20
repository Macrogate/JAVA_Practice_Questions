import java.util.Scanner;
public class Que30 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        double temperature = sc.nextDouble();

        if(temperature > 103.0){
            System.out.println("Fever");
        }else{
            System.out.println("Not Fever");
            sc.close();
        }
    }
}
