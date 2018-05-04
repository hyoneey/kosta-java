package kosta.studycafe;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
	   // 관리자기ㅏ 상품 추가 하는 부분이 없어서
	   // 일단 메소드로 상품 추가처리
	   static List<Product> products = new ArrayList<Product>();
	   static List<Drink> drinks = new ArrayList<Drink>();
	   static int pCount=0;
	   
	   static void basicProduct(){
	      // 일단 출력되도록 기본 상품 등록되는 메소드 만듦
	      products.add(new Product(2000, 1));
	      products.add(new Product(29000, 14));
	      products.add(new Product(55000, 30));
	      
	      drinks.add(new Drink("아메리카노", 1000));
	      drinks.add(new Drink("밀크 쉐이크", 2000));
	      drinks.add(new Drink("프라푸치노", 3000));
	   }
	   
	   static void listProduct(){
	      if(pCount==0) {
	         basicProduct();
	      }
	      pCount++;
	      System.out.println();
	      System.out.println("***** 상품 조회 화면 *****");

	      // 상품 리스트 출력
	      for(Product product : products){
	         System.out.println(product.toString());
	      }
	      System.out.println();
	      for(Drink drink : drinks){
	         System.out.println(drink.toString());
	      }
	   }
	   
	   
	
}
