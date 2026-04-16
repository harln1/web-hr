package ex3_bufferedstream;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreamExample {
	public static void main(String[] args) {
		//DataInputStream
		//DataOutputStream
		//기본자료형 단위로 읽고 쓸수 있게 해준다
		//int,double,boolean,char같은 값들을 바이트로 직접 변환하지않고
		//메서드로 편하게 다룰 수있다
		try {
			FileOutputStream fos = new FileOutputStream("data.dat");
			DataOutputStream dos = new DataOutputStream(fos);
			FileInputStream fis = new FileInputStream("data.dat");
			DataInputStream dis = new DataInputStream(fis);
			
			dos.writeInt(100);
			dos.writeDouble(3.14);
			dos.writeBoolean(true);
			
			int a = dis.readInt();
			double b = dis.readDouble();
			boolean c =  dis.readBoolean();
			
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
