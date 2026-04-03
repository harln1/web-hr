package customException.ex2_object;

public class Member2 {
	
	
	String id;
	String name;
	
	  public Member2(String id,String name) {
		
		this.id = id;
		this.name = name;
		
	}
	
	@Override
	public boolean equals(Object obj) {
        
        if (obj instanceof Member2) {
            Member2 target = (Member2) obj; 
            
            
            if (this.id.equals(target.id)) {
                return true;
            }
        }
        
        return false;
    }

}
