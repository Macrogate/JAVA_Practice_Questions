// uestion 26
// CP - Write a TemperaturConversion program, given the temperature in Celsius as input outputs thetemperature in Fahrenheit
// Hint =>
// 1. Create a Celsius variable and take the temperature as user input
// 2. Use the Formulae Celsius to Fahrenheit:   (°C × 9/5) + 32 = °F and assign to farenheitResult  andprint the result
// I/P => celsius
// O/P =>  The ____ celsius is _____ fahrenheit


import java.util.Scanner;
public class Que26 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int tempInCelcius = sc.nextInt();
        double tempInFahrenheir = (tempInCelcius * 9.0 / 5.0) + 32;
        System.out.println("The " + tempInCelcius + " celcius is " + tempInFahrenheir + " fahrenheit");
        sc.close();
    }
    
}
