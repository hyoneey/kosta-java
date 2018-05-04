package kosta.basic;

public class SortingExam {

	public static void main(String[] args){
		int arr[] = {39,12,65,2,56,98,51};
		//선택정렬 (내림차순)
		//1회전 : (1번 2번) -> (1번 3번) -> (1번 4번)
		//2회전 : (2번 4번) -> (2번 4번)
		//3회전 : (3번 4번)
		
/*		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i] < arr[j]){
					int temp;
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}*/
		
		//버블정렬
		//1회전 : (1번 2번) -> (2번 3번) -> (3번 4번)
		//2회전 : (1번 2번) -> (2번 3번) -
		//3회전 : (1번 2번) 
		
		for(int i=1; i<arr.length; i++){
			for(int j=0; j<arr.length-1; j++){
				if(arr[j]>arr[j+1]){
					int temp;
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		
		
		
		
		for(int n : arr){
			System.out.print(n+",");
		}
		
	}
}
