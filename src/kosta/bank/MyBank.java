package kosta.bank;

public class MyBank {

	private Customer[] customers;
	int customersNum;

	MyBank() {
		customers= new Customer[10];
	}

	public void addCustomer(String id, String name, long balance) {
		customers[customersNum++] = new Customer(id, name, balance);
	}

	public int getCustomersNum() {
		return customersNum;
	}

	public Customer getCustomer(String id) {
		for (int i = 0; i < customersNum; i++) {
			if (id.equals(customers[i].getID())) {
				return customers[i];
			}
		}
		return null;
	}

	public Customer[] getAllCustomer() { //�迭 copy - �������� ������ ũ����� null pointer�� �߻�
		Customer copy[] = new Customer[customersNum];
		System.arraycopy(customers, 0, copy, 0, customersNum);
		return copy;
	}

}
