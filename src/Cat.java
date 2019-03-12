public class Cat extends Animal {
    @Override
    public void eat(Animal animal) {
        System.out.println("Cat eat mouse");
    }

    @Override
    public void breath(Animal animal) {
        System.out.println("Cat breath air");
    }
}
