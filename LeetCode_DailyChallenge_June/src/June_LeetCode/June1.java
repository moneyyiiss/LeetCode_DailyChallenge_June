package June_LeetCode;

import java.util.Scanner;

public class June1 {
	public static void main(System args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = scn.nextInt();
		}
		Solution obj = new Solution();
		System.out.println(obj.runningSum(arr));
	}
}
class Solution {
    public int[] runningSum(int[] nums) {
        for(int i=1; i<nums.length; i++){
           nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }
}
