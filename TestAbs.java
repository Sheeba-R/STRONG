abstract class Abs {
    
    abstract void add(int a);
    abstract void sub(int a, int b);
    abstract void div(int a, int b);
}

class TestAbs extends Abs {

    void add(int a) {
        System.out.println(a);
    }

    void sub(int a, int b) {
        System.out.println(a - b);
    }

    void div(int a, int b) {
        System.out.println(a / b);
    }

    public static void main(String[] ar) {

        Abs a = new TestAbs();

        a.add(1);
        a.sub(12, 2);
        a.div(12, 2);
    }
}