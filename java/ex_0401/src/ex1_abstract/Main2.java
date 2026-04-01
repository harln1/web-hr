package ex1_abstract;

public class Main2 {

    public static void main(String[] args) {

        //Main에서 Delivery타입의 배열에 자식 객체들을 넣고 모든 메서드 호출하기
        Delivery[] d = {new RoketDelivery(), new StorePickup()};
        
        for (Delivery delivery : d) {
            delivery.printlnvoice(); // 부모의 공통 메서드
            delivery.ship();         // 자식에서 오버라이딩된 메서드
            delivery.complete();     // 부모의 공통 메서드
            System.out.println("--------");
        }
        
        Transport[] transport = {
        		new Bus ("버스",1200),
        		new Taxi("택시",4000,10,100),
        		new AirPlane("비행기",10000,10000,1100)
        		
        };
        
        
        
        for(Transport t2 : transport) {
        	t2.printFare();
        	System.out.println("-------------");
        }
    }
}