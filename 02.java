class Solution {
	public int maxProfit(int[] prices) {
		int profit = 0;
		for(int i = 0;i < prices.length-1;i++) {
			if(prices[i+1] > prices[i]) {
				profit += prices[i+1] - prices[i];
			}
		}
		return profit;
	}
	
	public static void main(String args[]) {
		int[] prices1 = {7,1,5,3,6,4};
		int[] prices2 = {1,2,3,4,5};
		int[] prices3 = {7,6,4,3,1};
		Solution solution = new Solution();
		int max = solution.maxProfit(prices2);
		System.out.println(max);
	}
}