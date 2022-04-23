package dev.lambdas.myfunc;

/**
 * 一个参数，一个返回值的函数式接口
 * @param <T>
 * @param <R>
 */
@FunctionalInterface
public interface ParamOneReturnOne <T,R>{
    R test(T t);
}
