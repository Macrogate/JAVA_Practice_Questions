package Arrays;
import java.util.Scanner;
public class findLargest {
    public static int findLargest(int nums[]){
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE; // +infinity
        for(int i=0; i<nums.length; i++){

            // to find largest
            if(nums[i] > largest){
                largest = nums[i]; //update the value of temp
            }

            // to find smallest
            if(nums[i] < smallest){
                smallest = nums[i];
            }
        }
        System.out.println("Smallest number is " + smallest);
        return largest;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);

        int nums [] = new int [4];

        nums [0] = sc.nextInt();
        nums [1] = sc.nextInt();
        nums [2] = sc.nextInt();
        nums [3] = sc.nextInt();

        System.out.println("largest number is " + findLargest(nums));
    }
    
}

// time complexity == O(n)
