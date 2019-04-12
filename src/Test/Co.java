package Test;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class Co {
    public static void main(String[] args) {
        Collection<String> col = new ArrayList<>();

        ((ArrayList<String>) col).add("123");
        ((ArrayList<String>) col).add("456");
        ((ArrayList<String>) col).add("789");

        Iterator iterator = col.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
