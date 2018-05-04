package kosta.oop2;

public class Service {
	private Dao dao;

	public Service(){}
	
	public void inssertService(){
		dao.Insert();
	}
	
	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}
	
	
}
