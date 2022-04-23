package dev.lambdas.myfunc;

/**
 * 多个参数，一个返回值的函数式接口
 * @param <R>
 * @param <X>
 * @param <Y>
 */
@FunctionalInterface
public interface ParamTwoReturnOne <R,X,Y>{
    R test(X x,Y y);
}
