// Question 3
// CP - Create a program to calculate the profit and loss in number and percentage based on the cost priceof INR 129 and the selling price of INR 191.
// Hint =>
// Use a single print statement to display multiline text and variables.Profit = selling price - cost priceProfit Percentage = profit / cost price * 100
// I/P => NONE
// O/P =>
// The Cost Price is INR ___ and the Selling Price is INR ___The Profit is INR ___ and the Profit Percentage is ___


import java.util.Scanner;
public class calculateProfitAndLoss {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int  costPrise = 129;
        int sellingPrise = 191;

        int profit = sellingPrise - costPrise;
        double profitPercent = (profit) / costPrise * 100;
        System.out.println("The cost price is INR " + costPrise + " and the selling price is INR " + sellingPrise + " and the Profit Percentageis " + profitPercent);
        sc.close();
        

    }
    
}
