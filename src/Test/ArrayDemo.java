package Test;

import java.util.Arrays;
import java.util.List;

public class ArrayDemo {
    public static void main(String[] args) {

        String a[] = new String[]{"abc","klm","xyz","pqr"};

        List list = Arrays.asList(a);

        System.out.println("The list is:" +list);

        System.out.println(list.getClass());
    }
}
