import java.util.AbstractList;
import java.util.LinkedList;
import java.util.stream.Stream;

public class AbstractListDemo {
    public static void main(String[] args) {
        AbstractList<String> list = new LinkedList<>();
        list.add("Geeks");
        list.add("for");
        list.add("Geeks");
        list.add("10");
        list.add("20");
//        Stream.of(list).forEach(System.out::println);
        System.out.println("AbstractList:" + list);
    }
}
