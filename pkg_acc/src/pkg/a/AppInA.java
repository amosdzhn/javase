package pkg.a;

public class AppInA {
    public static void main(String[] args) {

        // 可在同包中直接访问其他类的 public protected default 静态方法
        A.publicStaticMethod();
        A.defaultStaticMethod();
        A.protectedStaticMethod();

        // 可在同包中直接访问其他类的 public protected default 静态变量
        System.out.println(A.publicStaticField);
        System.out.println(A.protectedStaticFiled);
        System.out.println(A.defaultStaticField);

        // 可在同包中访问其他本包类实例的 public protected default 成员
        A a = new A();
        a.publicMethod();
        a.protectedMethod();
        a.defaultMethod();
        System.out.println(a.publicField);
        System.out.println(a.protectedField);
        System.out.println(a.defaultField);
    }
}
