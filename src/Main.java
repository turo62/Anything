import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        NameRepository r = new NameRepository();
        
        Iterator it = r.getIterator();
        
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
}
