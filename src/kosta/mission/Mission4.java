package kosta.mission;

public class Mission4 {
	public static void main(String args[]) {
		// 점수값에 대해서 전체 짝수, 홀수의 갯수를 구하자(5자리)
		// 삼항연산자를 이용하여 구하자.
		int num = 52482;
		int even = 0;
		int odd = 0;

		even += (num / 10000 % 2 == 0) ? 1 : 0;
		even += (num / 1000 % 2 == 0) ? 1 : 0;
		even += (num / 100 % 2 == 0) ? 1 : 0;
		even += (num / 10 % 2 == 0) ? 1 : 0;
		even += (num % 2 == 0) ? 1 : 0;

/*		odd += (num / 10000 % 2 != 0) ? 1 : 0;
		odd += (num / 1000 % 2 != 0) ? 1 : 0;
		odd += (num / 100 % 2 != 0) ? 1 : 0;
		odd += (num / 10 % 2 != 0) ? 1 : 0;
		odd += (num % 2 != 0) ? 1 : 0;*/

		odd = 5- even;
		
		System.out.println("짝수 갯수: " + even + " 홀수 갯수: " + odd);

	}
}
