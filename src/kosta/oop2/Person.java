package kosta.oop2;

public class Person {

	private String name;
	private Role2 role;
	
	public Person(){}

/*	public Person(String name, Role role) {
		super();
		this.name = name;
		this.role = role;
	}*/
	public Person(String name, Role2 role) {
		super();
		this.name = name;
		this.role = role;
	}
	
	public void doIt(){
		role.doIt();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Role2 getRole() {
		return role;
	}

	public void setRole2(Role2 role) {
		this.role = role;
	}


	
	
}
