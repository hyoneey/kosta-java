package kosta.basic;

public class SortingExam {

	public static void main(String[] args){
		int arr[] = {39,12,65,2,56,98,51};
		//�������� (��������)
		//1ȸ�� : (1�� 2��) -> (1�� 3��) -> (1�� 4��)
		//2ȸ�� : (2�� 4��) -> (2�� 4��)
		//3ȸ�� : (3�� 4��)
		
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
		
		//��������
		//1ȸ�� : (1�� 2��) -> (2�� 3��) -> (3�� 4��)
		//2ȸ�� : (1�� 2��) -> (2�� 3��) -
		//3ȸ�� : (1�� 2��) 
		
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
