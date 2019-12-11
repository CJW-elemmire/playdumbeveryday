import java.util.*;

class Solution {
	public static int[] plusOne(int[] digits) {
		for(int i = digits.length-1;i >= 0;i--) {
			if(digits[i] + 1 >= 10) {
				digits[i] = 0;
				continue;
			}
			else {
				digits[i] += 1;
				break;
			}
		}
		if(digits[0] == 0) {
			int[] newdigits = new int[digits.length+1];
			System.arraycopy(digits,0,newdigits,1,digits.length);
			newdigits[0] = 1;
			return newdigits;
		}
		return digits;
	}
	
	public static void main(String[] args) {
		int[] nums1 = {1,2,3};
		int[] nums2 = {2,4,9,3,9};
		int[] nums3 = {9,9,9,9};
		int[] nums4 = {0};
		int[] test = plusOne(nums3);
		for(int i = 0;i < test.length;i++)
			System.out.println(test[i]);
	}
}