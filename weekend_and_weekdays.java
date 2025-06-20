import java.util.Scanner;
public class weekend_and_weekdays {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int dayNumber = sc.nextInt();

        switch (dayNumber) {
            case 1, 2, 3, 4, 5: {System.out.println("weekday"); break;}
            case 6, 7: {System.out.println("weekend"); break;}
            default: {System.out.println("Invalid");}
            sc.close();
        }
    }
}
