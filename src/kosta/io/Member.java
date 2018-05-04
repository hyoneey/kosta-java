package kosta.io;

import java.io.Serializable;

public class Member implements Serializable { //직렬화가 가능한 클래스 - 바이트로 변환되는 것은 필드 ,생성자 &메소드는 직렬화가 되지 않는다.
	//static , transient가 붙어있을 경우 직렬화가 되지 않는다.
	private String name;
	private int age;
	
	public Member(){}

	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
		return "Member [name=" + name + ", age=" + age + "]";
	}
	
	
}
