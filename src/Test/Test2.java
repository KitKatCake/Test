package Test;

public class Test2 {
    int x,y;
    Test2(){
        x = 10;
        y = 20;
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();

        System.out.println(test2.x+" "+test2.y);

        Test2 test21 = test2;

        test21.x = 100;

        System.out.println(test2.x+" "+test2.y);
        System.out.println(test21.x+" "+test21.y);
    }
}
