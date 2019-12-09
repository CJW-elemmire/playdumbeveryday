class Solution {
	public static int singleNumber(int[] nums) {
		int base = 0;
		for(int i =0;i < nums.length;i++)
			base ^= nums[i];
		return base;
	}
	
	public static void main(String[] args) {
		int[] nums1 = {2,2,1};
		int[] nums2 = {4,1,2,1,2};
		int x = singleNumber(nums2);
		System.out.println(x);
	}
}