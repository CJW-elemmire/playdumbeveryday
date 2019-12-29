// import java.lang.*;
class Solution {
	public static int reverse(int x) {
		int ret = 0;
		while(x != 0) {
			int num = x%10;
			if(ret > Integer.MAX_VALUE/10||ret==Integer.MAX_VALUE/10&&num > 7)
				return 0;
			if(ret < Integer.MIN_VALUE/10||ret==Integer.MIN_VALUE/10&&num < -8)
				return 0;
			ret = ret*10+num;
			x/= 10;
		}
		return ret;
	}
	
	public static void main(String[] args) {
		int x1 = 123;
		int x2 = -123;
		int x3 = 120;
		int x4 = 1534236469;
		int x = reverse(x3);
		System.out.println(x5 > Integer.MAX_VALUE);
		System.out.println(x);
	}
}