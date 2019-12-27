class Solution {
	public static void moveZeroes(int[] nums) {
		int i = 0, j = 0;
		for(;i < nums.length;i++)
			if(nums[i]!=0)
				nums[j++] = nums[i];
		while(j < nums.length)
			nums[j++] = 0;
	}

	public static void main(String[] args) {
		int[] nums1 = {0,1,0,3,12};
		int[] nums2 = {0,0,1};
		moveZeroes(nums2);
		for(int i = 0;i < nums2.length;i++)
			System.out.println(nums2[i]);
	}
}