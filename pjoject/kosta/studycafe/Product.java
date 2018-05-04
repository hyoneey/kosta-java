package kosta.studycafe;

// ��ǰ Class
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
		return " [��ǰ ����] " + productType + "��" + " �̿��" + ", ����=" + productPrice;
	}
	
}
