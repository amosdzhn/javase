package pkg.b;

import pkg.a.A;

public class AppInB {
    public static void main(String[] args) {
        // 在其它包的非子类 只能访问本类的 public 成员
        A.publicStaticMethod();
        System.out.println(A.publicStaticField);

        A a = new A();
        a.publicMethod();
        System.out.println(a.publicField);


        AChildInB aChildInB = new AChildInB();
        aChildInB.test();
    }
}
