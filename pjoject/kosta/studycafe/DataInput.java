package kosta.studycafe;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DataInput {

	public DataInput() {}

	static String DataInsert() {
		String input = null;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			input = br.readLine();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return input;
	}
}
