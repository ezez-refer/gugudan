import java.util.Scanner;

public class gugudan1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println("구구단을 만들어봅시다.\n");
		System.out.println("2*1 = 2");
		System.out.println("2*2 = 4");
		System.out.println("2*3 = 6");
		System.out.println("2*4 = 8");
		System.out.println("2*5 = 10");
		System.out.println("2*6 = 12");
		System.out.println("2*7 = 14");
		System.out.println("2*8 = 16");
		System.out.println("2*9 = 18");
		*/
		
//		for(int dan = 2; dan <= 9; dan++) {
//			for(int num = 1; num <= 9; num++) {
//				System.out.println(dan + "*" + num + "=" + dan*num);
//			}
//			System.out.println();
//		}
//		System.out.println("완성~ 깃허브는 이렇게 쓰는거구나!");
		
		// 입력받기
//		int dan;
//		int num;
//		
//		System.out.print("몇 단을 볼까? : ");
//		Scanner sc = new Scanner(System.in);
//		dan = sc.nextInt();
//		
//		for(num = 1; num <= 9; num++) 
//			System.out.println(dan + "*" + num + "=" + dan*num);
//		System.out.println();
		
		//배열
		int[] result = new int[10];
		for(int i = 0; i < result.length; i++)	{
			result[i] = 2*(i+1);
		}
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
		
		//문자열 입력
		System.out.print("입력 : ");
		String m;
		Scanner sc = new Scanner(System.in);
		m = sc.nextLine();
		
		System.out.print("jjn : " + m);
	}
}
