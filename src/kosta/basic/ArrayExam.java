package kosta.basic;

public class ArrayExam {

	public static void main(String[] args){
		//1.�迭 ����, ���� �и�
		int arr[]; //�ּҰ��� ���� �� �մ� ������ ����
		arr = new int[5];  //int�� 5���� ������ ����, arr������ �ּҰ��� �����Ѵ�.

		//2.�迭�� ����� ������ �Բ�
		int arr2[] = new int[5];

		//3.�迭����� ������ �ʱ�ȭ �Բ�
		int arr3[] = {1,2,3,4,5};

		/*		for(int i=0; i<arr3.length; i++){
			System.out.println("arr3["+i+"]="+arr3[i]);
		}*/

		/*		for(int j : arr3){
			System.out.print(j+","); //���� for�� -> ���� �˷��� �Ҷ� ����Ѵ�. �ε����� �� �� ����.
		}*/

		//1.�迭�� ���� ������Ÿ���� �����ΰ�?
		//2.��� ������ �ʿ��Ѱ�? �迭�� ũ�� ���� => �迭�� ũ�⸦ �ʰ��ϸ� IndexOutOfBoundsException ���� �߻�
		//3.�迭�� ��� �ʱ�ȭ ( �����Է�=> �ε����� ����, for��, ������ ���ÿ� )
		//4.�迭�ȿ� �ִ� �����͸�  ��� ( for��, ���� for�� )

		//����
		//7���� ����� �迭�ȿ� �ʱ�ȭ �� �迭���� �������.

		int arr4[]= new int[9];
		for(int i=0; i<arr4.length; i++){
			arr4[i] = 7*(i+1);	
			System.out.println("�迭 ["+(i+1)+"] = "+ arr4[i]);
		}

	}
}
