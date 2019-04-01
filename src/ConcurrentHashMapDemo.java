import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo extends Object{
    public static void main(String[] args) {
        ConcurrentHashMap m = new ConcurrentHashMap<>();
        m.put(100,"Hello");
        m.put(101,"Geeks");
        m.put(102,"Geeks");
        m.putIfAbsent(101,"Geeks");
        m.remove(101,"Hello");


    }
}
