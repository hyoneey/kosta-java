package kosta.oop2;

public class Main {

	public static void main(String[] args){
		//abstract
	//	Person p = new Person("ȫ�浿", new Work());	
//		p.setRole(new Driver());
//		p.doIt();
		
/*		//�������̽�
		Person p = new Person("ȫ�浿", new Study());		
		p.doIt();*/

		Dao OracleDao = new OracleDao();
		Dao MySQLDao = new MySQLDao();
		Service service = new Service();
		
//		service.setDao(dao);
		service.setDao(MySQLDao);
		service.inssertService();
		
		
		//�͸�Ŭ�� - 
/*		Role2 role2 = new Role2{
		public void doIt( ){
			
		}
		}
		
		Role role = new Role() {
			
			@Override
			void doIt() {
			 System.out.println("��� ����");				
			}
		};	
		p.setRole(role);
		p.doIt();*/
		
		
		
		
		
	}
}
