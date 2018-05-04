package kosta.thread;

import java.util.ArrayList;
import java.util.List;

public class Manager {
	List<String> list = new ArrayList<String>();
	
	public synchronized void push(String threadName, String bread){
		//스레드이름 대기상태 => list 사이즈가 5 이상
		//스레드이름 무슨빵 만듬 => list 사이즈가 5이하
		//this.wait(), this.notify()

		if (list.size() >= 5) {
			try {
				System.out.println(threadName + " 대기상태");
				this.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			list.add(bread);
			System.out.println(threadName + "	" + bread + " 만듬");
			this.notify();
		}
	
	}
	
	public synchronized void pop(String threadName){
		//스레드이름 대기상태 => list 사이즈가 0일때
		//진열장 빵 갯수: 0몇개
		//스레드이름 무슨빵 사감 => list 사이즈가 1이상
		//this.wait(), this.notify()
		//빵을 만들기전에 사가려하면 wait걸어줌 리스트의 마지막 인덱스를 사감
		//사가고 나면 공간이 생기므로 notify / 반복문 if문 메인에 스레드6개 스타트
		
		if(list.size() == 0){
			try {
				System.out.println(threadName+" 대기상태");
				this.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else {
		
				System.out.println("진열장 빵 갯수 : "+list.size());
				String bread = list.remove(list.size()-1);
				System.out.println(threadName+"  "+bread+" 사감");
				this.notify();
		}	
	}

}
