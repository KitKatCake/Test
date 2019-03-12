public class Fish extends Animal {
    @Override
    public void eat(Animal animal) {
        System.out.println("Fish eat gress");
    }

    @Override
    public void breath(Animal animal) {
        System.out.println("Fish breath water");
    }
}
