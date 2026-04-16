package ex2__charstream.exam;

import java.io.FileOutputStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		FileConverter converter = new FileConverter();
		try {
		converter.copy("wall.jpg", "wall_copy2.jpg");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}