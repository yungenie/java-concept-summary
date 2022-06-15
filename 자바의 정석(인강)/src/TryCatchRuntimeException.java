/**
 * try-catch RuntimeException 예제
 *
 * @author  Yunjin
 * @since   JDK1.8
 */
class TryCatchRuntimeException extends Hello{
    public static void main(String[] args) {
        System.out.println("Hello");

        try {
            TryCatchRuntimeException tryCatchRuntimeException = (TryCatchRuntimeException) new Hello();
        } catch (RuntimeException e1){
            System.out.println("RuntimeException 발생!!");
            //e1.printStackTrace();
            //e1.getMessage();
            System.out.println(e1.getMessage());
            System.out.println(e1.getStackTrace());
        }
    }
}

class Hello {
    void hi(){
        System.out.println("hii");
    }
}