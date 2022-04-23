package dev.lambdas.myfunc;

/**
 * 没有参数，只有一个返回值的函数式接口
 * @param <R>
 */
@FunctionalInterface
public interface ParamZeroReturnOne<R> {
    R test();
}
