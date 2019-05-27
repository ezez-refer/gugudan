
public class gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("구구단을 만들어봅시다.\n");
		/*System.out.println("2*1 = 2");
		System.out.println("2*2 = 4");
		System.out.println("2*3 = 6");
		System.out.println("2*4 = 8");
		System.out.println("2*5 = 10");
		System.out.println("2*6 = 12");
		System.out.println("2*7 = 14");
		System.out.println("2*8 = 16");
		System.out.println("2*9 = 18");
		*/
		
		for(int dan = 2; dan <= 9; dan++) {
			for(int num = 1; num <= 9; num++) {
				System.out.println(dan + "*" + num + "=" + dan*num);
			}
			System.out.println();
		}
		System.out.println("완성~");
	}
}
