class Solution {
	public int removeDuplicates(int[] nums) {
		if(nums.length == 0) return 0;
		int i = 0;
		for(int j = 1;j < nums.length;j++) {
			if(nums[j] != nums[i]) {
				i++;
				nums[i] = nums[j];
			}
		}
		return i+1;
	}
	
	public static void main(String args[]) {
		int[] nums1 = {0,0,1,1,1,2,2,3,3,4};
		int[] nums2 = {1,1,2};
		Solution solution = new Solution();
		int k = solution.removeDuplicates(nums1);
		System.out.println(k);
		for(int i = 0;i < k;i++)
			System.out.println(nums1[i]);
	}
}