package pkg.a;

public class AChildInA extends A{


    /**
     * 可以在子类中调用父类的 public protected default修饰的成员
     */
    public static void testParentStaticMethod(){
        // 可在子类的静态方法中访问父类的静态 public protected default 方法
        publicStaticField = "publicStaticField In AChild";
        protectedStaticFiled = "protectedStaticField In AChild";
        defaultStaticField = "defaultStaticField In AChild";

        // 可在子类的static方法中调用父类的public protected default 方法
        publicStaticMethod();
        protectedStaticMethod();
        defaultStaticMethod();
    }

    public void testParentMethod(){
        // 可以在子类实例中访问父类 public protected default 属性
        publicField = "publicField In AChild instance";
        protectedField = "protectedField In AChild instance";
        defaultField = "defaultFiled In AChild instance";

        // 可以在子类实例中访问父类 的静态 public protected default 属性
        publicStaticField = "publicStaticField In AChild instance";
        //...

        // 可以在子类实例方法中访问父类实例public protected default实例方法
        publicMethod();

    }

    /**
     * 可以在子类中重写父类的 public protected default方法
     */

    @Override
    void defaultMethod() {
        super.defaultMethod();
    }

    @Override
    protected void protectedMethod() {
        super.protectedMethod();
    }

    @Override
    public void publicMethod() {
        super.publicMethod();
    }
}
