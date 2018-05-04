package kosta.basic;

public class ArrayExam {

	public static void main(String[] args){
		//1.배열 선언, 생성 분리
		int arr[]; //주소값을 넣을 수 잇는 변수가 생성
		arr = new int[5];  //int형 5개의 변수가 생성, arr변수에 주소값이 대입한다.

		//2.배열의 선언과 생성을 함께
		int arr2[] = new int[5];

		//3.배열선언과 생성과 초기화 함께
		int arr3[] = {1,2,3,4,5};

		/*		for(int i=0; i<arr3.length; i++){
			System.out.println("arr3["+i+"]="+arr3[i]);
		}*/

		/*		for(int j : arr3){
			System.out.print(j+","); //향상된 for문 -> 값만 알려고 할때 사용한다. 인덱스는 알 수 없다.
		}*/

		//1.배열에 사용될 데이터타입이 무엇인가?
		//2.몇개의 변수가 필요한가? 배열의 크기 결정 => 배열의 크기를 초과하면 IndexOutOfBoundsException 예외 발생
		//3.배열을 어떻게 초기화 ( 직접입력=> 인덱스를 접근, for문, 생성과 동시에 )
		//4.배열안에 있는 데이터를  출력 ( for문, 향상된 for문 )

		//퀴즈
		//7단의 결과를 배열안에 초기화 후 배열에서 출력하자.

		int arr4[]= new int[9];
		for(int i=0; i<arr4.length; i++){
			arr4[i] = 7*(i+1);	
			System.out.println("배열 ["+(i+1)+"] = "+ arr4[i]);
		}

	}
}
