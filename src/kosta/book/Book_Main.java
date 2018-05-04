package kosta.book;

public class Book_Main {
	public static void main(String[] args){
		
		
		Book arr[] = {
				new Book("JAVA", 30000),
				new Book("JSP", 25000),
				new Book("Oracle", 15000)
		};
		
		
/*		Book arr[] = new Book[3];
		arr[0] = new Book();
		arr[1] = new Book();
		arr[2] = new Book();
		
		arr[0].book_Name = "JAVA";
		arr[0].book_Price = 30000;
		arr[0].book_Price_Dc = arr[0].price_DC(arr[0].book_Price);
		arr[0].book_Price_Dc =arr[0].price_DC();
		
		arr[1].book_Name = "JSP";
		arr[1].book_Price = 25000;
		arr[1].book_Price_Dc = arr[1].price_DC(arr[1].book_Price);
		
		arr[2].book_Name = "Oracle";
		arr[2].book_Price = 15000;
		arr[2].book_Price_Dc = arr[2].price_DC(arr[2].book_Price);
		*/
		
		for(int i=0; i<arr.length; i++){
			arr[i].price_DC();
			arr[i].print();
			System.out.println();
		}
		
	}
}
