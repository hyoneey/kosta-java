package kosta.book;

public class Book {

	String book_Name;
	int book_Price;
	int book_Price_Dc;
	
	public Book(){} // ������
		
	public Book(String book_Name, int book_Price) {
		super();
		this.book_Name = book_Name;
		this.book_Price = book_Price;
	}

/*	// å�� ������ ���
	int price_DC(int price){
		if(price >= 30000){
			price *=0.75; //25%
		}
		else if(price >= 20000){
			price *= 0.80; //20%		
		}
		else if(price >= 15000){
			price *= 0.85; // 15%
		}
		
		book_Price_Dc = price;
		return book_Price_Dc;
	}*/
	
	// å�� ������ ���
	 void price_DC(){
		if(book_Price >= 30000){
			book_Price_Dc = (int) (book_Price * 0.75);
		}
		else if(book_Price >= 20000){	
			book_Price_Dc = (int) (book_Price * 0.80);
		}
		else if(book_Price >= 15000){
			book_Price_Dc = (int) (book_Price * 0.85);
		}
	}
	 
	//å �����
	void print(){
		System.out.println(book_Name+" ������ ������ "+book_Price+"���̸�,  ���ε� ������ "+book_Price_Dc+"�� �Դϴ�.");
	}
}
