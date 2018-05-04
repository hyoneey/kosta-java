package kosta.io;

import java.io.File;

public class FileMission1 {

	public static void fileList(File file) throws Exception {
		if (!file.exists() || !file.isDirectory()) {
			throw new Exception("디렉토리가 아닙니다.");
		}

		File[] list = file.listFiles();
		for (int i = 0; i < list.length; i++) {
			if (list[i].isDirectory()) {
				System.out.println();
				System.out.println("*** " + list[i].getName() + " dir");
				fileList(list[i]);
			} else {
				System.out.println(" -  " + list[i].getName());
			}
		}
	}

	public static void main(String[] args) {
		String path = "C:\\javawork\\kosta180\\Java_Basic\\src";
		File f = new File(path);

		try {
			fileList(f);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
