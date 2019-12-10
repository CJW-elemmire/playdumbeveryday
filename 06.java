import java.util.*;
class Solution {
	public static int[] intersect(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int length = nums1.length > nums2.length?nums2.length:nums1.length;
		int[] ret = new int[length];
		int i = 0,j = 0,k = 0;
		while(i < nums1.length && j < nums2.length) {
			if(nums1[i] < nums2[j])
				i++;
			else if(nums2[j] < nums1[i])
				j++;
			else if(nums1[i] == nums2[j]) {
				ret[k] = nums1[i];
				i++;
				j++;
				k++;
			}
		}
		return Arrays.copyOf(ret,k);
	}
	
	public static void main(String[] args) {
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		int[] nums3 = {4,9,5};
		int[] nums4 = {9,4,9,8,4};
		int[] ret = new int[2];
		ret = intersect(nums1, nums2);
		for(int i = 0;i < ret.length;i++)
			System.out.println(ret[i]);
	}
}