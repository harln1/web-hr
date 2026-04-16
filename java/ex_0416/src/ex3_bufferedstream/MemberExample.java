package ex3_bufferedstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class MemberExample {
	public static void main(String[] args) {
		
		
		try (
			BufferedReader br = new BufferedReader(
					new InputStreamReader(new FileInputStream("members.csv"), "MS949"));
			BufferedWriter bw = new BufferedWriter(
					new OutputStreamWriter(new FileOutputStream("senior_members.txt"), "UTF-8"))
		) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				if (data.length < 2) continue; 

				int age = Integer.parseInt(data[1].trim()); 
				
				if (age >= 30) {
					bw.write(line);
					bw.newLine();
				}
			}
			System.out.println("작업 완료! 나이가 30이상인 회원만 senior_members.txt 로 저장되었습니다.");
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("나이 변환 중 오류 발생: 데이터 형식을 확인하세요."); 
		}
	}
}

