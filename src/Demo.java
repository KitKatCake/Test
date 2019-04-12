import org.javatuples.Pair;


public class Demo {
    public static void main(String[] args) {
//        Jedis jedis = new Jedis("localhost");
//
//        System.out.println("连接成功");
//
//        System.out.println("服务器正在运行: "+jedis.ping());
//
//        jedis.select(1);
//
//        jedis.set("test","key");
//
//        System.out.println(jedis.get("test"));
//
//        System.out.println(jedis.dbSize());

//        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//        for (String i : cars) {
//            System.out.println(i);
//        }

       // Stream.of("Volvo", "BMW", "Ford", "Mazda").forEach(System.out::println);

//        Quintet<Integer, String, String, Double, Boolean> quintet
//                = Quintet.with(Integer.valueOf(1),
//                "GeeksforGeeks",
//                "A computer portal",
//                Double.valueOf(20.18),
//                true);
//
//        System.out.println(quintet);

        Pair<Integer, String> pair = new Pair<Integer, String>(
                Integer.valueOf(1), "Geeks");

        System.out.println(pair);

        System.out.println(pair.getValue0());
        System.out.println(pair.getValue1());

        System.out.println(pair.setAt0(3));

        //System.out.println(pair.getValue0());

        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] >= 5)
            {
                System.out.println("exit...");

                System.exit(0);
            }
            else
                System.out.println("arr["+i+"] = " +
                        arr[i]);
        }
        System.out.println("End of Program");




    }
}
