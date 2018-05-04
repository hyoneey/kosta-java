package kosta.studycafe;

import java.util.ArrayList;
import java.util.List;

import kosta.studycafe.DataInput;
import kosta.studycafe.Drink;
import kosta.studycafe.ReservationInfo;
import kosta.studycafe.Ticket;

public class Order extends ReservationInfo {
   static List<Drink> buyDrinks = new ArrayList<Drink>();
   static int productCount=0;

   public Order() {
   }

   public static void buyTicket(String phoneNo) {
      CalendarInfo cal = new CalendarInfo();
      

      System.out.println();
      System.out.println("***** Ƽ�� ���� ȭ�� *****");

      // �������� ����Ʈ�� �������� ���� ��
      if (reservationList.size() == 0) {
         System.out.println("���� ����� �ο��� �������� �ʽ��ϴ�. ���� ������ �ο���: " + count);
         System.out.println("������ ���� ���� ���ּ���.");
         return;
      }
      
      if(!(reservationList.contains(phoneNo))){
    	  System.out.println("���������� �������� �ʽ��ϴ�.");
      }
      


      // ���������� ����Ʈ�� ���� �� ��
      for (int i = 0; i < reservationList.size(); i++) {
         // ���� ����Ʈ�� ��ȣ Ȯ��
         if (reservationList.get(i).getResevationPhone().equals(phoneNo)) { 
            // ��ȣ ��ġ �� ���೯¥ Ȯ��
            if (reservationList.get(i).getResevationDate().equals(cal.nowDay())) { 
               Ticket ticket = new Ticket();
               System.out.println("������ Ƽ���� �������ּ���\n1.����� 2.�Ϲݱ�");
               String ticketNum = DataInput.DataInsert();

               switch (ticketNum) {
               case "1": // �����
                  for (int j = 0; j < list.size(); j++) {
                     if (phoneNo.equals(list.get(j).getPhoneNo())) {
                        if (list.get(j).getType().equals("����� ȸ��")) {
                           System.out.println("�̹� ������� �����ϰ� �ֽ��ϴ�.");
                        } else if (list.get(j).getType().equals("�Ϲݱ� ȸ��")) {
                           System.out.println("�̹� �Ϲݱ��� �����ϰ� �ֽ��ϴ�.");
                        } else if (list.get(j).getType().equals("")) {
                           ticket.seasonTicket(phoneNo);
                           list.get(j).setType("����� ȸ��");
                           buyDrink(phoneNo);
                           return;
                        }
                     }
                  }
                  break;

               case "2":// �Ϲݱ�
                  for (int k = 0; k < list.size(); k++) {
                     if (phoneNo.equals(list.get(k).getPhoneNo())) {
                        if (list.get(k).getType().equals("�Ϲݱ� ȸ��")) {
                           System.out.println("�̹� �Ϲݱ��� �����ϰ� �ֽ��ϴ�.");
                        } else if (list.get(k).getType().equals("����� ȸ��")) {
                           System.out.println("�̹� ������� �����ϰ� �ֽ��ϴ�.");
                        } else if (list.get(k).getType().equals("")) {
                           ticket.oneDayTicket();
                           list.get(k).setType("�Ϲݱ� ȸ��");
                           buyDrink(phoneNo);
                           return;
                        }
                     }
                  }
                  break;

               }// switch�� end
            } // ��¥ ��ġ if�� end
            else { // ��¥�� ����ġ
               System.out.println(cal.nowDay() + " ��¥�� ����� ������ �������� �ʽ��ϴ�.");
               return;
            }
         } 
      } // for�� end
   
   }// buy ticket end

   // ���ᱸ��
   public static void buyDrink(String phoneNo) {
      System.out.println();
      System.out.println("***** ���� ���� ȭ�� *****");
      System.out.println("������ ���Ḧ �������ּ���");
      System.out.println();
      if (productCount == 0) {
         ProductManager.basicProduct(); // ��ǰ ����
      }
      productCount++;

      //��ǰ ���� ���
      for (int j = 0; j < ProductManager.drinks.size(); j++) {
         System.out.print("[" + (j+1) + "] ");
         System.out.println(ProductManager.drinks.get(j));
      }
      System.out.println("[" + (ProductManager.drinks.size()+1 ) + "] ���� ����");
      
      //��ǰ ��ȣ ����
      String drinkNum = DataInput.DataInsert();

      
/*      for (int i = 0; i < ProductManager.drinks.size(); i++) {
         if (drinkNum.equals(String.valueOf(i))) {
            System.out.println(ProductManager.drinks.get(i).getDrinkName() + "�� �����մϴ�.");
            // ���� ����Ʈ�� �߰�
            buyDrinks.add(new Drink(ProductManager.drinks.get(i).getDrinkName(),
                  ProductManager.drinks.get(i).getDrinkPrice(), ProductManager.drinks.get(i).getPhoneNo()));         
         } 
      }*/
      
      switch (drinkNum) {
      case "1": //index0 
         System.out.println(ProductManager.drinks.get(0).getDrinkName() + "�� �����մϴ�.");
         buyDrinks.add(new Drink(ProductManager.drinks.get(0).getDrinkName(),
               ProductManager.drinks.get(0).getDrinkPrice(), ProductManager.drinks.get(0).getPhoneNo()));      
         break;
      case "2"://index1 
         System.out.println(ProductManager.drinks.get(1).getDrinkName() + "�� �����մϴ�.");
         buyDrinks.add(new Drink(ProductManager.drinks.get(1).getDrinkName(),
               ProductManager.drinks.get(1).getDrinkPrice(), ProductManager.drinks.get(1).getPhoneNo()));      
         break;
      case "3"://index2 
         System.out.println(ProductManager.drinks.get(2).getDrinkName() + "�� �����մϴ�.");
         buyDrinks.add(new Drink(ProductManager.drinks.get(2).getDrinkName(),
               ProductManager.drinks.get(2).getDrinkPrice(), ProductManager.drinks.get(2).getPhoneNo()));      
         break;
      case "4":
         System.out.println("���Ḧ �������� �ʽ��ϴ�.");
         break;

      default:
         return;
      }
      
      
   }//buy Drink end
   
}