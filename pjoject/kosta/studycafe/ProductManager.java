package kosta.studycafe;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
	   // �����ڱ⤿ ��ǰ �߰� �ϴ� �κ��� ���
	   // �ϴ� �޼ҵ�� ��ǰ �߰�ó��
	   static List<Product> products = new ArrayList<Product>();
	   static List<Drink> drinks = new ArrayList<Drink>();
	   static int pCount=0;
	   
	   static void basicProduct(){
	      // �ϴ� ��µǵ��� �⺻ ��ǰ ��ϵǴ� �޼ҵ� ����
	      products.add(new Product(2000, 1));
	      products.add(new Product(29000, 14));
	      products.add(new Product(55000, 30));
	      
	      drinks.add(new Drink("�Ƹ޸�ī��", 1000));
	      drinks.add(new Drink("��ũ ����ũ", 2000));
	      drinks.add(new Drink("����Ǫġ��", 3000));
	   }
	   
	   static void listProduct(){
	      if(pCount==0) {
	         basicProduct();
	      }
	      pCount++;
	      System.out.println();
	      System.out.println("***** ��ǰ ��ȸ ȭ�� *****");

	      // ��ǰ ����Ʈ ���
	      for(Product product : products){
	         System.out.println(product.toString());
	      }
	      System.out.println();
	      for(Drink drink : drinks){
	         System.out.println(drink.toString());
	      }
	   }
	   
	   
	
}
