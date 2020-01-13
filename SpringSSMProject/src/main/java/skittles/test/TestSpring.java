package skittles.test;

import org.junit.Test;


public class TestSpring {
    @Test
    public void test1() {
        Test11 test11 = new Test11(22);
        Test11 test22 =test11;
        System.out.println(test22.i);
        test11.setI(33);
        System.out.println(test22.i);
        int a =test22.i;
        test11.setI(44);
        System.out.println(a);
    }
}
class Test11{
    int i;


    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public Test11(int i) {
        this.i = i;

    }
}