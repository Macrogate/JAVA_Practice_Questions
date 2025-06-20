// Question 5
// CP - The University is charging the student a fee of INR 125000 for the course. The University is willingto offer a discount of 10%. Write a program to find the discounted amount and discounted price thestudent will pay for the course.
// Hint =>
// Create a variable named fee and assign 125000 to it.Create another variable discountPercent and assign 10 to it.Compute discount and assign it to the discount variable.Compute and print the fee you have to pay by subtracting the discount from the fee.
// O/P => The discount amount is INR ___ and final discounted fee is INR __

public class discount_feeII{
public static void main(String [] args){
	int fee = 125000;
	int discountPercent = 10;
	
	double Discount = (fee * discountPercent) / 100;
	double finalFee = fee - Discount;
	System.out.println("The Discoint amount is INR " + Discount + " and the final fee is INR " + finalFee);
}
}