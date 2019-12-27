class Solution {
	public static int[] twoSum(int[] nums, int target) {
		/*
		int[] pos = new int[2];
		int i = 0, j = 0;
		for(;i < nums.length;i++) {
			int residual = target-nums[i];
			for(j = i+1;j < nums.length;j++) {
				if(residual == nums[j]) {
					pos[0] = i;
					pos[1] = j;
				}
			}
		}
		return pos;*/
		int n = 2048;
        int[] map = new int[n];//bitmap
        int max = n - 1;//111 1111 1111
        for (int i = 0; i < nums.length; i++) {
            int b = map[(target - nums[i]) & max];
            if (b != 0) {
                return new int[]{b , i};
            }
            map[nums[i] & max] = i ;
        }
        return null;
	}

	public static void main(String[] args) {
		int[] nums1 = {2,7,11,15};
		int[] nums2 = {1,1,1,1,15,7,9};
		int target = 26;
		int[] x = twoSum(nums1, target);
		for(int i = 0;i < x.length;i++)
			System.out.println(x[i]);
	}
}