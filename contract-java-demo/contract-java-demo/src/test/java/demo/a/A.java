package demo.a;

import demo.b.B;

public class A extends B {
    private int i = 0;
    private int k = 5;

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.i);
    }
}
