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
      System.out.println("***** 티켓 구매 화면 *****");

      // 예약정보 리스트가 존재하지 않을 때
      if (reservationList.size() == 0) {
         System.out.println("오늘 예약된 인원이 존재하지 않습니다. 예약 가능한 인원수: " + count);
         System.out.println("예약을 먼저 진행 해주세요.");
         return;
      }
      
      if(!(reservationList.contains(phoneNo))){
    	  System.out.println("예약정보가 존재하지 않습니다.");
      }
      


      // 예약정보가 리스트가 존재 할 때
      for (int i = 0; i < reservationList.size(); i++) {
         // 예약 리스트에 번호 확인
         if (reservationList.get(i).getResevationPhone().equals(phoneNo)) { 
            // 번호 일치 후 예약날짜 확인
            if (reservationList.get(i).getResevationDate().equals(cal.nowDay())) { 
               Ticket ticket = new Ticket();
               System.out.println("구입할 티켓을 선택해주세요\n1.정기권 2.일반권");
               String ticketNum = DataInput.DataInsert();

               switch (ticketNum) {
               case "1": // 정기권
                  for (int j = 0; j < list.size(); j++) {
                     if (phoneNo.equals(list.get(j).getPhoneNo())) {
                        if (list.get(j).getType().equals("정기권 회원")) {
                           System.out.println("이미 정기권을 소지하고 있습니다.");
                        } else if (list.get(j).getType().equals("일반권 회원")) {
                           System.out.println("이미 일반권을 소지하고 있습니다.");
                        } else if (list.get(j).getType().equals("")) {
                           ticket.seasonTicket(phoneNo);
                           list.get(j).setType("정기권 회원");
                           buyDrink(phoneNo);
                           return;
                        }
                     }
                  }
                  break;

               case "2":// 일반권
                  for (int k = 0; k < list.size(); k++) {
                     if (phoneNo.equals(list.get(k).getPhoneNo())) {
                        if (list.get(k).getType().equals("일반권 회원")) {
                           System.out.println("이미 일반권을 소지하고 있습니다.");
                        } else if (list.get(k).getType().equals("정기권 회원")) {
                           System.out.println("이미 정기권을 소지하고 있습니다.");
                        } else if (list.get(k).getType().equals("")) {
                           ticket.oneDayTicket();
                           list.get(k).setType("일반권 회원");
                           buyDrink(phoneNo);
                           return;
                        }
                     }
                  }
                  break;

               }// switch문 end
            } // 날짜 일치 if문 end
            else { // 날짜가 불일치
               System.out.println(cal.nowDay() + " 날짜로 예약된 정보가 존재하지 않습니다.");
               return;
            }
         } 
      } // for문 end
   
   }// buy ticket end

   // 음료구입
   public static void buyDrink(String phoneNo) {
      System.out.println();
      System.out.println("***** 음료 구입 화면 *****");
      System.out.println("구입할 음료를 선택해주세요");
      System.out.println();
      if (productCount == 0) {
         ProductManager.basicProduct(); // 상품 생성
      }
      productCount++;

      //상품 정보 출력
      for (int j = 0; j < ProductManager.drinks.size(); j++) {
         System.out.print("[" + (j+1) + "] ");
         System.out.println(ProductManager.drinks.get(j));
      }
      System.out.println("[" + (ProductManager.drinks.size()+1 ) + "] 선택 안함");
      
      //상품 번호 선택
      String drinkNum = DataInput.DataInsert();

      
/*      for (int i = 0; i < ProductManager.drinks.size(); i++) {
         if (drinkNum.equals(String.valueOf(i))) {
            System.out.println(ProductManager.drinks.get(i).getDrinkName() + "를 구매합니다.");
            // 음료 리스트에 추가
            buyDrinks.add(new Drink(ProductManager.drinks.get(i).getDrinkName(),
                  ProductManager.drinks.get(i).getDrinkPrice(), ProductManager.drinks.get(i).getPhoneNo()));         
         } 
      }*/
      
      switch (drinkNum) {
      case "1": //index0 
         System.out.println(ProductManager.drinks.get(0).getDrinkName() + "를 구매합니다.");
         buyDrinks.add(new Drink(ProductManager.drinks.get(0).getDrinkName(),
               ProductManager.drinks.get(0).getDrinkPrice(), ProductManager.drinks.get(0).getPhoneNo()));      
         break;
      case "2"://index1 
         System.out.println(ProductManager.drinks.get(1).getDrinkName() + "를 구매합니다.");
         buyDrinks.add(new Drink(ProductManager.drinks.get(1).getDrinkName(),
               ProductManager.drinks.get(1).getDrinkPrice(), ProductManager.drinks.get(1).getPhoneNo()));      
         break;
      case "3"://index2 
         System.out.println(ProductManager.drinks.get(2).getDrinkName() + "를 구매합니다.");
         buyDrinks.add(new Drink(ProductManager.drinks.get(2).getDrinkName(),
               ProductManager.drinks.get(2).getDrinkPrice(), ProductManager.drinks.get(2).getPhoneNo()));      
         break;
      case "4":
         System.out.println("음료를 선택하지 않습니다.");
         break;

      default:
         return;
      }
      
      
   }//buy Drink end
   
}