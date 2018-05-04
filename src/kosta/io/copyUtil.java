package kosta.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class copyUtil {
	
	public static void copy(String srcPath, String destPath)throws Exception{
		//2개의 File객체 생성
		//file || dir 구별
		File srcFile = new File(srcPath);
		File destFile = new File(destPath);
		
		if(!srcFile.exists()){
			throw new Exception("대상이 존재하지 않습니다.");
		}
		
		if(srcFile.isDirectory()){
			copyDirectory(srcFile, destFile);
		}else if(srcFile.isFile()){
			copyFile(srcFile, destFile);
		}		
	}
	
	
	public static void copyDirectory(File source, File dest)throws Exception{
		dest.mkdir(); //경로 생성
		
		File[] fileList = source.listFiles(); //kosta의 경로들이 나옴 
		for(int i=0; i<fileList.length; i++){
			File sourceFile = fileList[i]; //소스파일 경로의 파일 api
			
			if(sourceFile.isDirectory()){
				File s_destFile = new File(dest, sourceFile.getName()); 
				copyDirectory(sourceFile, s_destFile);
			}else{
				File destFile = new File(dest, sourceFile.getName()); //dest는 copy안에 첫번째 파일
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
			in = new FileInputStream(source); // source에서 읽어드리기
			out = new FileOutputStream(dest); // dest에 쓰기

			while ((count = in.read(arr)) != -1) { // 배열의 크기까지 읽는데 이때 더이상 읽을게 없을때 -1 -> arr은 source에서 읽은값
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
