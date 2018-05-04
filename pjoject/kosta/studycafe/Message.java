package kosta.studycafe;

import java.io.Serializable;

public class Message implements Serializable {
	String data;
	String id;

	public Message() {
		super();
	}

	public Message(String id, String data) {
		super();
		this.data = data;
		this.id = id;
	}

	@Override
	public String toString() {
		return id + ": " + data;
	}

}
