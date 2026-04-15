package ex3_bytestream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LogExample {
    public static void main(String[] args) {
        
        File file = new File("C:\\Users\\adminn\\Desktop\\eclipse\\file.txt");
        int count = 0;

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                if (line.contains("ERROR")) {
                    count++;
                }
            }

            System.out.println("ERROR 라는 단어가 " + count + "번 등장합니다.");
            scanner.close();
            
        } catch (FileNotFoundException e) {
           
            System.out.println("파일 경로를 확인해주세요: " + e.getMessage());
        }
    } 
}
