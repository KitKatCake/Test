public class Main {
    public static void main(String[] args) {
       // System.out.println("Hello Java!");

        Thread t =new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("This is a Thread!");
            }
        });



    }
}
