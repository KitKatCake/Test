public class Main {
    public static void main(String[] args) {
       // System.out.println("Hello Java!");

        Thread t =new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("This is a Thread!");
            }
        });

        Animal animal = new Cat();
        animal.eat(animal);
        animal.breath(animal);

        Animal animal2 = new Fish();
        animal2.eat(animal2);
        animal2.breath(animal2);


    }
}
