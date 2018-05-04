package kosta.oop2;

public class Main {

	public static void main(String[] args){
		//abstract
	//	Person p = new Person("홍길동", new Work());	
//		p.setRole(new Driver());
//		p.doIt();
		
/*		//인터페이스
		Person p = new Person("홍길동", new Study());		
		p.doIt();*/

		Dao OracleDao = new OracleDao();
		Dao MySQLDao = new MySQLDao();
		Service service = new Service();
		
//		service.setDao(dao);
		service.setDao(MySQLDao);
		service.inssertService();
		
		
		//익명클라스 - 
/*		Role2 role2 = new Role2{
		public void doIt( ){
			
		}
		}
		
		Role role = new Role() {
			
			@Override
			void doIt() {
			 System.out.println("놀기 역할");				
			}
		};	
		p.setRole(role);
		p.doIt();*/
		
		
		
		
		
	}
}
