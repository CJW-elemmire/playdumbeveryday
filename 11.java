import java.util.*;
class Solution {
	public static void rotate(int[][] matrix) {
		for(int i = 0;i < matrix.length;i++) {
			for(int j = 0;j < i;j++) {
				int temp = matrix[j][i];
				matrix[j][i] = matrix[i][j];
				matrix[i][j] = temp;
			}
		}
		for(int i = 0;i < matrix.length;i++) {
			for(int j = 0;j < matrix.length/2;j++) {
				int temp = matrix[i][matrix.length-1-j];
				matrix[i][matrix.length-1-j] = matrix[i][j];
				matrix[i][j] = temp;
			}
		}
	}
	
	public static void main(String[] args) {
		int[][] matrix1 = {{1,2,3},
						   {4,5,6},
						   {7,8,9}};
		int[][] matrix2 = {{5,1,9,11},
						   {2,4,8,10},
						   {13,3,6,7},
						   {15,14,12,16}};
		int[][] matrix3 = {{1}};
		int[][] matrix4 = {{1,2},{3,4}};
		rotate(matrix1);
		for(int i = 0;i < matrix1.length;i++)
		System.out.print(Arrays.toString(matrix1[i]));
	}
}