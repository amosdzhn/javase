package pkg.b;

import pkg.a.A;

public class AChildInB extends A {

    public static void testStatic(){

        // 在其他包的子类中 可以访问当前类的 public protected修饰的成员
        publicStaticMethod();
        protectedStaticMethod();

        System.out.println(publicStaticField);
        System.out.println(protectedStaticFiled);
    }

    public void test(){

        // 可以在其他包的子类中访问当前类的 public protected 的静态非静态成员
        publicStaticMethod();
        protectedMethod();

        publicMethod();
        protectedMethod();

        System.out.println(publicField);
        System.out.println(protectedField);

        System.out.println(publicStaticField);
        System.out.println(protectedStaticFiled);
    }
}
