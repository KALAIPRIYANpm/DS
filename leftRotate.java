import java.util.Scanner;

public class leftRotate {
    public static void main(String[] args) {
        
        int[] nums = {1,2,3,4,5};
        int n = nums.length;
    Scanner sc = new Scanner (System.in);
    int k = sc.nextInt();

    rotate(nums , 0 , n-1);
    rotate(nums , 0 , k-1);
    rotate(nums , k , n-1);
      
      for(int num : nums){
        System.out.print(num+" ");
      }
    }

    static void rotate(int[] nums , int start , int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
            
        }   
    }
}
