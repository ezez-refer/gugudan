import java.util.Scanner;

public class Gugudan1 {

	// 메소드
	public static int[] Mcalculate(int dan, int times) {	// 계산하는 메소드
		int[] result = new int[times];
		for (int i = 0; i < result.length; i++) {
			result[i] = dan * (i + 1);
		}
		return result;
	}

	public static void Mprint(int[] result) {			// 출력하는 메소드
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static String Mscan() {						// 입력받는 메소드

		System.out.print("몇 단, 몇 회 ? (X,Y 로 입력) : ");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		return input;
	}
}
