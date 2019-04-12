package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test3 {
   static <T> void genericDisplay (T element){
       System.out.println(element.getClass().getName() + " = " + element);
   }

    public static void main(String[] args) {

        genericDisplay(11);

        genericDisplay("GeeksForGeeks");

        genericDisplay(1.0);

        ArrayList al = new ArrayList();

        al.add("Sachin");
        al.add("Rahul");
        al.add(10);

        String s1 = (String)al.get(0);
        System.out.println(s1);
        String s2 = (String)al.get(1);
        System.out.println(s2);
        Object s3 = (Object)al.get(2);
        System.out.println(s3);
        List<Integer> list1= Arrays.asList(4,5,6,7);

        System.out.println(list1.getClass());

        System.out.println("Total sum is:"+sum(list1));
        System.out.println(list1);

        List<Double> list2=Arrays.asList(4.1,5.1,6.1);

        System.out.println("Total sum is:"+sum(list2));


        List<Integer> list3= Arrays.asList(1,2,3);

        List<Double> list4=Arrays.asList(1.1,2.2,3.3);

        printlist(list3);

        printlist(list4);


        List<Integer> list5 = Arrays.asList(4,5,6,7);

        printOnlyIntegerClassorSuperClass(list5);

        //Number list
        List<Number> list6 = Arrays.asList(4,5,6,7);

        printOnlyIntegerClassorSuperClass(list6);

    }
    private static double sum(List<? extends Number>list){
       double sum = 0.0;
       for(Number number:list){
           sum += number.doubleValue();
       }
       return sum;
    }
    private static void printlist(List<?> list){
        System.out.println(list);
    }

    private static void printOnlyIntegerClassorSuperClass(List<? super Integer> list){
        System.out.println(list);
    }
}
