import java.util.Scanner;

public class Gugudan1 {

	// 메소드
	public static int[] Mcalculate(int dan, int times) {
		int[] result = new int[times];
		for (int i = 0; i < result.length; i++) {
			result[i] = dan * (i + 1);
		}
		return result;
	}

	public static void Mprint(int[] result) {
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static String Mscan() {

		System.out.print("몇 단, 몇 회 ? (X,Y 로 입력) : ");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		return input;
	}
}
