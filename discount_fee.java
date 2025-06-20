// Question 4
// CP - Create a Program that takes user input for Student Fee and University Discount to compute thediscounted amount and discounted price the student will pay for the course.
// Hint =>
// Create a variable named fee and take user input for fee.Create another variable discountPercent and take user input.Compute the discount and assign it to the discount variable.Compute and print the fee you have to pay by subtracting the discount from the fee.
// I/P => fee, discountPrecent
// O/P => The discount amount is INR ___ and final discounted fee is INR ___


import java.util.Scanner;
public class discount_fee {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int fee = sc.nextInt();
        int discountPercent = sc.nextInt();
        int discount = (fee * discountPercent) / 100;
        int fualFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + fualFee);
        sc.close();
    }
    
}
