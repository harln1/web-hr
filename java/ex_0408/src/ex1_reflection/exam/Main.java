package ex1_reflection.exam;

import ex1_ganeric.Audio;
import ex1_ganeric.DeviceManager;
import ex1_ganeric.Tv;

public class Main {
    public static void main(String[] args) {
        // 1. 제네릭 클래스 Box 객체 생성 (T를 String으로 결정)
        Box<String> box = new Box<>();
        
        // T 타입(String) 사용
        box.setItem("안녕하세요");
        System.out.println("Box의 아이템: " + box.geTItem());
        
        System.out.println("-------------------------");

        // 2. 제네릭 메서드 print 호출 (U 타입을 사용)
        // 제네릭 메서드는 호출 시점에 타입이 결정됩니다.
        
        box.print(123);           // U가 Integer로 추론됨
        box.print(3.14);          // U가 Double로 추론됨
        box.print("Hello Method"); // U가 String으로 추론됨
        box.print(true);          // U가 Boolean으로 추론됨
        
        System.out.println("-------------------------");

        // 3. 다른 타입의 Box 생성 (T를 Integer로 결정)
        Box<Integer> intBox = new Box<>();
        intBox.setItem(999);
        System.out.println("intBox의 아이템: " + intBox.geTItem());
        
        // 클래스 타입(T)은 Integer이지만, 메서드(U)에는 여전히 아무 타입이나 가능!
        intBox.print("나는 숫자박스지만 메서드는 문자열을 받지");
        
        AnimalHospital<Dog> dogHospital = new AnimalHospital<Dog>(new Dog());
        AnimalHospital<Cat> catHospital = new AnimalHospital<Cat>(new Cat());
        
        //동물병원은 동물만 다루는 곳인데
        //문자열이나 숫자 다른 객체가 들어오면 이상해진다
        dogHospital.treat();
        catHospital.treat(); 
        
        DeviceManager<Tv> tvManager = new DeviceManager<Tv>(new Tv());
        DeviceManager<Audio> audioManager = new DeviceManager<Audio>(new Audio());
        
        
        
        tvManager.powerOn();
        audioManager.powerOn();
    }
}
