package exp;

public class Application {
    public static void main(String[] args) {
       int a = 10;
//       method1(a);
//        method2(a);
        //IOException是检查型异常，需要进行处理
        try {
            method3(a);
        } catch (MyIOException e) {
            e.printStackTrace();
        }
    }

    // RuntimeException 是非检查型异常
    public static void method1(int a){
        if( a < 20){
            throw new MyRuntimeException("a不能小于20",new MyRuntimeException("a不能小于20的原因"));
        }
    }

    public static void method2(int a){
        if( a<30){
            throw new MyError("a小于30是错误的");
        }
    }

    public static void method3(int a) throws MyIOException {
        if( a < 40){
            throw new MyIOException("a不能小于40");
        }
    }
}
