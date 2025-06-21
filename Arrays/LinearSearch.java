package Arrays;
import java.util.Scanner;
public class LinearSearch {
    public static int linearSearch(int nums [], int key){
        
        for(int i=0; i< nums.length; i++){
            if(nums[i] == key){
                return i;
            }
        }
        return -1;

    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int nums [] = new int [5];
        
        nums [0] = sc.nextInt();
        nums [1] = sc.nextInt();
        nums [2] = sc.nextInt(); 
        nums [3] = sc.nextInt();
        nums [4] = sc.nextInt();
        // nums [5] = sc.nextInt(); 

        int key = sc.nextInt();

        // calling of function
        int index = linearSearch(nums, key);
        if(index == -1){
            System.out.println("NOT FOUND");
        }else{
            System.out.println("Index is at " + index);
        }

    }
    
}
