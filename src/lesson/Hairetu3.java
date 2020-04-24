package lesson;

import java.util.Arrays;

public class Hairetu3 {

	public static void main(String[] args) {
		int[] nums = {8,5,9,2,4};
		Arrays.sort(nums);
		//Arrays.fill(nums,10);
		for(int N:nums) {
		System.out.println(N);
		}
			System.out.println();//改行

		int sum =0;
		for(int N:nums) {
			sum+=N;
		}
		System.out.println(sum);
			System.out.println();//改行

		int count =0;
		for(int N:nums) {
			if(N>=5) {
				count++;
			}
		}
		System.out.println(count);
			System.out.println();//改行

		int max =0;
		for(int i= 0;i<5;i++) {
			nums[i] *=2;
		   if(nums[i]>max) {
			   max = nums[i];
		   }
		}
		System.out.println(max);
	}
}