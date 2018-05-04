package kosta.io;

public class FileMission2 {

	public static void main(String[] args) {
		String source = "C:\\javawork\\kosta180\\Java_Basic\\src\\kosta";
		String dest = "C:\\javawork\\kosta180\\copy";

		try {
			copyUtil.copy(source, dest);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
