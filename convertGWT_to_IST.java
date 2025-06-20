import java.util.Scanner;
public class convertGWT_to_IST {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int hours = sc.nextInt();
        int minutes = sc.nextInt();

        hours += 5;
        minutes =+ 30;

        if(minutes >= 60){
            hours ++;
            minutes -= 60;
        }
        if(hours >= 24){
            day ++;
            hours -= 24;
        }
        System.out.println("Day: " + day + ", hours: " + hours + ", minutes: " + minutes);
        sc.close();

    }
}
