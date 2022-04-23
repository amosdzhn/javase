package dev.lambdas;

/**
 * Lambda表达式快速入门
 */
public class LambdaQuickStart {
    public static void main(String[] args) {
        Runnable r = ()->{
            System.out.println("hello lambda");
        };

        Thread t = new Thread(r);
        t.start();
    }
}
