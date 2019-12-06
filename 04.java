import java.util.Arrays;
class Solution {
	public static boolean containDuplicate(int[] nums) {
		Arrays.sort(nums);
		for(int i = 0;i < nums.length-1;i++) {
			if(nums[i+1] == nums[i])
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] nums1 = {1,2,3,1};
		int[] nums2 = {1,2,3,4};
		int[] nums3 = {1,1,1,3,3,4,3,2,4,2};
		boolean x = containDuplicate(nums3);
		System.out.println(x);
	}
}