package kosta.studycafe;

public class Drink {
	   private String drinkName;
	   private int drinkPrice;
	   private String phoneNo;
	   
	   public Drink(){}
	   
	   public Drink(String drinkName, int drinkPrice){
	      this.drinkName = drinkName;
	      this.drinkPrice = drinkPrice;
	   }
	   public Drink(String drinkName, int drinkPrice, String phoneNo) {
	      this.drinkName = drinkName;
	      this.drinkPrice = drinkPrice;
	      this.phoneNo = phoneNo;
	   }
	   
	   public String getDrinkName() {
	      return drinkName;
	   }
	   public void setDrinkName(String drinkName) {
	      this.drinkName = drinkName;
	   }

	   public int getDrinkPrice() {
	      return drinkPrice;
	   }
	   public void setDrinkPrice(int drinkPrice) {
	      this.drinkPrice = drinkPrice;
	   }
	   
	   public String getPhoneNo() {
	      return phoneNo;
	   }

	   public void setPhoneNo(String phoneNo) {
	      this.phoneNo = phoneNo;
	   }

	   @Override
	   public String toString() {
	      return " [음료정보] "  + drinkName + ", 가격=" + drinkPrice;
	   }
	   


}
