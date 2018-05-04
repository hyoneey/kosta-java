package kosta.basic;

public class ArrayExam2 {

	public static void main(String[] args){
		
		int arr[][]; // 2차원배열 선언
		arr = new int[3][2];
		
		//2차원의 배열크기를 상이하게
		int arr2[][] = new int[3][];
		arr2[0] = new int[2];
		arr2[1] = new int[3];
		arr2[2] = new int[4];
		
		int arr3[][] = {{1,2},{3,4,5},{6,7,8,9}};
		
		for(int i=0; i<arr3.length; i++){ //1차원배열의 크기를 나타냄 -> .length
			for(int j=0; j<arr3[i].length; j++){
				System.out.println("arr3["+i+"]["+j+"] = "+arr3[i][j]);
			}
		}
		
		int oldArr[] = new int[5];
		oldArr[0] = 10;
		oldArr[1] = 20;
		oldArr[2] = 30;
		
		int newArr[] = new int[3];
		
		System.arraycopy(oldArr, 0, newArr, 0, newArr.length);
		
		for(int n : newArr){
			System.out.print(n + ",");
		}
		
		
	}
}
