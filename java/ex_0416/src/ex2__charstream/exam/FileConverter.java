package ex2__charstream.exam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileConverter {

	public void copy(String source, String target) {

		try (FileInputStream fis = new FileInputStream(source);
			 FileOutputStream fos = new FileOutputStream(target);
			 FileWriter fw = new FileWriter("log.txt", true)) {
            

			byte[] buffer = new byte[1024];
			int bytesRead;
			while ((bytesRead = fis.read(buffer)) != -1) {
				fos.write(buffer, 0, bytesRead);
			}
			
		
			String logMsg = "복사완료: " + source + " -> " + target + "\n";
			fw.write(logMsg);
			
			System.out.println("파일 복사 및 로그 작성이 완료되었습니다.");

		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
