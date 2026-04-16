package ex3_bufferedstream;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderExample {
	public static void main(String[] args) {
		try (FileReader fr = new FileReader("test.txt"); BufferedReader br = new BufferedReader(fr);) {
			String line;
			while ((line = br.readLine()) != null) {

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
