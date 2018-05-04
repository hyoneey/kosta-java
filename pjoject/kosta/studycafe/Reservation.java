package kosta.studycafe;

public class Reservation {
	
	String ResevationDate="";
	String ResevationPhone="";

   public Reservation() {
   }

public Reservation(String resevationDate, String resevationPhone) {
	super();
	ResevationDate = resevationDate;
	ResevationPhone = resevationPhone;
}

public String getResevationDate() {
	return ResevationDate;
}

public void setResevationDate(String resevationDate) {
	ResevationDate = resevationDate;
}

public String getResevationPhone() {
	return ResevationPhone;
}

public void setResevationPhone(String resevationPhone) {
	ResevationPhone = resevationPhone;
}

@Override
public String toString() {
	return "Reservation [ResevationDate=" + ResevationDate + ", ResevationPhone=" + ResevationPhone + "]";
}
   
}
