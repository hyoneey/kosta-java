package kosta.studycafe;

// 상품 Class
public class Product {
	
	private int productPrice;
	private int productType;
	
	public Product(){}

	public Product(int productPrice, int productType){
		this.productPrice = productPrice;
		this.productType = productType;
	}
	
	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductType() {
		return productType;
	}

	public void setProductType(int productType) {
		this.productType = productType;
	}

	@Override
	public String toString() {
		return " [상품 정보] " + productType + "일" + " 이용권" + ", 가격=" + productPrice;
	}
	
}
