class Solution {
	public static void reverseString(char[] s) {
		for(int i = 0;i < s.length/2;i++) {
			char temp = s[i];
			s[i] = s[s.length-1-i];
			s[s.length-1-i] = temp;
		}
	}
	
	public static void main(String[] args) {
		char[] s1 = {'h','e','l','l','o'};
		char[] s2 = {'H','a','n','n','a','h'};
		reverseString(s2);
		System.out.println(s2);
	}
}