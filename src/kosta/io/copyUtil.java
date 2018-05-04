package kosta.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class copyUtil {
	
	public static void copy(String srcPath, String destPath)throws Exception{
		//2���� File��ü ����
		//file || dir ����
		File srcFile = new File(srcPath);
		File destFile = new File(destPath);
		
		if(!srcFile.exists()){
			throw new Exception("����� �������� �ʽ��ϴ�.");
		}
		
		if(srcFile.isDirectory()){
			copyDirectory(srcFile, destFile);
		}else if(srcFile.isFile()){
			copyFile(srcFile, destFile);
		}		
	}
	
	
	public static void copyDirectory(File source, File dest)throws Exception{
		dest.mkdir(); //��� ����
		
		File[] fileList = source.listFiles(); //kosta�� ��ε��� ���� 
		for(int i=0; i<fileList.length; i++){
			File sourceFile = fileList[i]; //�ҽ����� ����� ���� api
			
			if(sourceFile.isDirectory()){
				File s_destFile = new File(dest, sourceFile.getName()); 
				copyDirectory(sourceFile, s_destFile);
			}else{
				File destFile = new File(dest, sourceFile.getName()); //dest�� copy�ȿ� ù��° ����
				copyFile(sourceFile, destFile);
			}
		}		
	}
	
	
	public static void copyFile(File source, File dest) throws Exception {
		FileInputStream in = null;
		FileOutputStream out = null;
		byte arr[] = new byte[5000];
		int count = 0;

		try {
			in = new FileInputStream(source); // source���� �о�帮��
			out = new FileOutputStream(dest); // dest�� ����

			while ((count = in.read(arr)) != -1) { // �迭�� ũ����� �дµ� �̶� ���̻� ������ ������ -1 -> arr�� source���� ������
				out.write(arr);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (out != null) {
					out.close();
				}
			} catch (Exception e2) {
			}
		}

	}

}
