package algorithm;

import java.util.Scanner;

public class B_2438 {
	public static void main(String[] args) {
		// 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제\
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i=0;i<n;i++) {
			/*    i / j     
			 *      0 1 2 3    
			 *    0 *
			 *    1 * *
			 *    2 * * *
			 *    3 * * * *
			 * 
			 */
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scanner.close();

	}
}
