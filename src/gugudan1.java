import java.util.Scanner;

public class gugudan1 {

	// 메소드
	public static int[] Mcalculate(int times) {
		int[] result = new int[9];
		for (int i = 0; i < result.length; i++) {
			result[i] = times * (i + 1);
		}
		return result;
	}
	
	public static void Mprint(int[] result) {
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] result = calculate(2);
//		print(result);
//		int[] dan3 = calculate(3);
//		print(dan3);
//		int[] dan4 = calculate(4);
//		print(dan4);
//		int[] dan5 = calculate(5);
//		print(dan5);
		
		for(int i=2; i<10; i++) {
			int[] result = Mcalculate(i);
			Mprint(result);
		}
	}

}
