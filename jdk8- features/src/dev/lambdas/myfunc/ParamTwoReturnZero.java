package dev.lambdas.myfunc;

/**
 * 两个参数无返回值的函数式接口
 * @param <X>
 * @param <Y>
 */
@FunctionalInterface
public interface ParamTwoReturnZero<X,Y> {
    void test(X x,Y y);
}
