package kosta.oop;

public class MemberMain {

	public static void main(String[] args){
		Member m = new Member();
/*		m.name ="ȫ�浿";
		m.age = 20;
		
		System.out.println("�̸�: "+m.name);
		System.out.println("����: "+m.age);*/
		
		m.setName("ȫ�浿"); 
		m.setAge(20);
		
		System.out.println("�̸�: "+m.getName());
		System.out.println("����: "+m.getAge());
		
		
		
	}
}
