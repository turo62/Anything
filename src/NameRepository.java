import java.util.*;

public class NameRepository {
    
    private String[] names;
    
    public NameRepository() {
        names = new String[10];
        
        for (int i = 0; i < 10; i++) {
            names[i] = "van";
        }
    }
    
    private class NameIterator implements Iterator {
        private int index = 0;
        public boolean hasNext() {
            if (index < names.length) {
                index++;
                return true;
            }
            return false;
        }
        
        public Object next() {
            return names[index];
        }
    }
    
    public Iterator getIterator() {
        return new NameIterator();
    }
}
