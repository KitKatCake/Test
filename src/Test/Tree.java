package Test;

import java.util.Hashtable;
import java.util.TreeMap;
import java.util.TreeSet;

public class Tree {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("C");

        treeSet.add("C");

        System.out.println(treeSet);

        System.out.println(treeSet.getClass());

        Hashtable<Integer, String> h =
                new Hashtable<Integer, String>();

        Hashtable<Integer, String> h1 =
                new Hashtable<Integer, String>();

        h.put(3, "Geeks");
        h.put(2, "forGeeks");
        h.put(1, "isBest");

        h1 = (Hashtable<Integer, String>)h.clone();

        System.out.println("values in clone: " + h1);

        h.clear();

        System.out.println("after clearing: " + h);





    }
}
