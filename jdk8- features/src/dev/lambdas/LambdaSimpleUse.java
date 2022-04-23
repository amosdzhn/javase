package dev.lambdas;

import dev.lambdas.myfunc.ParamOneReturnOne;
import dev.lambdas.myfunc.ParamOneReturnZero;
import dev.lambdas.myfunc.ParamZeroReturnOne;
import dev.lambdas.myfunc.ParamZeroReturnZero;

/**
 * 针对 myfunc包下自定义的函数式接口进行简单使用
 */
public class LambdaSimpleUse {
    public static void main(String[] args) {
        paramZeroReturnZero();
        paramZeroReturnOne();

        paramOneReturnZero();
        paramOneReturnOne();
    }

    private static void paramZeroReturnZero(){
        ParamZeroReturnZero func = () -> System.out.println("no args no return");
        func.test();
    }

    private static void paramZeroReturnOne(){
        ParamZeroReturnOne<Integer> func = () -> 20;
        Integer val = func.test();
        System.out.println(val);
    }

    private static void paramOneReturnZero(){
        ParamOneReturnZero<Integer> func = (age) -> System.out.println("one arg: "+ age + " no return");
        func.test(20);
    }

    private static void paramOneReturnOne(){
        ParamOneReturnOne<Integer,String> func = (x) -> String.valueOf(x + 20);
        String val = func.test(20);
        System.out.println(val);
    }
}
