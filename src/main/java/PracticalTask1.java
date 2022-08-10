import java.util.HashMap;
import java.util.Map;

public class PracticalTask1 {
    public static void main(String[] args) {
        Map<User,Manager> map=new HashMap<>();
        User user=new User("Olga","Smirnova");
        User user1=new User("Vasilii","Ivanov");

        Manager manager=new Manager("Ivan",3);
        Manager manager1=new Manager("Oleg",4);

        map.put(user,manager);
        map.put(user1,manager1);
        System.out.println(map);

    }
}
