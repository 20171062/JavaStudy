package Chapter5;

public class ArrayEx3 {

	public static void main(String[] args) {
		
		int[] num = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		
		int[] reverseNum = new int[10];
		/*
		reverseNum[9] = num[0];
		reverseNum[8] = num[1];
		reverseNum[7] = num[2];
		reverseNum[6] = num[3];
		reverseNum[5] = num[4];
		reverseNum[4] = num[5];
		reverseNum[3] = num[6];
		reverseNum[2] = num[7];
		reverseNum[1] = num[8];
		reverseNum[0] = num[9];
		 */
		for(int i = 0, j = num.length-1; i < num.length; i++, j--) {
			reverseNum[j] = num[i];
			
		}
		for(int i = 0; i < reverseNum.length; i++) {
				System.out.println(reverseNum[i]);
			}
		}
		}