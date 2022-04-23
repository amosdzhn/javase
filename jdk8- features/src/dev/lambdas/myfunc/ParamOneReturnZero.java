package dev.lambdas.myfunc;

/**
 * 一个参数，无返回值的函数式接口
 * @param <T>
 */
@FunctionalInterface
public interface ParamOneReturnZero<T> {
    void test(T t);
}
