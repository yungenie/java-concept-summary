/**
 * Try-Catch문 RuntimeException 예제
 *
 * @author  Yunjin
 * @since   JDK1.8
 */

public class TryCatchRuntimeException extends Hi{
    public static void main(String[] args) {
        try {
            Hi hi = (Hi) new TryCatchRuntimeException();
        } catch (RuntimeException e){
            System.out.println("RuntimeException 발생!!");
            e.printStackTrace();
        }
    }
}

class Hi {
    void hi(){
        System.out.println("hii");
    }
}