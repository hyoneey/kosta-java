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
	public int compareTo(Person p) { //호출하는 사람이 첫번째라고 생각 ,파라미터가 뒤
		//나이를 기준으로 오름차순
		if(age< p.age){  //age는 호출하는 객체의 age, p.age는 파라미터로 오는 age
			return -1; //변경x
		}else if(age>p.age){
			return 1;
		}
		
		
/*		//이름을 기준으로 오름차순
		if((name.compareTo(p.name))<0){ //name이 p.name보다 작으면 음수 반환
			return -1;
		}
		else if((name.compareTo(p.name))>0){  //name이 p.name보다 작으면 양수 반환
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
