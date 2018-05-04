package kosta.studycafe;

import java.io.ObjectInputStream;

import kosta.studycafe.Message;

public class ClientThread implements Runnable {

	ObjectInputStream ois;

	public ClientThread(ObjectInputStream ois) {
		this.ois = ois;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Message m = (Message) ois.readObject();
				System.out.println(m);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
