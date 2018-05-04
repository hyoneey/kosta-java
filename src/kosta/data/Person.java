package kosta.data;

public class Person implements Comparable<Person> {
	
	private String name;
	private int age;
	
	public Person(){}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person p) { //ȣ���ϴ� ����� ù��°��� ���� ,�Ķ���Ͱ� ��
		//���̸� �������� ��������
		if(age< p.age){  //age�� ȣ���ϴ� ��ü�� age, p.age�� �Ķ���ͷ� ���� age
			return -1; //����x
		}else if(age>p.age){
			return 1;
		}
		
		
/*		//�̸��� �������� ��������
		if((name.compareTo(p.name))<0){ //name�� p.name���� ������ ���� ��ȯ
			return -1;
		}
		else if((name.compareTo(p.name))>0){  //name�� p.name���� ������ ��� ��ȯ
			return 1;
		}*/
		return 0;
	}
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	

}
