package ex4_setter_getter;

public class Student {

    private String name;
    private int age;

    // set 뒤의 첫 글자는 대문자 (setName)
    public void setName(String name) {
    	this.name = name;
    }

    
    public String getName() {
        return name;
    }

    public void setAge(int age) {
    	if(age >= 0 ) {
    		this.age = age;
    		
    	}else {
    		System.out.println("잘못된 나이 입니다.");
    	}
        
    }

    // 나이를 반환해야 하므로 name이 아닌 age를 리턴
    public int getAge() {
        return age;
    }
}

