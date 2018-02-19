package algorithm;

import java.util.Scanner;

public class B_1924 {
	public static void main(String[] args) {
		// 오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 이를 알아내는 프로그램을 작성하시오.
		Scanner scanner = new Scanner(System.in);
		int sum = -1; // 시작날을 제외하고 셈함.
		int m = scanner.nextInt(); // 월 입력
		for (int i = 1; i < m; i++) { // 1월은 1월 총 일수에서 마이너스 / 입력한 달이 속한 일수는 d만 더하면 되고 그 사이 월의 일수는 반복문으로 구한다.
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
				sum += 31;
			} else if (i == 4 || i == 6 || i == 9 || i == 11) {
				sum += 30;
			} else if (i == 2) {
				sum += 28;
			}
		} // 사이의 달의 일수를 다 구했다.
		int d = scanner.nextInt();
		sum += d; // 해당 월의 일수를 더했다.
		switch (sum % 7) {
		case 0:
			System.out.println("MON");
			break;
		case 1:
			System.out.println("TUE");
			break;
		case 2:
			System.out.println("WED");
			break;
		case 3:
			System.out.println("THU");
			break;
		case 4:
			System.out.println("FRI");
			break;
		case 5:
			System.out.println("SAT");
			break;
		case 6:
			System.out.println("SUN");
			break;
		}
		scanner.close();
	}
}
