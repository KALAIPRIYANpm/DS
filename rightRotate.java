import java.util.*;
public class rightRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int num[] = {1,2,3,4,5,6};
        int len = num.length;
        rotate(num,0,len-1);
        rotate(num,0,target-1);
        rotate(num,target,len-1);


        for(int nums : num){
            System.out.print(nums+" ");
        }
    }
    public static void rotate(int[] nums,int start,int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
        
    }
}
