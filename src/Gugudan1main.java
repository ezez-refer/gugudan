
public class Gugudan1main {

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

		String inputValue = Gugudan1.Mscan();
		String[] splitedValue = inputValue.split(",");
		int dan = Integer.parseInt(splitedValue[0]);
		int times = Integer.parseInt(splitedValue[1]);
		for (int i = 2; i <= dan; i++) {
			int[] result = Gugudan1.Mcalculate(i, times);
			Gugudan1.Mprint(result);
		}
	}
}