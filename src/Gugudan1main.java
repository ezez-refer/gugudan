
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

		String inputValue = Gugudan1.Mscan();				// 사용자에게 입력값 받기
		String[] splitedValue = inputValue.split(",");		// 사용자에게 입력 받은 값을 ,를 기준으로 차례로 배열로 저장
		int dan = Integer.parseInt(splitedValue[0]);		// splitedValue 첫 번째 배열값을 int로 변환하여 저장
		int times = Integer.parseInt(splitedValue[1]);		// splitedValue 두 번째 배열값을 int로 변환하여 저장
		for (int i = 2; i <= dan; i++) {					// 메소드 활용하여 결과 출력
			int[] result = Gugudan1.Mcalculate(i, times);
			Gugudan1.Mprint(result);
		}
	}
}