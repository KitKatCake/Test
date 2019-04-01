import redis.clients.jedis.Jedis;

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

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
