package ex1_lambda;

import java.util.List;

public class UserService {
   
    public UserFilter getFilter(String type) {
        return switch (type) {
            case "adult" -> (u) -> u.age >= 20;
            case "seoul" -> (u) -> u.city.equals("서울");
            case "kim"   -> (u) -> u.name.startsWith("김");
            default      -> (u) -> true;
        };
    }

    
    public void filterUsers(List<User> list, UserFilter filter) {
        for (User u : list) {
            if (filter.test(u)) {
                System.out.println(u);
            }
        }
    }
}