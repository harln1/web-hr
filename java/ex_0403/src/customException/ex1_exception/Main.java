package customException.ex1_exception;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        Converter2 cv = new Converter2();
        OrderService service = new OrderService();

        try {
            System.out.print("가격: ");
            String priceStr = sc.next();
            int price = cv.toInt(priceStr);

            System.out.print("수량 : ");
            String qtyStr = sc.next();
            int quantity = cv.toInt(qtyStr);

            int total = service.calculateTotal(price, quantity);
            System.out.println("총 주문 금액: " + total + "원");

        } catch (NumberFormatException e) {
         
            System.out.println("숫자 형식 오류");
        } catch (IllegalArgumentException e) {
           
            System.out.println(e.getMessage()); 
            
        }
        
    }
}