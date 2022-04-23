# Java中的Lambda

## 背景
```text
Lambda 表达式是Java8中引入的一个重要特性。
Lambda 表达式允许通过表达式来代替功能接口。
Lambda 表达式和方法一样，提供了一个正常的参数列表和一个使用这些参数的方法体
Lambda 表达式可以看作是一个匿名函数，基于数学的λ演算得名，也可称为闭包(Closure)。
```
## Lambda表达式语法
```text
基本语法：
    (parameters) -> express; 或 (parameters) -> {statements};
    
1.parameters:类似方法的形参列表，改参数是函数式接口中的参数。这里的参数类型可以明确的声明也可以不声明。不声明的话会由JVM隐含推断。当只有一个推断类型时候
可以省略括号。
2. -> :可理解为被用于
3. 方法体:可以是表达式或一个代码块，是函数式接口中方法的实现。代码块即可返回值也可不返回  
    例如： 
            1. 无参数，返回值为2
                () -> 2;
            2.  接收一个参数，返回它的2倍
                x -> 2*x;
            3.  接收两个参数，返回他们的和
                (x,y) -> x+y;
            4.  接收一个String对象，在控制台打印输出
                (String s) -> System.out.println(s);
```

## Functional Interface(函数式接口)
```text
函数式接口的定义：有且只有一个抽象方法的接口。
注意：@Functional注解若声明在一个接口上，表示改接口是一个函数式接口，编译器会按照函数式接口的定义来要求该接口，如果该
接口存在多个抽象方法，则会报错。也可以不加该注解，加上的作用只是标识一下，且编译器会进行检查。
```
例如一下都是函数式接口：
```java
@FunctionalInterface
public interface MyFunction{
    void test();
}

@FunctionalInterface
public interface MyFunction2{
    void test();
    default void hello(){
        System.out.println("JDK8新特性，接口中可以使用default方法声明默认实现方法");
    }
}
```

## Lambda表达式语法简写
```text
1.参数类型可以省略，如果省略全部都要省略
2.参数的小括号只有一个参数，那么小括号可以省略
3.方法体只有一句代码，大括号可以省略
4.方法体只有一条语句，且是返回值语句，可以直接省略return关键字
```

## 变量捕获(*****)
