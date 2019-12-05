class Solution {
    public void rotate(int[] nums, int k) {
        	int tmp = 0;
	for(int i = 0;i < k;i++) {
		tmp = nums[nums.length-1];
		for(int j = nums.length-1;j > 0;j--)
			nums[j] = nums[j-1];
		nums[0] = tmp;
	}
    }
	public static void main(String[] args){
		int[] nums1 = {1,2,3,4,5,6,7};
		int[] nums2 = {-1,-100,3,99};
		int k = 3;
		Solution solution = new Solution();
		solution.rotate(nums1,k);
		for(int i = 0;i < nums1.length;i++)
			System.out.println(nums1[i]);
	}
}