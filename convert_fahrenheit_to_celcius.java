// Question 20
// CP - Write a TemperaturConversion program, given the temperature in Fahrenheit as input outputs thetemperature in Celsius
// // Hint =>
// 1. Create a fahrenheit variable and take the user's input
// 2. User the formulae to convert Fahrenheit to Celsius: (°F - 32) x 5/9 = °C and assign the result to
// celsiusResult  and print the result..
// I/P => fahrenheit
// O/P => The ____ fahrenheit is _____ 


import java.util.Scanner;
public class convert_fahrenheit_to_celcius {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int tempInFahrenheit = sc.nextInt();
        double tempInCelcius = (tempInFahrenheit - 32) * 5.0 / 9.0;
        System.out.println("The " + tempInFahrenheit + " celcius is " + tempInCelcius + " fahrenheit");
        sc.close();
    }
    
}