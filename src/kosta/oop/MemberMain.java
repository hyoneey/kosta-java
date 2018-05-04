package kosta.oop;

public class MemberMain {

	public static void main(String[] args){
		Member m = new Member();
/*		m.name ="홍길동";
		m.age = 20;
		
		System.out.println("이름: "+m.name);
		System.out.println("나이: "+m.age);*/
		
		m.setName("홍길동"); 
		m.setAge(20);
		
		System.out.println("이름: "+m.getName());
		System.out.println("나이: "+m.getAge());
		
		
		
	}
}
