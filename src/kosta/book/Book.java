package kosta.book;

public class Book {

	String book_Name;
	int book_Price;
	int book_Price_Dc;
	
	public Book(){} // 생성자
		
	public Book(String book_Name, int book_Price) {
		super();
		this.book_Name = book_Name;
		this.book_Price = book_Price;
	}

/*	// 책값 할인율 계산
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
	
	// 책값 할인율 계산
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
	 
	//책 값출력
	void print(){
		System.out.println(book_Name+" 교재의 정가는 "+book_Price+"원이며,  할인된 가격은 "+book_Price_Dc+"원 입니다.");
	}
}
