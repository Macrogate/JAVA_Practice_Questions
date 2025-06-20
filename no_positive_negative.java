import java.util.Scanner;
public class no_positive_negative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();

    if(num >= 0){
        System.out.println("Positive");
    }else{
        System.out.println("Negative");
        sc.close();
    }
}
    
}
